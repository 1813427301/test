package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null){
            //自动读取hibernate.cfg.xml配置文件
            StandardServiceRegistry serviceRegistry =  new StandardServiceRegistryBuilder().configure().build();
            Metadata metadata = new MetadataSources(serviceRegistry).buildMetadata();
            //创建sessionFactory
            sessionFactory = metadata.getSessionFactoryBuilder().build();
        }
        return sessionFactory;
    }

    //获取session
    public static Session getSession(){
        return getSessionFactory().openSession();
    }

    //关闭session
    public static void closeSession(Session session){
        session.close();
    }

    public static void main(String[] args) {
        System.out.println(HibernateUtil.getSessionFactory());
    }

}
