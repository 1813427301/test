package comoaec.how.test;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import util.HibernateUtil;

public class UsersTest {
    private Session session;

    @Before
    public void getSessionFactory(){
        session = HibernateUtil.getSession();
        session.beginTransaction();//开启事务
    }
    @After
    public void getClose(){
        session.getTransaction().commit();//提交事务
        HibernateUtil.closeSession(session);
    }

}
