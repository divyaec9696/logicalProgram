package filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderDemo {


	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("C:\\Users\\DELL\\Desktop\\file handling\\chetan.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String str;
		
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();
	}
}
