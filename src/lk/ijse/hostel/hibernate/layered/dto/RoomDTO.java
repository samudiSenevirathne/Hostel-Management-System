package lk.ijse.hostel.hibernate.layered.dto;

public class RoomDTO {
    private String id;
    private String type;
    private String key_money;
    private int qty;

    public RoomDTO() {

    }

    public RoomDTO(String id, String type, String key_money, int qty) {
        this.id = id;
        this.type = type;
        this.key_money = key_money;
        this.qty = qty;
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

    @Override
    public String toString() {
        return "RoomDTO{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", key_money='" + key_money + '\'' +
                ", qty=" + qty +
                '}';
    }
}
