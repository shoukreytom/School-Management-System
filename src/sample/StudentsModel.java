package sample;

public class StudentsModel {

    private int id;
    private String name;
    private String className;
    private String address;
    private String phone;

    public StudentsModel(String name, String className, String address, String phone) {
        this.name = name;
        this.className = className;
        this.address = address;
        this.phone = phone;
    }

    public StudentsModel(int id, String name, String className, String address, String phone) {
        this(name, className, address, phone);
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
