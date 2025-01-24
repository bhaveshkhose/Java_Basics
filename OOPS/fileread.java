package OOPS.animal;

import java.util.*;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileread {

		
	public static void main(String [] args) throws IOException {
//		try {
//			BufferedWriter write = new BufferedWriter(new FileWriter("out.txt"));
//			write.write("My name is bhavesh /n I am a java student");
//			
//			write.close();
//		} catch (FileNotFoundException e) {
//			System.out.println("the file is not found");
//			e.printStackTrace();
//		}
		
		String name = "bhavesh Padmakar Khose";
		String[] name1 = name.split(" ");
		for(String names : name1) {
			System.out.println(names);
		}

		int[] a = {3,4,1,5,7,8};
		String str = Arrays.toString(a);
		System.out.println(str);
		System.out.println(str.charAt(4));
		
		
	}

}
