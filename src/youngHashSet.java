import java.util.HashSet;


//A类重写equal方法
class A{
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

//B类重写hashCode方法
class B{
    @Override
    public int hashCode(){
        return 1;
    }
}


//C类重写两个方法
class C{
    @Override
    public int hashCode() {
        return 2;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

public class youngHashSet {

    public static void main(String[] args) {
        HashSet books = new HashSet();
        books.add(new A());
        books.add(new A());
        books.add(new B());
        books.add(new B());
        books.add(new C());
        books.add(new C());
        //集合不允许重复，必须两个方法返回相同才是同一个对象，因此一个C，俩A，俩B
        System.out.println(books);
    }
}
