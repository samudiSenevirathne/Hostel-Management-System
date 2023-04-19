package lk.ijse.hostel.hibernate.layered.entity;

import javax.persistence.*;

@Entity
@Table(name="reservation")
public class Reservation {
    @Id
    @Column(name = "res_id")
    private String res_id;
    @EmbeddedId
    private ReservationPK reservationPK;
    @Column(name="date")
    private String date;
    @Column(name="status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "student_id", insertable = false,updatable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "room_type_id", insertable = false,updatable = false)
    private Room room;

}
