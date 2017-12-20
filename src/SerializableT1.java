import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


//序列化
public class SerializableT1 {
    public static void main(String[] args) throws Exception{
        File file = new File("H:"+File.separator+"person.txt");
        ObjectOutputStream oos = null;
        OutputStream out = new FileOutputStream(file);
        oos = new ObjectOutputStream(out);
        oos.writeObject(new Person("张X",22));
        oos.close();
    }
}
