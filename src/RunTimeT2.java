public class RunTimeT2 {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        try {
            //操作本机命令——记事本-
            run.exec("notepad.exe");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
