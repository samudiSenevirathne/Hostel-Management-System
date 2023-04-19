package lk.ijse.hostel.hibernate.layered.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @Column(name = "room_type_id")
    private String id;
    @Column(name = "type")
    private String type;
    @Column(name = "key_money")
    private String key_money;
    @Column(name = "qty")
    private int qty;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "room")
    private List<Reservation> reservationList=new ArrayList<>();

    public Room() {

    }

    public Room(String id, String type, String key_money, int qty, List<Reservation> reservationList) {
        this.id = id;
        this.type = type;
        this.key_money = key_money;
        this.qty = qty;
        this.reservationList = reservationList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey_money() {
        return key_money;
    }

    public void setKey_money(String key_money) {
        this.key_money = key_money;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", key_money='" + key_money + '\'' +
                ", qty=" + qty +
                ", reservationList=" + reservationList +
                '}';
    }

}
