package lk.ijse.hostel.hibernate.layered.dao.impl;

import lk.ijse.hostel.hibernate.layered.dao.custom.StudentDAO;
import lk.ijse.hostel.hibernate.layered.entity.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    private Session session;
    private static StudentDAOImpl studentDAOImpl;

    private StudentDAOImpl() {}

    public static StudentDAOImpl getInstance() {
        return null ==studentDAOImpl
                ? studentDAOImpl = new StudentDAOImpl()
                : studentDAOImpl;
    }

    @Override
    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public String save(Student student) {
        return (String) session.save(student);
    }

    @Override
    public void update(Student student) {
        session.update(student);
    }

    @Override
    public Student get(String id) {
        return session.get(Student.class, id);
    }

    @Override
    public void delete(Student student) {
        session.delete(student);
    }

    @Override
    public List<Student> getAll() {
//        String sqlQuery = "FROM student";
//        Query query = session.createQuery(sqlQuery);
//        List list = query.list();
//        session.close();
//        return list;
           return null;/*nikan damme*/
    }

}
