package sample.model;

public class TeachersModel {

    private int id;
    private String name;
    private String department;
    private String address;
    private String phoneNumber;

    public TeachersModel(String name, String department, String address, String phoneNumber) {
        this.name = name;
        this.department = department;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public TeachersModel(int id, String name, String department, String address, String phone) {
        this(name, department,address, phone);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
