package com.msm.service;

import java.util.List;

import com.msm.model.Pager;
import com.msm.model.User;

public interface IUserService {
    public void add(User user);
    public void update(User user);
    public void delete(int id);
    public User load(int id);
    public List<User> list();
    public Pager<User> find();
    public User login(String username, String password);
    public User loadByUsername(String username);
    public User loadByUserStaffId(String staffId);
}
