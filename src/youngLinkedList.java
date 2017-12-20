import java.util.LinkedList;

public class youngLinkedList {
    public static void main(String[] args) {
        LinkedList books = new LinkedList();
        books.offer("android江湖");
        books.push("会当凌绝顶");
        books.offerFirst("一览众山小");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
        System.out.println(books.peekFirst());
        System.out.println(books.peekLast());
        System.out.println(books.pop());
        System.out.println(books);
        System.out.println(books.pollLast());
    }
}
