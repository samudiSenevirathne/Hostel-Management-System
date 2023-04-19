package lk.ijse.hostel.hibernate.layered.dao.impl;

import lk.ijse.hostel.hibernate.layered.dao.custom.RoomDAO;
import lk.ijse.hostel.hibernate.layered.entity.Room;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class RoomDAOImpl implements RoomDAO {

    private Session session;
    private static RoomDAOImpl roomDAOImpl;

    private RoomDAOImpl() {}

    public static RoomDAOImpl getInstance() {
        return null ==roomDAOImpl
                ? roomDAOImpl = new RoomDAOImpl()
                : roomDAOImpl;
    }

    @Override
    public void setSession(Session session) {
      this.session=session;
    }

    @Override
    public String save(Room room) {
        return (String) session.save(room);
    }

    @Override
    public void update(Room room) {
        session.update(room);
    }

    @Override
    public Room get(String id) {
        return session.get(Room.class, id);
    }

    @Override
    public void delete(Room room) {
        session.delete(room);
    }

    @Override
    public List<Room> getAll() {
//        String sqlQuery = "FROM room";
//        Query query = session.createQuery(sqlQuery);
//        List list = query.list();
//        session.close();
//        return list;
        return null;/*nikan damme*/
    }


}
