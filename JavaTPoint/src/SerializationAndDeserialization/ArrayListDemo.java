package SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String>  al=new ArrayList<String>();
		
		al.add("divya");
		al.add("vihu");
		al.add("hetvik");
		
		try {
		//Serialization
			   FileOutputStream fos=new FileOutputStream("file");
			   
			   ObjectOutputStream oos=new ObjectOutputStream(fos);
			   
			   oos.writeObject(al);
			   fos.close();
			   oos.close();
			
			   //Desealization
        FileInputStream fis=new FileInputStream("file");
			   
			   ObjectInputStream ois=new ObjectInputStream(fis);
			   
			 ArrayList list=(ArrayList)ois.readObject();
			
			 System.out.println(list);
		}
	    catch(Exception E)
		{
	    	System.out.println(E);
		}
	}
}
