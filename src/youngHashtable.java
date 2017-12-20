import java.util.Hashtable;

class AAAAA{
    int count;

    public AAAAA(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if (obj != null && obj.getClass() == A.class){
            AAAAA a = (AAAAA)obj;
            if (this.count == a.count){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.count;
    }
}

class BBBB{
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

public class youngHashtable {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(new AAAAA(60000),"android 江湖");
        ht.put(new AAAAA(87562),"会当凌绝顶");
        ht.put(new AAAAA(1213),new BBBB());
        System.out.println(ht);
        System.out.println(ht.containsValue("测试字符串"));
        System.out.println(ht.containsKey(new AAAAA(60000)));
        ht.remove(new AAAAA(1213));
        for (Object key:ht.keySet()){
            System.out.print(key+"---->");
            System.out.println(ht.get(key)+"\n");
        }
    }
}
