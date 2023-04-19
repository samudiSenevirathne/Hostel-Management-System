package lk.ijse.hostel.hibernate.layered.entity;

import lk.ijse.hostel.hibernate.layered.embedded.StudentName;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
public class Student implements Serializable {
    @Id
    @Column(name = "student_id")
    private String id;
    private StudentName name;
    @Column(name = "address")
    private String address;
    @Column(name = "contact_no")
    private int contact;
    @Column(name = "dob")
    private String dob;
    @Column(name = "gender")
    private String gender;


    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "student")
    private List<Reservation>reservationList=new ArrayList<>();

    public Student() {

    }

    public Student(String id, StudentName name, String address, int contact, String dob, String gender, List<Reservation> reservationList) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.dob = dob;
        this.gender = gender;
        this.reservationList = reservationList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StudentName getName() {
        return name;
    }

    public void setName(StudentName name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name=" + name +
                ", address='" + address + '\'' +
                ", contact=" + contact +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", reservationList=" + reservationList +
                '}';
    }
}

