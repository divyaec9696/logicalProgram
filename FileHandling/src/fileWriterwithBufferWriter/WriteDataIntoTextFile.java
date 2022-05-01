package fileWriterwithBufferWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\DELL\\Desktop\\file handling\\chetan.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Hi My Name is Vihu");
		bw.write("I am very cleaver boy");
		bw.close();		
	}

}
