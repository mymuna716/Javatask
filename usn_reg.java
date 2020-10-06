import java.util.regex.Pattern;

public class usn {

	public static void main(String[] args) {
		String u="4DM16EEE029";
		//String u="4MT16EEE029";
		//String u="4AL16EEE029";
		//String u="4KT16EEE029";
		//String u="4DM16CV029";
		if(Pattern.matches("(4[dDmM0-9]*(CS|(ECE|(IS|(ME|(EEE))))))[0-9]*", u))
		{
			System.out.println("USN belong to YIT");
		}
		
		else if(Pattern.matches("(4[MmTt0-9]*(CS|(ECE|(IS|(ME|(EEE))))))[0-9]*", u))
		{
			System.out.println("USN belong to MIT");
		}
		
		
		else if(Pattern.matches("(4[AaLl0-9]*(CS|(ECE|(IS|(ME|(EEE))))))[0-9]*", u))
		{
			System.out.println("USN belong to Alwas");
		}
		
		else
		{
			System.out.println("Please Enter a Valid USN");
			
		}
	}

}
