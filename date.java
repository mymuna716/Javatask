import java.util.Arrays;
import java.util.regex.Pattern;

public class Date {
	public static void main(String[] args) {
		
		String date="011-03-2020";
		String arr[]=date.split("-");
		System.out.println(date);
		//System.out.println(Arrays.toString(arr));
		//System.out.println(arr[1]);
		String year=arr[2];
		String month=arr[0];
		String day=arr[1];
		if(Pattern.matches("01|1", month))
		{
			String months="jan";
			System.out.println(day+"/"+months+"/"+year);
			
		}
		else if(Pattern.matches("02|2", month))
		{
			String months="feb";
			System.out.println(day+"/"+months+"/"+year);
		}
		else if(Pattern.matches("03|3", month))
		{
			String months="mar";
			System.out.println(day+"/"+months+"/"+year);
		}
		else if(Pattern.matches("04|4", month))
		{
			String months="april";
			System.out.println(day+"/"+months+"/"+year);
		}
		else if(Pattern.matches("05|5", month))
		{
			String months="may";
			System.out.println(day+"/"+months+"/"+year);
		}
		else if(Pattern.matches("06|6", month))
		{
			String months="june";
			System.out.println(day+"/"+months+"/"+year);
		}
		else if(Pattern.matches("07|7", month))
		{
			String months="july";
			System.out.println(day+"/"+months+"/"+year);
		}
		else if(Pattern.matches("08|8", month))
		{
			String months="augst";
			System.out.println(day+"/"+months+"/"+year);
		}
		else if(Pattern.matches("09|9", month))
		{
			String months="sep";
			System.out.println(day+"/"+months+"/"+year);
		}
		else if(Pattern.matches("10", month))
		{
			String months="oct";
			System.out.println(day+"/"+months+"/"+year);
		}
		else if(Pattern.matches("11", month))
		{
			String months="nov";
			System.out.println(day+"/"+months+"/"+year);
			
		}
		else if(Pattern.matches("12", month))
		{
			String months="dec";
			System.out.println(day+"/"+months+"/"+year);
			
		}
		else
		{
			System.out.println("invlid");
		}
		
					
		}
	}

