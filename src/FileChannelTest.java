import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class FileChannelTest {
    public static void main(String[] args) {
        FileChannel inCjannel = null;
        FileChannel outChannel = null;
        try {
            File f = new File("H:"+File.separator+"person.txt");
            inCjannel = new FileInputStream(f).getChannel();
            MappedByteBuffer buffer = inCjannel.map(FileChannel.MapMode.READ_ONLY,0,f.length());
            Charset charset = Charset.forName("GBK");
            outChannel = new FileOutputStream("a.txt").getChannel();
            outChannel.write(buffer);
            buffer.clear();
            CharsetDecoder decoder = charset.newDecoder();
            CharBuffer charBuffer = decoder.decode(buffer);
            System.out.println(charBuffer);
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                if (inCjannel != null)inCjannel.close();
                if (outChannel != null)outChannel.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
