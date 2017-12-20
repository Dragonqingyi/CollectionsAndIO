import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.setProperty("BJ", "Beijing");
        pro.setProperty("TJ", "TianJin");
        pro.setProperty("NJ", "NanJing");
        System.out.println("1,bj的属性存在"+pro.getProperty("BJ"));
        System.out.println("2,sc的属性不存在"+pro.getProperty("SC"));
        System.out.println("3,sc的属性 不存在"+pro.getProperty("SC", "没有发现"));

        File file = new File("H:"+File.separator+"area.properties");
        try {
            pro.store(new FileOutputStream(file),"Area Info");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
