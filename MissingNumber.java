package csesProblemSet;
import java.util.*;
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n-1;i++)
		{
			int val = sc.nextInt();
			arr[--val] = 1;
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i] == 0)
			{
				System.out.print(i+1);
				break;
			}
		}

	}

}
