import java.util.Stack;

public class youngVector {
    public static void main(String[] args) {
        Stack v = new Stack();
        v.push("AAA");
        v.push("BBB");
        v.push("CCC");
        System.out.println(v);
        System.out.println(v.peek());
        System.out.println(v);
        System.out.println(v.pop());
        System.out.println(v);
    }
}
