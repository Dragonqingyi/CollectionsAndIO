import java.util.TreeMap;

class RR implements Comparable{
    int count;

    public RR(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj != null && obj.getClass() == RR.class){
            RR r = (RR)obj;
            if (this.count == r.count){
                return true;
            }
        }
        return false;

    }

    @Override
    public int compareTo(Object o) {
        RR r = (RR)o;
        if (this.count > r.count){
            return 1;
        }
        else if (this.count == r.count){
            return 0;
        }else {
            return -1;
        }
    }
}

public class youngTreeMap {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(new RR(3),"android江湖");
        tm.put(new RR(-5),"会当凌绝顶");
        tm.put(new RR(9),"一览众山小");
        System.out.println(tm);
        System.out.println(tm.firstEntry());
        System.out.println(tm.lastEntry());
        System.out.println(tm.higherKey(new RR(2)));
        System.out.println(tm.lowerEntry(new RR(2)));
        System.out.println(tm.subMap(new RR(-1), new RR(4)));
    }
}
