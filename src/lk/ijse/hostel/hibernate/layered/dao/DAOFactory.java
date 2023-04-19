package lk.ijse.hostel.hibernate.layered.dao;

import lk.ijse.hostel.hibernate.layered.dao.impl.*;

public class DAOFactory {
    public static DAOFactory daoFactory;

    private DAOFactory() {

    }

    public static DAOFactory getDaoFactory() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public enum DAOType {
        STUDENT, ROOM, RESERVATION,USER,QUERY
    }

    public SuperDAO getDao(DAOType type) {
        switch (type) {
            case STUDENT:
                return StudentDAOImpl.getInstance();
            case ROOM:
                return  RoomDAOImpl.getInstance();
            case RESERVATION:
                return ReservationDAOImpl.getInstance();
            case USER:
                return UserDAOImpl.getInstance();
            case QUERY:
                return QueryDAOImpl.getInstance();
            default:
                return null;
        }
    }
}
