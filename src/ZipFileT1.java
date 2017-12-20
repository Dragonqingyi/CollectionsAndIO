import java.io.File;
import java.util.zip.ZipFile;

public class ZipFileT1 {
    public static void main(String[] args) throws Exception{
        File file = new File("H:"+File.separator+"www.zip");
        ZipFile zipFile = new ZipFile(file);
        System.out.println("压缩文件的名称:"+zipFile.getName());

    }
}
