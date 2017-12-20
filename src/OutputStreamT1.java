import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamT1 {
    public static void main(String[] args) throws Exception{
        File f = new File("H:"+File.separator+"test.txt");
        OutputStream out = null;
        out = new FileOutputStream(f);
        String str = "hello java!!!!";
        byte b[] = str.getBytes();
        out.write(b);
        out.close();
    }
}
