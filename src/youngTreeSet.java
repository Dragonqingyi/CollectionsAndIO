import java.util.TreeSet;

public class youngTreeSet {
    public static void main(String[] args) {

        //TreeSet是sortedSet的唯一实现，保证元素排序，采用红黑树对元素排序
        TreeSet nums = new TreeSet();
        nums.add(5);
        nums.add(2);
        nums.add(10);
        nums.add(-9);
        System.out.println(nums);

        //sortedSet的所有方法
        System.out.println(nums.first());
        System.out.println(nums.last());
        System.out.println(nums.headSet(4));
        System.out.println(nums.tailSet(5));
        System.out.println(nums.subSet(-3,4));
    }
}
