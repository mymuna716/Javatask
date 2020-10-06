import java.util.regex.Pattern;

public class email {

	public static void main(String[] args) {
		//String s="mymuna12@gmail.implysys";
		String s="mymuna12@gmail.com";
		//String s="mymuna12@gmail.co.in";
		//String s="mymuna12gmail.com";
		//String s="mymuna12@gmailcom";
		
		if(Pattern.matches("([A-Za-z0-9]*\\@[A-Za-z]*(\\.[A-Za-z]*|(\\.[A-Za-z]*\\.[A-Za-z]*)))",s))
		  {
		System.out.println("valid mail");
	      }
		
		else	
		{
		System.out.println("invalid");
	    }

}
	
}
