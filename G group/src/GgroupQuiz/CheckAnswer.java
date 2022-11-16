package GgroupQuiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CheckAnswer {

	Connection con  = null;
	//used for loading and make connection
	ReturnConnection returnconnection = new ReturnConnection();
	String correctans = "";
    int count;
    
	//method for retrieving correct answer from database
 
			public void getCorrectAnswer(String answer,int queid,String name) {

					try {
						con = returnconnection.retConnection();
						PreparedStatement stmt3 = con.prepareStatement("select answer from QandA where question = ?");
						int question = 0;
						stmt3.setInt(1, question);
						ResultSet resultset2  = stmt3.executeQuery();
						
						while(resultset2.next()) {
							correctans = resultset2.getString(1);
							
						}
						
						//for checking answer 
						if(answer.equals(correctans)) {
							count = count+1;
							//for updating score to database;

							PreparedStatement stmt4 = con.prepareStatement("update score set marks= ? where marks = ?");
							stmt4.setInt(1,count);
							stmt4.setString(2,name);
							stmt4.execute();
						}
						//System.out.println(count);
					}
					catch(Exception e) {e.printStackTrace();}
				}
			
			
		
}
