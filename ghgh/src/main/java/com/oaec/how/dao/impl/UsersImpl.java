package com.oaec.how.dao.impl;

import com.oaec.how.dao.UsersDao;
import com.oaec.how.entity.Users;
import com.oaec.how.test.UsersTest;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtil;

import java.util.List;

public class UsersImpl implements UsersDao {

    private UsersTest usersTest;
    private static Session session;
    public UsersImpl(){

        usersTest = new UsersTest();
        session = usersTest.getSessionFactory();
    }
    @Override
    public List<Users> findAll() {
        String hql="FROM Users WHERE status=1";
        Query<Users> query = session.createQuery(hql, Users.class);
        query.setCacheable(true);
        List<Users> usersList = query.list();
        return usersList;
    }

    @Override
    public Users findById(long id) {
        String hql="FROM Users WHERE id=:id and status=1";
        Query<Users> query = session.createQuery(hql, Users.class);
        Users user = query.setParameter("id", id).uniqueResult();
        usersTest.getClose();
        return user;
    }

    @Override
    public Users findByName(String name) {
        String hql="FROM Users WHERE userName=:userName and status=1";
        Query<Users> query = session.createQuery(hql, Users.class);
        query.setCacheable(true);
        Users user = query.setParameter("userName", name).uniqueResult();
        usersTest.getClose();
        return user;
    }

    @Override
    public int update(Users user) {
       try {
           session.update(user);
           usersTest.getClose();
       }catch (Exception e){
           return 0;
       }
        return 1;
    }


    @Override
    public int delete(long[] ids) {
        try {

            for (int i=0;i<ids.length;i++){
                Users user =session.get(Users.class,ids[i]);
                session.delete(user);
            }
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            return 0;
        }
        return 1;
    }

    @Override
    public long create(Users user) {
        long id = (long)session.save(user);
        usersTest.getClose();
        return id;
    }

    public static void main(String[] args) {
        long[] longs = new long[2];
        longs[0]=4;
        longs[1]=3;
        Users user = new Users();
        user.setId(1L);
        user.setPassword("123456");
        user.setGender("nan");
        user.setUserName("谢宏历1");
        Users all = new UsersImpl().findByName("谢宏历1");
        System.out.println(all.toString());
        Users all2 = new UsersImpl().findByName("谢宏历1");
        System.out.println(all2.toString());

    }
}
