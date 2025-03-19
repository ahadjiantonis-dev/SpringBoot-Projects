package gr.uom.studentcourse.model;

public class Student {

    /* Business Logic Only */
    private int id;
    private String name;
    private String password;

    public Student(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    /*Name Setter/Getter */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*ID Setter/Getter */
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }



}
