package lk.ijse.hostel.hibernate.layered.dto;

public class UserDTO {
    private String username;
    private String name;
    private String tele;
    private double salary;
    private String password;
    private String address;
    private String dob;
    private String gender;

    public UserDTO() {

    }

    public UserDTO(String username, String name, String tele, double salary, String password, String address, String dob, String gender) {
        this.username = username;
        this.name = name;
        this.tele = tele;
        this.salary = salary;
        this.password = password;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    @Override
    public String toString() {
        return "UserDTO{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", tele='" + tele + '\'' +
                ", salary=" + salary +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
