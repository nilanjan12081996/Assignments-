/*
 @Author Nilanjan
  */
import java.util.*;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n; //declare a number
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in); //create the object of scanner class
		n=sc.nextInt();	//take output from users
		if(n>0)//checking for positive number
			System.out.println(n+" is positive number");
		else if(n<0)//checking for negetive number
			System.out.println(n+" is negetive number");
		else
			System.out.println("number is zero");
	}

}
