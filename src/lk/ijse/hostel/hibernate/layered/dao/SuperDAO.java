package lk.ijse.hostel.hibernate.layered.dao;

import org.hibernate.Session;

public interface SuperDAO {

    void setSession(Session session);
}
