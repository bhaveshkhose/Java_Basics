package File_Handling;
import java.io.*;

public class Writing_data {
	
	public static void main(String  args[]) throws IOException  {
		//Write to a file
		String filePath = "in.txt";
		String content = "Hello \n";

		try(FileWriter writer = new FileWriter(filePath)){
			writer.write(content);
			writer.write("\nHello my name is Bhavesh and I am a Software Engineer");
			System.out.println("Data is Written Successfully");
		}
		catch(IOException e){
			System.out.println("An error is occured");
			e.printStackTrace();
		}

		FileReader rd = null;
		try{
			rd = new FileReader(filePath);
		}
		catch(IOException e){
			System.out.println("File not found");
		}
			
		//Read form a file 
		BufferedReader reader  = new BufferedReader(rd);
		try{
			String line = reader.readLine();
			while(line != null){
				System.out.println(line);
				line = reader.readLine();
			}
		}
		catch(IOException e){
			System.out.println("An error is occured");
			e.printStackTrace();
		}
		finally{
			reader.close();
		}		
	}
}
