import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayT {
    public static void main(String[] args) {
        String str = "HELLOWORLD";
        ByteArrayInputStream bis = null;
        ByteArrayOutputStream bos = null;
        bis = new ByteArrayInputStream(str.getBytes());         //向内存中输出内容
        bos = new ByteArrayOutputStream();
        int temp = 0;
        while ((temp=bis.read())!=-1){
            char c = (char)temp;
            bos.write(Character.toLowerCase(c));
        }

        String newStr = bos.toString();
        try {
            bis.close();
            bos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(newStr);

    }
}
