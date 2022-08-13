package Test;

public class Student {
	String  StudentName;
	float EnglishMark;
	float MathMark;
	float ScienceMark;
	float SocialMark;
	float TotalMarks;
	float AverageMarks;
	
	void TotalMarks() {
		TotalMarks=EnglishMark+MathMark+ScienceMark+SocialMark;
	}
	void AverageMarks() {
		AverageMarks=TotalMarks/4;
	}
	public static void main(String[] args) {
		Student Student1=new Student();
		Student1.StudentName="John";
		Student1.EnglishMark=90;
		Student1.MathMark=98;
		Student1.ScienceMark=94;
		Student1.SocialMark=89;
		
		Student1.TotalMarks();
		Student1.AverageMarks();
		
		
		System.out.println("======Student Marks, Total and Average=======");
		System.out.println("Student Name : " +Student1.StudentName);
		System.out.println("English Mark : " +Student1.EnglishMark);
		System.out.println("Math Mark : " +Student1.MathMark);
		System.out.println("Science Mark : " +Student1.ScienceMark);
		System.out.println("Social Mark : " +Student1.SocialMark);
		System.out.println("Total Mark : " +Student1.TotalMarks);
		System.out.println("Average Mark : " +Student1.AverageMarks);
		
		
	}

}
