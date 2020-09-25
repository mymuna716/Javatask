
import java.lang.reflect.Array;
import java.util.*;
public class Sortarray {

   public static void main(String args[]){  
	   
	   int arr[]={5,6,1,2};
	   System.out.println("Before sorting");
	   for(int i = 0;i<arr.length;i++){
		  
	     
		System.out.print(arr[i]+" ");
	   }
	   System.out.println("");
	     System.out.println("After sorting");
	     Arrays.sort(arr);
	     for (int i = 0; i < arr.length; i++) {
	     System.out.println(arr[i]);
	     }
	     

}
}
