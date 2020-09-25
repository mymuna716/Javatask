
public class Palindrome {

	public static void main(String[] args) {
		
		
		String str="moom";
		 StringBuffer sb=new StringBuffer("moom");
		 
		 //String rev= str.reverse();
        String rev=sb.toString();  
        if(str.equals(rev)){  
           System.out.println("palindrom");  
        }else{  
        	 System.out.println("not palindrom");     
	}

	}}
