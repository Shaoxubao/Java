package com.msm.dao;

import java.util.List;

import com.msm.model.Pager;
import com.msm.model.User;

public interface IUserDao {
    
    public void add(User user);
    public void update(User user);
    public void delete(int id);
    public User load(int id);
    public List<User> list();
    public Pager<User> find();
    public User loadByUsername(String username);
    public User loadByUserStaffId(String staffId);
}
