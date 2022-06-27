/*
 @Author Nilanjan
  */
import java.util.*;
public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		System.out.println("Enter your age: ");
		Scanner sc=new Scanner(System.in); //create the object of scanner class
		age=sc.nextInt();// age take from user
		if(age>=18)//Check wheather is age is greater tan or equal to 18 or not
			System.out.println("You are eligible for vote");
		else
			System.out.println("You are not eligible for vote");
	}

}
