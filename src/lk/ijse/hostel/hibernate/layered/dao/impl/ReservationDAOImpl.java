package lk.ijse.hostel.hibernate.layered.dao.impl;

import lk.ijse.hostel.hibernate.layered.dao.custom.ReservationDAO;
import lk.ijse.hostel.hibernate.layered.entity.Reservation;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ReservationDAOImpl implements ReservationDAO {

    private Session session;
    private static ReservationDAOImpl reservationDAOImpl;

    private ReservationDAOImpl() {}

    public static ReservationDAOImpl getInstance() {
        return null ==reservationDAOImpl
                ? reservationDAOImpl = new ReservationDAOImpl()
                : reservationDAOImpl;
    }

    @Override
    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public String save(Reservation reservation) {
        return (String) session.save(reservation);
    }

    @Override
    public void update(Reservation reservation) {
        session.update(reservation);
    }

    @Override
    public Reservation get(String id) {
        return session.get(Reservation.class, id);
    }

    @Override
    public void delete(Reservation reservation) {
        session.delete(reservation);
    }

    @Override
    public List<Reservation> getAll() {
//        String sqlQuery = "FROM reservation";
//        Query query = session.createQuery(sqlQuery);
//        List list = query.list();
//        session.close();
//        return list;
        return null;/*nikan damme*/
    }


}
