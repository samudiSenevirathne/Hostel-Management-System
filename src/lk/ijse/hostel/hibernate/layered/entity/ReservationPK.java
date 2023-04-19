package lk.ijse.hostel.hibernate.layered.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ReservationPK implements Serializable {
    @Column(name="student_id")
    private String student_id;

    @Column(name="room_type_id")
    private String room_type_id;
}
