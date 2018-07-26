import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans");
        //要用接口接收
        IHuman c= (IHuman)context.getBean("chinese");
        c.chifan();
        c.shuijiao();
        System.out.println("*********************************");
        //要用接口接收
        IHuman a= (IHuman) context.getBean("american");
        a.chifan();
        a.shuijiao();

    }

}