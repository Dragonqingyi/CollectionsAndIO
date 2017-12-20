import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorError {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("android江湖");
        books.add("会当凌绝顶");
        books.add("一览众山小");
        Iterator it = books.iterator();
        while (it.hasNext()){
            String book = (String)it.next();
            System.out.println(book);
            if (book.equals("java实战宝典")){
                books.remove(book);
            }
        }
    }
}
