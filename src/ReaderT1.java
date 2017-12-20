import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.Reader;

public class ReaderT1 {
    public static void main(String[] args) throws Exception{
        File f = new File("H:"+ File.separator+"test.txt");
        Reader read = null;
        read = new FileReader(f);
        char c[] = new char[1024];
        int len = read.read(c);
        read.close();
        System.out.println("内容为:"+new String(c,0,len));
    }
}
