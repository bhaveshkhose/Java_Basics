package Threading;
import java.lang.Runnable;


class Run implements Runnable{
    public void run(){
        for(int i = 0 ; i < 50  ; i++){
            System.out.println("bhavesh");
        }
    }
}
public class Runable  {

  public static void main(String[] args) {
    Run run = new Run();
    Thread thread =  new Thread(run);
    thread.start();
    for(int i = 0 ; i < 50 ; i++){
        System.out.println("Khose");
    }
  }
}
