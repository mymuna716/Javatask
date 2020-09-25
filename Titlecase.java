
public class Titlecase {

	public static void main(String[] args) {
		 String s="hello world is beautiful";
		 s=" "+s;
		 String r="";
		 for(int i=0;i<s.length();i++)
		 {
			 char ch=s.charAt(i);
			 if(ch==' ')
			 {
				r=r+ch;
				
				i++;
				
				ch=s.charAt(i);
				r=r+Character.toUpperCase(ch);
				//System.out.println(r);
			 }
			 else
			 {
				 r=r+ch;
				 
			 }
		 }
r=r.trim();
		 System.out.println(r);

	}

}
