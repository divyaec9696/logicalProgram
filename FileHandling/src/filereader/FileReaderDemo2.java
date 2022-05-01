package filereader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderDemo2 {
	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("C:\\Users\\DELL\\Desktop\\file handling\\chetan.txt");
		
		Scanner sc=new Scanner(fr);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
	}

}
