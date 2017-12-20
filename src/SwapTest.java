import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SwapTest {
    public static void main(String[] args) {
        List<String>all = new ArrayList<>();
        Collections.addAll(all,"1、MLDN","2、LXH","3、mldnjava");
        System.out.println("交换之前的集合");
        Iterator<String>iter = all.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next()+",");
        }
        System.out.println("\n交换之后的集合");
        Collections.swap(all,0,2);
        iter = all.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next()+",");
        }
    }
}
