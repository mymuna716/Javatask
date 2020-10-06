import java.util.regex.Pattern;

public class Phone {

	public static void main(String[] args) {
		String p="9562126983";
		//String p="+919562126983";
		//String p="+91-9562126983";
		//String p="+91--9562126983";
		if(Pattern.matches("(([0-9]{10})|(\\+91[0-9]{10})|(\\+91-[0-9]{10}))",p))
			{
				System.out.println("valid phone");
			}
			else
			{
				System.out.println("invalid phone ");
			}

	}
	
}

