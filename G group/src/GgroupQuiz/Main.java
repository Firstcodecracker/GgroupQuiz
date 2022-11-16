package GgroupQuiz;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		MiniDemo minidemo = new MiniDemo();
		//ReturnConnection return connection = new ReturnConnection();
		
		System.out.println("Enter Yout Name >>");
		String name = sc.next();
		System.out.println("Lets Start "+name+" !!");
		minidemo.startQuiz(name);
		
		sc.close();
	}

}

