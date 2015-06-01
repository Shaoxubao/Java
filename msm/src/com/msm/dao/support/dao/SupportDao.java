package com.msm.dao.support.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.msm.model.Pager;
import com.msm.model.ReferenceReg;
import com.msm.util.SystemContext;

@Repository("supportDao")
public class SupportDao extends HibernateDaoSupport implements ISupportDao {

	@Resource
	public void setSuperSessionFactory(SessionFactory sessionFactory) {
		this.setSessionFactory(sessionFactory);
	}

	@Override
	public void add(ReferenceReg reference) {
		this.getHibernateTemplate().save(reference);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Pager<ReferenceReg> find() {

		int size = SystemContext.getSize();
		int offset = SystemContext.getOffset();

		Query query = this.getSession().createQuery("from ReferenceReg");
		query.setFirstResult(offset).setMaxResults(size);
		List<ReferenceReg> datas = query.list();

		Pager<ReferenceReg> pr = new Pager<ReferenceReg>();
		pr.setDatas(datas);
		pr.setOffset(offset);
		pr.setSize(size);
		long total = (long) this.getSession().createQuery("select count(*) from ReferenceReg").uniqueResult();
		pr.setTotal(total);

		return pr;
	}

}
