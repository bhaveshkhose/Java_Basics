package File_Handling;
import java.io.*;

public class ReadData {

    public static void main(String [] args){
        FileReader rd = null;
    try{
        rd = new FileReader("in.txt");
        int character ;
        while((character = rd.read()) != -1){
            System.out.print((char)character);
        }
    }
    catch(IOException e){
        e.printStackTrace();

    }
    finally{
        try{
            rd.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    }  
}
