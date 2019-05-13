package com.oaec.how.service;

import com.oaec.how.entity.Users;

import java.util.List;

public interface UsersService {
    public List<Users> findAll();
    public Users findById(long id);
    public Users findByName(String name);
    public int update(Users user);
    public int delete(long[] ids);
    public long create(Users user);
}
