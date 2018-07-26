import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
public class Qiemian {

    public void chifanqian(){
        System.out.println("洗手");
    }
    public void chifanhou(){
        System.out.println("漱口");
    }
    public void shuijiaoqian(){
        System.out.println("洗澡");

    }

}