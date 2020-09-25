

	import java.util.*; 
	  
	class Surname { 
		 public static void main(String[] args) 
		    { 
		        String str = "Mohan Manoj Das"; 
		int len = str.length(); 
	        String t = ""; 
	        for (int i = 0; i < len; i++) { 
	            char ch = str.charAt(i); 
	  
	            if (ch != ' ') { 
	  
	                t = t + ch; 
	            } 
	  
	            else { 
	                
	                System.out.print(Character.toUpperCase(t.charAt(0))+" "); 
	               // t = ""; 
	            } 
	        }
		    }
		    
		    }
		  
