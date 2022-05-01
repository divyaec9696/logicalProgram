package GenerateRandomNumberString;

import java.util.Random;

public class GenerateRandomNumber {
	public static void main(String[] args) {
		Random rand=new Random();
		System.out.println("1st way");
		int  rand_int=rand.nextInt(100);
		System.out.println(rand_int);
		
		
		double rand_double=rand.nextDouble();
		System.out.println(rand_double);
		
		System.out.println("2nd way");
		System.out.println(Math.random());
		
		
	}

}
