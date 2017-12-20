import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.jar.JarEntry;

public class ExecT1 {
    public static void main(String[] args) throws Exception{
        int i = 0;
        int j = 0;
        BufferedReader buf = null;
        buf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        System.out.print("请输入第一个数字:");
        str = buf.readLine();
        i = Integer.parseInt(str);
        System.out.print("请输入第二个数字:");
        str = buf.readLine();
        j = Integer.parseInt(str);
        System.out.println(i+"+"+j+"="+(i+j));
    }
}
