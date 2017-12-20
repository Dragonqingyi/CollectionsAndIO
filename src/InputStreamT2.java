import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamT2 {
    public static void main(String[] args) throws Exception{
        File f = new File("H:"+File.separator+"test.txt");
        InputStream input = null;
        input = new FileInputStream(f);
        //数组大小由文件决定
        byte b[] = new byte[(int)f.length()];
        input.read(b);
        input.close();
        System.out.println("文件内容为"+new String(b)+" 文件长度为:"+f.length());
    }
}
