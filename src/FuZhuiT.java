import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FuZhuiT {
    public static void main(String[] args) throws Exception{
        File f = new File("H:"+File.separator+"haha.txt");
        RandomAccessFile raf = new RandomAccessFile(f,"rw");
        FileChannel randomChannel = raf.getChannel();
        ByteBuffer buffer = randomChannel.map(FileChannel.MapMode.READ_ONLY,0,f.length());
        randomChannel.position(f.length());
        randomChannel.write(buffer);
        randomChannel.close();
    }
}
