package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/java/bean.xml");
        System.out.println("HDFC client:  \n\n");
        THClient c1=(THClient)context.getBean("client1");
        System.out.println(c1.deposit(1234L,10000.0)+"\n");
        System.out.println(c1.withdraw(1234L,4000)+"\n");
        System.out.println(c1.getBalance(1234L)+"\n");
        System.out.println("ICICI client:  \n\n");

        THClient c2=(THClient)context.getBean("client2");
        THClient c21=(THClient)context.getBean("client2");
        System.out.println(c2.deposit(876543L,45677)+"\n");
        System.out.println(c2.withdraw(876543L,4000)+"\n");
        System.out.println(c2.getBalance(876543L)+"\n");

        System.out.println(c21.deposit(876543L,45677)+"\n");
        System.out.println(c21.withdraw(876543L,4000)+"\n");
        System.out.println(c21.getBalance(876543L)+"\n");

        System.out.println(c2==c21);


        ClassPathXmlApplicationContext cpc=(ClassPathXmlApplicationContext) context;
        cpc.close();
    }
}
