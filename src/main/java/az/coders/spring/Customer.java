package az.coders.spring;

import org.springframework.stereotype.Component;

@Component
public class Customer implements User{
    private  int id;
    private String fullName;

    public Customer(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Customer() {
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
        return "az.coders.spring.Customer{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
