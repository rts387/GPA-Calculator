import java.util.Scanner;
import java.util.ArrayList;
public class GPA {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("How many classes are you taking? ");
			int loop = scan.nextInt();
			ArrayList<Grade> grades = new ArrayList<Grade>();
			for (int i = 0; i < loop; i++)
			{
				System.out.println("What is the name of the class you are taking? ");
				String iName = scan.next();
				System.out.println("How many credit hours is " + iName + "? ");
				int iHours = scan.nextInt();
				System.out.println("(Enter capital letters) What letter grade did you recieve? ");
				String iLetter = scan.next();
				System.out.println("(True/False) Was this class an elective? ");
				boolean iElect = scan.nextBoolean();
				Grade temp = new Grade(iName, iHours, iLetter, iElect);
				grades.add(temp);
				
			}
		
		student.input();
		
		studentPrinter.display();
		
		Summary(grades);
		
		feedback.feedbackPrinter(grades);
		
	}
	
	
	public static void Summary(ArrayList<Grade> list)
	{
	double tempCount = 0;
	double GPAtemp = 0;
	double gpaCalc[] = new double[list.size()];
	for(int l = 0; l < list.size(); l++)
	{
	 Grade tempa = list.get(l);
	 
	 System.out.println(tempa.className + ": " +tempa.gradeLetter+ " | "+ tempa.creditHours+ " Credits | ");
	 tempa.getRange(tempa);
	 System.out.print(" | ");
	 tempa.getElectMess(tempa.elective);
	 System.out.println(" ");
	 
	 GPAtemp = (tempa.getCredit(tempa) * tempa.creditHours) + GPAtemp;
	 
	 tempCount = tempa.creditHours + tempCount;
	 
	 
	 
	}
	double finalGPA = GPAtemp / tempCount;

	System.out.println("GPA: " + finalGPA);


}	
}
class feedback{
	
	public static void feedbackPrinter(ArrayList<Grade> list) {
		Scanner feedbackScanner = new Scanner(System.in);
	   
	    System.out.println("Would you like feedback?");
	        String feedback = feedbackScanner.nextLine();
	        
	        if (feedback.equals("Yes")) {
	        for(int i = 0; i < list.size(); i++)
	        {
	        	Grade g = list.get(i);
	          if (g.gradeLetter.contains("C") || g.gradeLetter.contains("D") || g.gradeLetter.contains("F")) {
	            System.out.println("If you want to bring your GPA up, you need to bring " + g.className + " up.");
	          }
	          }
	        }
	        System.out.println("You may now exit the program.");
	        }
}
class student {
    static String stuName = " ";
	static String stuEmail = " ";
	static String stuPhone = "";
	static String stuNum = " ";
	public static void input() {

	Scanner one = new Scanner(System.in);
	
	System.out.println("Enter your name: ");
	String name = one.nextLine();
	
	System.out.println("Enter your phone number: ");
	String phoneNumber = one.nextLine();
		
	System.out.println("Enter your E-mail: ");
	String email = one.nextLine();
				
	System.out.println("Enter your student number: ");
	String studentNumber = one.nextLine();
	stuName = name;
	stuEmail = email;
	stuPhone = phoneNumber;
	stuNum = studentNumber;
}	
	
	public String getNameStudent() {
		return stuName;
	}
	public String getEmail() {
		return stuEmail;
	}
	public String getPhone() {
		return stuPhone;
	}
	public String getStudentNum() {
		return stuNum;
	}
	
}
	
	

class Grade 
{
 String className = " ";
 double creditHours = 0;
 String gradeLetter = " ";
 boolean elective = false;
 
 public Grade(String iName,double iHours, String iLetter, boolean ielect)
 	{
	className = iName;
	creditHours = iHours;
	gradeLetter = iLetter;
	elective = ielect;
 	}
 
 

public String getName()
 	{
	 return className;
 	}
 
 public double getHours()
 	{
	 return creditHours;
 	}

 public String getLetter()
 	{
	 return gradeLetter;
 	}
 
 public boolean getElective()
 	{
	 return elective;
 	}
 public Grade() {
	 getLetter();
	 getName();
 }
 public void getRange(Grade tempa)
 {
	 if (tempa.gradeLetter.contains("A"))
	 {
		 System.out.print("90 - 100%");
	 }
	 if (tempa.gradeLetter.contains("B"))
	 {
		 System.out.print("80 - 89%");
	 }
	 if (tempa.gradeLetter.contains("C"))
	 {
		 System.out.print("70 - 79%");
	 }
	 if (tempa.gradeLetter.contains("D"))
	 {
		 System.out.print("60 - 69%");
	 }
	 if (tempa.gradeLetter.contains("F"))
	 {
		 System.out.print("0 - 59%");
	 }
	 
 }
 public void getElectMess(boolean k)
 {
	 if (k == true)
	 {
		 System.out.print("Elective");
	 }
	 if (k == false)
	 {
		 System.out.print("Not an Elective");
	 }
 }
 public int getCredit(Grade tempa)
 {
	 if (tempa.gradeLetter.contains("A"))
	 {
		 return 4;
	 }
	 if (tempa.gradeLetter.contains("B"))
	 {
		 return 3;
	 }
	 if (tempa.gradeLetter.contains("C"))
	 {
		 return 2;
	 }
	 if (tempa.gradeLetter.contains("D"))
	 {
		 return 1;
	 }
	 if (tempa.gradeLetter.contains("F"))
	 {
		 return 0;
	 }
	 else 
	 {
		 return 0;
	 }
 }
 	

}

class studentPrinter{ //prints the final output 
	
	public static void display() {
		student b = new student();
		System.out.println("------------------------------------");
		System.out.println("Student Information:");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Name: " + b.getNameStudent());
		System.out.println("Phone Number: " + b.getPhone());
		System.out.println("Student Number: " + b.getStudentNum());
		System.out.println("Email: " + b.getEmail());
		System.out.println(" ");
		System.out.println("------------------------------------");
		System.out.println(b.getNameStudent() + "'s"+ " GPA");
		System.out.println("------------------------------------");
		
		
	}
}



