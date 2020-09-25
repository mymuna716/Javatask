
public class Student {
	int roll;
	String name;
	int no_of_students;
	String  college_name;
	int marks;
	char grade;
	int starting_roll=1001;
	
	
	
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}



	


	public Student() {
		// TODO Auto-generated constructor stub
	}






	public int getRoll() {
		return roll;
	}



	public void setRoll(int roll) {
		this.roll = roll;
	}


	public char getGrade() {
		return grade;
	}


	public void setGrade(char grade) {
		this.grade = grade;
	}


	public void setName(String name) {
		this.name = name;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getName() {
		return name;
	}



	public int getMarks() {
		return marks;
	}
	private void calgarde() {
         if( marks >=60)
         {
        	  grade='A';
        	 //System.out.println(name +","+roll+","+grade+","+marks);
         }
         else
         {  
        	 grade='B';
        	 //System.out.println(name +","+roll+","+grade+","+marks);
         }
         
		
		
	}
	
	public String toString(){
		return roll+ " "+name+" "+marks;
		
	}
	
	public static void main(String args[]){  
	 
	 
	 Student obj=new Student(1001,"mymu",100);
	 obj.calgarde();
	  Student obj1=new Student(1002,"sam",40);
	  obj1.calgarde();
	  System.out.println(obj1);
	
	}
	
	
}



