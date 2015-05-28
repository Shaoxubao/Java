package com.msm.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.msm.model.Pager;
import com.msm.model.User;
import com.msm.util.SystemContext;

// @Repository用于标注数据访问组件，即DAO组件
@Repository("userDao")
public class UserDao extends HibernateDaoSupport implements IUserDao {

    // 使用spring hibernate作为项目的框架，并且使用注解方式进行对象装载。
    // 在装载Dao对象的时候常常需要注入sessionFactory对象，通常的做法是Dao继承至HibernateDaoSuppor，
    // t然后在Dao中添加setSuperSessionFactory 方法进行注入的
    @Resource
    public void setSuperSessionFactory(SessionFactory sessionFactory) {
        this.setSessionFactory(sessionFactory);
    }
    
    @Override
    public void add(User user) {
        this.getHibernateTemplate().save(user);
    }

    @Override
    public void update(User user) {
        this.getHibernateTemplate().update(user);
    }

    @Override
    public void delete(int id) {
        User user = this.load(id);
        this.getHibernateTemplate().delete(user);
    }

    @Override
    public User load(int id) {
        return this.getHibernateTemplate().load(User.class, id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> list() {
        return this.getSession().createQuery("from User").list();
    }

    @Override
    public User loadByUsername(String username) {
        return (User)this.getSession().createQuery("from User where username=?")
                .setParameter(0, username).uniqueResult();
    }
    
    @Override
    public User loadByUserStaffId(String staffId) {
        return (User)this.getSession().createQuery("from User where staffId=?")
                .setParameter(0, staffId).uniqueResult();
    }

    @SuppressWarnings("unchecked")
    @Override
    public Pager<User> find() {
        int size = SystemContext.getSize();
        int offset = SystemContext.getOffset();
        
        Query query = this.getSession().createQuery("from User"); // HQL(Hibernate Query Language)查询
        query.setFirstResult(offset).setMaxResults(size);
        List<User> datas = query.list();
        
        Pager<User> us = new Pager<User>();
        us.setDatas(datas);
        us.setOffset(offset);
        us.setSize(size);
        long total = (Long)this.getSession()
                    .createQuery("select count(*) from User").uniqueResult();
        us.setTotal(total);
        
        return us;
    }

}
