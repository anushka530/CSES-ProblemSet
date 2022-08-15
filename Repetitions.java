import java.util.*;
public class Repetitions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		int curr=1;
		int max=1;
		for(int i=1;i<n;i++)
		{
			if(s.charAt(i)==(s.charAt(i-1)))
				curr++;
			else
			{
				max = Math.max(curr, max);
				curr =1;
			}
		}
		
      System.out.print(Math.max(curr,max));
	}

}
