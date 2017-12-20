import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class youngWeakHashMap {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        Map weakMap = new WeakHashMap();
        Map map = new HashMap();
        map.put(a, "aaa");
        map.put(b, "bbb");
        weakMap.put(a, "aaa");
        weakMap.put(b, "bbb");
        map.remove(a);
        a = null;
        b = null;
        System.gc();
        Iterator i = map.entrySet().iterator();
        while (i.hasNext()){
            Map.Entry en = (Map.Entry)i.next();
            System.out.println("map:"+en.getKey()+":"+en.getValue());
        }
        Iterator j = weakMap.entrySet().iterator();
        while (j.hasNext()){
            Map.Entry en = (Map.Entry)j.next();
            System.out.println("weakMap:"+en.getKey()+":"+en.getValue());
        }

    }
}
