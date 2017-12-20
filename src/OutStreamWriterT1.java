import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutStreamWriterT1 {
    public static void main(String[] args) throws Exception{
        File f = new File("H:"+File.separator+"test.txt");
        Writer out = null;
        out = new OutputStreamWriter(new FileOutputStream(f));
        out.write("Hello java!");
        out.close();
    }
}
