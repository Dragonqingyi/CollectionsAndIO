import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamT2 {
    public static void main(String[] args) throws Exception{
        File file = new File("H:"+File.separator+"www");        //定义要压缩的文件夹
        File zipFile = new File("H:"+File.separator+"www.zip"); //压缩文件名称
        InputStream input = null;       //输入流
        ZipOutputStream zipOut = null;  //压缩流
        zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
        zipOut.setComment("www.www.cn");    //注释
        int temp = 0;
        if (file.isDirectory()){        //判断是否为文件夹
            File lists[] = file.listFiles();    //列出全部文件
            for (int i = 0; i < lists.length; i++) {
                input = new FileInputStream(lists[i]);      //
                zipOut.putNextEntry(new ZipEntry(file.getName() + File.separator+lists[i].getName()));
                while ((temp=input.read())!=-1){
                    zipOut.write(temp);
                }
                input.close();
            }
        }
        zipOut.close();
    }
}
