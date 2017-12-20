import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamT1 {
    public static void main(String[] args) throws Exception{
        File f = new File("H:"+File.separator+"www.txt");   //要压缩文件名
        File zipfile = new File("H:"+File.separator+"www.zip");//压缩文件名
        InputStream input = new FileInputStream(f); //文件输出流
        ZipOutputStream zipOut = null;  //压缩流对象
        zipOut = new ZipOutputStream(new FileOutputStream(zipfile));
        zipOut.putNextEntry(new ZipEntry(f.getName())); //设置ZipEntry对象
        zipOut.setComment("www.www.cn");        //设置注释
        int temp = 0;
        while ((temp =input.read())!=-1){       //读取内容
            zipOut.write(temp);                 //压缩输出
        }
        input.close();                          //关闭输入流
        zipOut.close();                         //关闭输出流
    }
}
