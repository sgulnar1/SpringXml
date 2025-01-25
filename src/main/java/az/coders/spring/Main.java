package az.coders.spring;

import az.coders.spring.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Account account = (Account) applicationContext.getBean("account");
        account.setId(1);
        account.setAccount("AZ147852");
        Employer employer = (Employer) account.getUser();
        employer.setId(1);
        employer.setFullName("Gulnar");
        Map<Integer, Transaction> transactions = new HashMap<Integer, Transaction>();
        Transaction transaction1 = new Transaction(1,15,OperationType.MEDAXIL);
        transactions.put(1,transaction1);
        Transaction transaction2 = new Transaction();
        transaction2.setId(2);
        transaction2.setAmount(11.7);
        transaction2.setOperationType(OperationType.MEXARIC);
        transactions.put(2,transaction2);
        account.setTransactions(transactions);
        System.out.println(account);
//        Account account2 = (Account) applicationContext.getBean("account2");
//        System.out.println(account2);
//        Customer customer = (Customer) applicationContext.getBean("customer");
//        System.out.println(customer);
        Employer employer1 = (Employer) applicationContext.getBean("employer");
        System.out.println(employer1);
    }
}
