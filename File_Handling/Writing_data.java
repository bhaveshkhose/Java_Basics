package File_Handling;
import java.io.*;

public class Writing_data {
	
	public static void  main(String  args[]) throws IOException {
		File f = new File("out.txt");		
		byte[] b= {(byte)'b' , (byte)'h', (byte)'a',(byte)'v', (byte)'e', (byte)'s', (byte)'h',(byte)'s'};
		// For Writing the data
		if(!f.exists()) {
			System.out.println("out.txt "+" is a new file");
		}
		else {
			System.out.println("out.txt "+" this file is allready exists ");
		}
		File newfile = new File("In.txt");
		FileWriter fw = new FileWriter(newfile);
		fw.write("Bhavesh is a good coder");
			
		
		FileOutputStream fs = new FileOutputStream(f);
		System.out.println("File is opened write the content");
		fs.write(b);
		fs.flush();
		
		System.out.println("File is cloesd");
		fs.close();
		
		if(f.exists()) {
			FileInputStream fi = new FileInputStream(f);
			int n = fi.available();
			byte[] c  = new byte[n]; 
			int read = fi.read(c);
			String str = new String(c);
			System.out.println("Content of file is " + str);
			fi.close();
			f =null;
			
		}
		else {
			System.out.println("file is not eixts");
			System.exit(0);
		}
	}
}
