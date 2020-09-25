import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		String[] names = {"Vani", "Bevi", "Fzi", "Mymu"};
		System.out.println("Before sorting:");
		for(int i =0;i<names.length;i++)
		{
			System.out.print(names[i]+" ");
		}
		System.out.println(" ");
		System.out.println("After sorting:");
		Arrays.sort(names);
		for(int i =0;i<names.length;i++)
		{
			System.out.print(names[i]+" ");
		}
		
	}
}
