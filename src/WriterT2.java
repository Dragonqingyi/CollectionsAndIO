import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class WriterT2 {
    public static void main(String[] args)  throws Exception{
        File f = new File("H:"+File.separator+"test.txt");
        Writer out = null;
        out = new FileWriter(f,true);
        String str = "\r\nAAAA\r\nHello world!";
        out.write(str);
        out.close();
    }
}
