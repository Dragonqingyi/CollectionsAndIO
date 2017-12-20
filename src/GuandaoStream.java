import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Send implements Runnable{

    private PipedOutputStream pos = null;

    public Send() {
        this.pos = new PipedOutputStream();
    }

    @Override
    public void run() {
        String str = "hello yang jin hao!";
        try {
            this.pos.write(str.getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }
        try {
            this.pos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public PipedOutputStream getPos() {
        return this.pos;
    }
}

class Receive implements Runnable{

    private PipedInputStream pis = null;

    public Receive() {
        this.pis = new PipedInputStream();
    }

    @Override
    public void run() {
        byte b[] = new byte[1024];
        int len = 0;
        try {
            len = this.pis.read(b);
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            this.pis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("接受的内容为:"+new String(b,0,len));
    }

    public PipedInputStream getPis() {
        return this.pis;
    }
}


//管道流
public class GuandaoStream {
    public static void main(String[] args) {
        Send s = new Send();
        Receive r = new Receive();
        try {
            s.getPos().connect(r.getPis());
        }catch (IOException e){
            e.printStackTrace();
        }
        new Thread(s).start();
        new Thread(r).start();
    }
}
