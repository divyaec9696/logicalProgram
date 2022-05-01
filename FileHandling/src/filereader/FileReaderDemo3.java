package filereader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderDemo3 {

public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("C:\\Users\\DELL\\Desktop\\file handling\\chetan.txt");
		
		Scanner sc=new Scanner(fr);
		
		sc.useDelimiter("\\z");
		System.out.println(sc.next());
		
	}
}
