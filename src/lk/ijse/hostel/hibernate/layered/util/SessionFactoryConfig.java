package lk.ijse.hostel.hibernate.layered.util;

import lk.ijse.hostel.hibernate.layered.entity.Reservation;
import lk.ijse.hostel.hibernate.layered.entity.Room;
import lk.ijse.hostel.hibernate.layered.entity.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryConfig{

    private static SessionFactoryConfig factoryConfiguration;
    private final SessionFactory sessionFactory;

    private SessionFactoryConfig() {
        sessionFactory = new Configuration()
                .mergeProperties(Utility.getProperties())
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Room.class)
                .addAnnotatedClass(Reservation.class)
                .buildSessionFactory();
    }

    public static SessionFactoryConfig getInstance() {
        return (null == factoryConfiguration)
                ? factoryConfiguration = new SessionFactoryConfig()
                : factoryConfiguration;
    }

    public Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }

}
