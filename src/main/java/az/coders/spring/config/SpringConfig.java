package az.coders.spring.config;

import az.coders.spring.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.HashMap;
import java.util.Map;

@ComponentScan("az.coders.spring")
@Configuration
public class SpringConfig {
//    @Bean("account")
//    @Scope("prototype")
//    public Account getAccount() {
//        System.out.println("account bean");
//        Account account = new Account(1,"AZ147852", getEmployer());
//        Map<Integer, Transaction> transactions = new HashMap<Integer, Transaction>();
//        transactions.put(1,getTransaction1());
//        transactions.put(2,getTransaction2());
//        account.setTransactions(transactions);
//        return account;
//    }
//
//    @Bean("transaction1")
//    public Transaction getTransaction1() {
//        Transaction transaction1 = new Transaction(1,15,OperationType.MEDAXIL);
//        return transaction1;
//    }
//
//    @Bean("transaction2")
//    public Transaction getTransaction2() {
//        Transaction transaction2 = new Transaction();
//        transaction2.setId(2);
//        transaction2.setAmount(11.7);
//        transaction2.setOperationType(OperationType.MEXARIC);
//        return transaction2;
//    }
//
//    @Bean("employer")
//    public User getEmployer() {
//        Employer employer = new Employer(1);
//        employer.setFullName("Gulnar");
//        return employer;
//    }
//    @Bean("account2")
//    public Account getAccount2() {
//        Account account = new Account();
//        account.setId(2);
//        account.setAccount("AZ741258");
//        account.setUser(getCustomer());
//        return account;
//    }
//
//    @Bean("customer")
//    public User getCustomer() {
//        Customer customer = new Customer();
//        customer.setId(2);
//        customer.setFullName("Ayxan");
//        return customer;
//    }

}
