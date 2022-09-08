/*
 * Author Nilanjan Dasgupta
 * This is an Quiz App using array list(There are only 5 question) which print the question and take answer from user 
 if answer is correct then it prints the answer is correct and score will be increase.
 *if answer is wrong is give message answer is wrong and print the correct answer to the user and after the test hasbeen taken it will generate your 
 total score according to your right answer and also generate percentage as well.
 */
package quiz;

import java.util.ArrayList;
import java.util.Scanner;
//create a class Main
public class Main {
	//create a method taketest and pass the arraylist as an argument from the method
	public static void taketest(ArrayList<Question> list)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("*******************Welcome to Java Quiz*****************");
		int score=0;
		String answer;
		//print the question and take answer from user
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).question);
			System.out.print("Enter your ans here: ");
			answer=sc.next();
			// compare the answer of user and correct answer set by developer is equal or not
			//if equal score will be increase and pint a message answer is correct otherwise print the wrong answer and print which is the correct option
			if(list.get(i).ans.equalsIgnoreCase(answer))
			{
				score++;
				System.out.println("correct answer");
			}
			else {
				System.out.println("wrong answer");
				System.out.println("correct ans is: "+list.get(i).ans);
			}
		}
		//calculate the total score and percentage of score
		System.out.println("Your score is: "+score+"/5");
		double per=(double)score*(double)100/(double)5;
		System.out.println("Percentage is: "+per+"%");
	}

	public static void main(String[] args) {
		//create a array list of Question type with reference variable list to store question and answer
		ArrayList<Question> list=new ArrayList<Question>();
		//take s1,s2,s3,s4,s5 String type of variable to initialize the questions
		String s1= "1. Which statement is true about Java?\r\n"
				+ "a) Java is a sequence-dependent programming language\r\n"
				+ "b) Java is a code dependent programming language\r\n"
				+ "c) Java is a platform-dependent programming language\r\n"
				+ "d) Java is a platform-independent programming language";
		String s2="Which one of the following is not a Java feature?\r\n"
				+ "a) Object-oriented\r\n"
				+ "b) Use of pointers\r\n"
				+ "c) Portable\r\n"
				+ "d) Dynamic and Extensible";
		String s3="3. Which component is used to compile, debug and execute the java programs?\r\n"
				+ "a) JRE\r\n"
				+ "b) JIT\r\n"
				+ "c) JDK\r\n"
				+ "d) JVM";
		String s4="4. Which of these cannot be used for a variable name in Java?\r\n"
				+ "a) identifier & keyword\r\n"
				+ "b) identifier\r\n"
				+ "c) keyword\r\n"
				+ "d) none of the mentioned";
		String s5=" What is the extension of java code files?\r\n"
				+ "a) .js\r\n"
				+ "b) .txt\r\n"
				+ "c) .class\r\n"
				+ "d) .java";
		//add question ans set correct ans to the arraylist
		list.add(new Question(s1,"d"));
		list.add(new Question(s2,"b"));
		list.add(new Question(s3,"b"));
		list.add(new Question(s4,"c"));
		list.add(new Question(s5,"d"));
		
		Main.taketest(list);// invoke the method taketest
		
	}

}
