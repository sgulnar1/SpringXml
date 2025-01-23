import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Employer employer = new Employer(1, "Gulnar")
//        Account account = new Account(1,
//                "AZ147852",
//               employer);
//        System.out.println(account);
//        Account account2 = new Account();
//        account2.setId(2);
//        account2.setAccount("AZ55625");
//        account2.setUser(new Customer(2, "Ayxan"));
//        System.out.println(account2);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Account account = (Account) applicationContext.getBean("account");
        Account account1 = applicationContext.getBean("account", Account.class);
        Account account3 = applicationContext.getBean(Account.class);

        System.out.println(account);Account account2 = (Account) applicationContext.getBean("account2");
        System.out.println(account2);
    }
}
