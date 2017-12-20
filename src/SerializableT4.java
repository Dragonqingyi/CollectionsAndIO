import java.io.*;

public class SerializableT4 {
    public static void main(String[] args) throws Exception{
        Person per[] = {new Person("张三",20), new Person("李四",30), new Person("王五", 47)};
        ser(per);
        Object o[] = dser();
        for (int i = 0; i < o.length; i++) {
            Person p = (Person)o[i];
            System.out.println(p);
        }
    }

    public static void ser(Object obj[]) throws Exception{
        File f = new File("H:"+File.separator+"test.txt");
        ObjectOutputStream oos = null;
        OutputStream out = new FileOutputStream(f);
        oos = new ObjectOutputStream(out);
        oos.writeObject(obj);
        oos.close();
    }

    public static Object[] dser() throws Exception{
        File f = new File("H:"+File.separator+"test.txt");
        ObjectInputStream ois = null;
        InputStream input = new FileInputStream(f);
        ois = new ObjectInputStream(input);
        Object obj[] = (Object[]) ois.readObject();
        ois.close();
        return obj;
    }
}
