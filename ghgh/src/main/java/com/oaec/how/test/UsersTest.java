package com.oaec.how.test;

import org.hibernate.Session;
import util.HibernateUtil;

public class UsersTest {
    private Session session;

    public Session getSessionFactory(){
        session = HibernateUtil.getSession();
        session.beginTransaction();//开启事务
        return session;
    }
    public void getClose(){
        session.getTransaction().commit();//提交事务
        HibernateUtil.closeSession(session);
    }

}
