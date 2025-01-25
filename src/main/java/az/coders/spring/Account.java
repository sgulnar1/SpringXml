package az.coders.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Account {
    private int id;
    private String account;
    @Autowired
    @Qualifier("employer")
    private User user;
    private Map<Integer, Transaction> transactions;

    public Map<Integer, Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(Map<Integer, Transaction> transactions) {
        this.transactions = transactions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public Account(int id, String account) {
        this.id = id;
        this.account = account;
    }

    public Account(int id, String account,  User user) {
        System.out.println("contructor init");
        this.id = id;
        this.account = account;
        this.user = user;
    }

    public Account() {
        System.out.println("default constructor");
    }

    @Override
    public String toString() {
        return "az.coders.spring.Account{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", user=" + user +
                ", transactions=" + transactions +
                '}';
    }

    public void startObject() {
        System.out.println("init object");
    }

    public void destroyObject() {
        System.out.println("destroy object");
    }
}
