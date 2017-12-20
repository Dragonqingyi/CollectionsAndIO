import java.util.ArrayList;
import java.util.List;

public class youngList {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add(new String("AAA"));
        books.add(new String("BBB"));
        books.add(new String("CCC"));
        System.out.println(books);
        books.add(1, new String("DDD"));
        for (Object str:books) {
            System.out.println(str);
        }
        books.remove(2);
        System.out.println(books);
        System.out.println(books.indexOf(new String("DDD")));
        books.set(1,new String("BBB"));
        System.out.println(books);
        System.out.println(books.subList(1,2));
    }
}
