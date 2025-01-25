package az.coders.spring;

import org.springframework.stereotype.Component;

@Component
public class Employer implements User {
    private  int id;
    private String fullName;
    private String password;

    public Employer(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Employer(int id) {
        System.out.println("id constructor");
        this.id = id;
    }

    public Employer(String fullName) {
        System.out.println("fullName constructor");
        this.fullName = fullName;
    }

    public Employer(String fullName, String password) {
        this.fullName = fullName;
        this.password = password;
    }


    public Employer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "az.coders.spring.Employer{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
