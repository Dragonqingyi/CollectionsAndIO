import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintT1 {
    public static void main(String[] args) throws Exception{
        PrintStream ps = null;
        ps = new PrintStream(new FileOutputStream(new File("H:"+File.separator+"text.txt")));
        ps.print("hello java");
        ps.println("Dragon");
        ps.print("1+1="+2);
        ps.close();
    }
}
