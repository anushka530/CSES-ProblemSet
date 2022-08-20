package csesProblemSet;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Permutations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
	  if(n==1)
	  {
		System.out.print("1");
	  }
      else if(n==2 || n==3)
        {
			System.out.print("NO SOLUTION");
		}
		else{
		for(int i=2;i<=n;i+=2)
		{
			sb.append(i+" ");
		}
		for(int i=1;i<=n;i+=2)
		{
			
			sb.append(i+" ");
		}
		System.out.print(sb);
		
		
	}

}
}

