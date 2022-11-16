package GgroupQuiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class RetriveStudents {
	//Author Hemant
	Connection con;
	int studid;
	String studname;
	int marks;
	ReturnConnection returnconnection = new ReturnConnection();
	
	public void getStudentInfo() {
		try {
		con = returnconnection.retConnection();
		PreparedStatement stmt4 = con.prepareStatement("select * from StudentInfo order by marks desc");
		ResultSet resultset4 = stmt4.executeQuery();
		
		while(resultset4.next()) {
			System.out.println("Student Id >>"+resultset4.getInt(1));
			System.out.println("Student Name >>"+resultset4.getString(2));
			//System.out.println("Student Grade >>"+resultset4.getInt(3));
			/*studid = resultset4.getInt(1);
			studname = resultset4.getString(2);*/
		     marks = resultset4.getInt(3);
			if(  marks >8 &&   marks<=10 ) {
				System.out.println("Your Class is A");
			}
			else if(  marks >= 6 &&   marks <= 8) {
				System.out.println("Your Class is B");
	
			}else if(  marks == 5) {
				System.out.println("Your Class is c");
	
			}else if(  marks < 5) {
				System.out.println("You are Fail !");
	
			}
			
		}
		
		//check for grade 
		/*System.out.println("Do you want to khow your Class ?");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(str.equals("yes")) {
				
				sc.close();
		}*/
		}
		catch(Exception e) {e.printStackTrace();}
		
		
			
		
	}

}
