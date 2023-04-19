package lk.ijse.hostel.hibernate.layered.dao.impl;

import lk.ijse.hostel.hibernate.layered.dao.custom.UserDAO;
import lk.ijse.hostel.hibernate.layered.entity.User;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class UserDAOImpl implements UserDAO {

    private Session session;
    private static UserDAOImpl userDAOImpl;

    private UserDAOImpl() {}

    public static UserDAOImpl getInstance() {
        return null ==userDAOImpl
                ? userDAOImpl = new UserDAOImpl()
                : userDAOImpl;
    }


    @Override
    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public String save(User user) {
        return (String) session.save(user);
    }

    @Override
    public void update(User user) {
        session.update(user);
    }

    @Override
    public User get(String id) {
        return session.get(User.class, id);
    }

    @Override
    public void delete(User user) {
        session.delete(user);
    }

    @Override
    public List<User> getAll() {
//        String sqlQuery = "FROM user";
//        Query query = session.createQuery(sqlQuery);
//        List list = query.list();
//        session.close();
//        return list;
        return null;/*nikan damme*/
    }


}
