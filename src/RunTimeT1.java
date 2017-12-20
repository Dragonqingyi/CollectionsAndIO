
public class RunTimeT1 {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        System.out.println("JAM最大内存量 "+run.maxMemory());
        System.out.println("JVM空闲内存量 "+run.freeMemory());
        String str = "hello"+"word"+"!!!"+"\t"+"Welcome"+"to"+"Beijing"+"~";
        System.out.println(str);
        for (int i = 0; i < 1000; i++) {
            str += i;
        }
        System.out.println("操作Str之后的JVM空闲内存量 "+run.freeMemory());
        run.gc();
        System.out.println("垃圾回收之后的JVM空闲内存量 "+run.freeMemory());
    }
}
