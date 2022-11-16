package GgroupQuiz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.util.ArrayList;
import java.util.*;

public class MiniDemo {
	
	Connection con = null;
	String questions  = null;
	String ans ="";
	//String name = "";
	Scanner sc = new Scanner(System.in);
	//for showing data
	RetriveStudents retrivestudents = new RetriveStudents();

	
	ReturnConnection returnconnection = new ReturnConnection();
	
	CheckAnswer checkanswer = new CheckAnswer();

	
	public void startQuiz(String name) {
		try {
				
				con = returnconnection.retConnection(); //return con from return connection class
				PreparedStatement stmt1 = con.prepareStatement("insert into StudentInfo(sname) values(?)");
				stmt1.setString(1, name);
				stmt1.execute();
				
				for(int i = 1 ;i<=10;i++) {
						con = returnconnection.retConnection();
						PreparedStatement stmt2 = con.prepareStatement("select question from QandA order by rand() limit 1");
						
						ResultSet resultset1 =stmt2.executeQuery();
						
						ArrayList<String> questions = new ArrayList<String>();
						
						while(resultset1.next()) 
						{
							
							questions.add(resultset1.getString(1));
						}
							
						switch("questions"){
						case "1":System.out.println(questions);
							   System.out.println(" 1.5 \n 2.7 \n 3.8 \n 4.8");
							   break;
						case "2":System.out.println(questions);
						   	   System.out.println(" 1.32and 64\n 2.32 and 32 \n 3.64 and 64\n 4.64 and 32");
						   	   break;
						case "3":System.out.println(questions);
					   	   	   System.out.println(" 1.Byte to int \n 2.int to long \n 3.long to int \n 4.short to int ");
					   	       break;
						case "4":System.out.println(questions);
					   	       System.out.println(" 1.Java is a sequence-dependent programming language \n 2.Java is a code dependent programming language \n 3.Java is a platform-dependent programming language \n 4.Java is a platform-independent programming language");
					   	       break;
						case "5":System.out.println(questions);
					   	       System.out.println(" 1.JRI \n 2.JET \n 3.JDK \n 4.JVM");
					   	       break;
						case "6":System.out.println(questions);
					   	       System.out.println(" 1.identifier \n 2.identifier & keyword \n 3.keyword \n 4.none");
					   	       break;
						case" 7":System.out.println("Question >>"+questions);
						   	   System.out.println(" \" 1..JS \\n 2..txt \\n 3. .class \\n 4..java\"");
							   break;
						case "8":System.out.println(questions);
						   	   System.out.println(" 1.Polymorphism \n 2.inheritance \n 3.compilation \n 4.Encapsulation");
						   	   break;
						case "9":System.out.println(questions);
					   	   	   System.out.println(" 1.MemoryError \\n 2.OutOfMemoryError \\n 3.MemoryOutOfBoundsException \\n 4.MemoryFullException");
					   	       break;
						case "10":System.out.println(questions);
					   	       System.out.println(" 1.break \n 2.continoue \n 3.for() \n 4.if()");
				   	       break;
					   	default:System.out.println("invalid Question");
						}
						
						System.out.println("Enter your Answer >>");
						ans = sc.next();
						
						int id = 0;
						// for checking correct answer each time;
						checkanswer.getCorrectAnswer(ans,id,name);

				}
				System.out.println("Do you want know score of all student>>");
				String str1 = sc.next();
				if(str1.equals("yes")) {
					System.out.println("Student Data is >>");
					retrivestudents.getStudentInfo();
				}
				
				      	
		}catch(Exception e) {System.out.println(e);}
		
	}
}
