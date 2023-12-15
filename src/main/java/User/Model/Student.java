package User.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
    int id;
    @Id
    @Column(unique = true)
    String name;
    int classname;
    int rollno;

    public Student() {
    }
    public Student(int id, String name, int classname, int rollno) {
        this.id = id;
        this.name = name;
        this.classname = classname;
        this.rollno = rollno;
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

    public int getClassname() {
        return classname;
    }

    public void setClassname(int classname) {
        this.classname = classname;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}
