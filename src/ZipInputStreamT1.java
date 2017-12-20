import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipInputStreamT1 {
    public static void main(String[] args) throws Exception{
        File file = new File("H:"+File.separator+"www.zip");
        ZipInputStream input = null;
        input = new ZipInputStream(new FileInputStream(file));
        ZipEntry entry = input.getNextEntry();
        System.out.println("压缩实体名称："+entry.getName());
        input.close();
    }
}
