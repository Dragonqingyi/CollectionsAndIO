import java.io.*;

public class SerializableT3 {
    public static void main(String[] args) throws Exception{
        ser();
        dser();
    }

    public static void ser() throws Exception{
        File f = new File("H:"+File.separator+"test.txt");
        ObjectOutputStream oos = null;
        OutputStream out = new FileOutputStream(f);
        oos = new ObjectOutputStream(out);
        oos.writeObject(new Person2("张三",20));
        oos.close();
    }

    public static void dser() throws Exception{
        File f = new File("H:"+File.separator+"test.txt");
        ObjectInputStream ois = null;
        InputStream input = new FileInputStream(f);
        ois = new ObjectInputStream(input);
        Object obj = ois.readObject();
        ois.close();
        System.out.println(obj);
    }
}
