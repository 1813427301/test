package com.oaec.how.service.serviceImpl;

import com.oaec.how.dao.UsersDao;
import com.oaec.how.dao.impl.UsersImpl;
import com.oaec.how.entity.Users;
import com.oaec.how.service.UsersService;

import java.util.List;

public class UsersServiceImpl implements UsersService {
    private UsersDao  usersDao;

    public UsersServiceImpl(){
        usersDao = new UsersImpl();
    }
    @Override
    public List<Users> findAll() {
        return usersDao.findAll();
    }

    @Override
    public Users findById(long id) {
        return usersDao.findById(id);
    }

    @Override
    public Users findByName(String name) {
        return usersDao.findByName(name);
    }

    @Override
    public int update(Users user) {
        return usersDao.update(user);
    }


    @Override
    public int delete(long[] ids) {
        return usersDao.delete(ids);
    }

    @Override
    public long create(Users user) {
        return usersDao.create(user);
    }
}
