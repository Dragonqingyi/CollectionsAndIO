import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;


//反序列化
public class SerializableT2 {
    public static void main(String[] args) throws Exception{
        File file = new File("H:"+File.separator+"person.txt");
        ObjectInputStream ois = null;
        InputStream input = new FileInputStream(file);
        ois = new ObjectInputStream(input);
        Object object = ois.readObject();
        ois.close();
        System.out.println(object);
    }
}
