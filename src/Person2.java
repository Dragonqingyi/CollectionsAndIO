import java.io.Serializable;

public class Person2 implements Serializable{
    private transient String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名："+name+"，年龄:"+age;
    }
}
