import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamT3 {
    public static void main(String[] args) throws Exception{
        File f = new File("H:"+File.separator+"test.txt");
        InputStream inputStream = null;
        inputStream = new FileInputStream(f);
        byte b[] = new byte[(int)f.length()];
        for (int i = 0; i < b.length; i++) {
            b[i] = (byte)inputStream.read();
        }
        inputStream.close();
        System.out.println("文件内容为:"+new String(b));
    }
}
