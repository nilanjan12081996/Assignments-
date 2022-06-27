/*
 @Author Nilanjan
  */
import java.util.*;
public class Blood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age,weight;//declare the variable age and weight
		Scanner sc=new Scanner(System.in); //create the object of scanner class
		System.out.println("Enter your age: ");
		age=sc.nextInt();//take the age from user
		System.out.println("Enter your weight: ");
		weight=sc.nextInt();//take the weight from user
		if(age>=25 && weight>=48)//check the user is eligble or not
			System.out.print("You are eligible for donate the blood");
		else
			System.out.print("You are not eligible for donate the blood");
			
	}

}
