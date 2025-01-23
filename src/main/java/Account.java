import java.util.List;

public class Account {
    private int id;
    private String account;
    private User user;
    private List<Transaction> transactions;

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
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

    public Account(int id, String account, User user) {
        this.id = id;
        this.account = account;
        this.user = user;
    }

    public Account() {
        System.out.println("default constructor");
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", user=" + user +
                ", transactions=" + transactions +
                '}';
    }
}
