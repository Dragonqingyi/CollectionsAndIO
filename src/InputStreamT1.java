import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamT1 {
    public static void main(String[] args) throws Exception{
        File f = new File("H:"+File.separator+"test.txt");
        InputStream in = null;
        in = new FileInputStream(f);
        byte b[] = new byte[1024];
        in.read(b);
        in.close();
        System.out.printf("内容为:"+ new String(b));
    }
}
