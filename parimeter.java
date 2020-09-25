import java.util.*;

 class Parimeter {
public void getParimeter(int radius)
 {  
	 double parimeter= 2*Math.PI*(radius);
	 double p=(double) parimeter;
	 System.out.println(p);
	 return;
 }
 
	public static void main(String args[]){ 
		Parimeter obj=new Parimeter();
		int radius[]={1,10,12,3,4};
		for(int i=0;i<=radius[i];i++)
		{
			obj.getParimeter(radius[i]);
			
			
		}
		
		
}
}
