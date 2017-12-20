import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamT4 {
    public static void main(String[] args) throws Exception{
        File f = new File("H:"+File.separator+"test.txt");
        InputStream input = null;
        input = new FileInputStream(f);
        byte b[] = new byte[1024];
        int len = 0;
        int temp = 0;
        while ((temp = input.read())!=-1){
            b[len] = (byte)temp;
            len++;
        }
        input.close();
        System.out.println("内容为"+new String(b));
    }
}
