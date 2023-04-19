package lk.ijse.hostel.hibernate.layered.dao.impl;

import lk.ijse.hostel.hibernate.layered.dao.custom.QueryDAO;
import org.hibernate.Session;

public class QueryDAOImpl implements QueryDAO {

    private Session session;
    private static QueryDAOImpl queryDAOImpl;

    private QueryDAOImpl() {}

    public static QueryDAOImpl getInstance() {
        return null ==queryDAOImpl
                ? queryDAOImpl = new QueryDAOImpl()
                : queryDAOImpl;
    }

    @Override
    public void setSession(Session session) {
        this.session=session;
    }
}
