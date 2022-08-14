package csesProblemSet;
import java.util.*;
public class WeirdAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        System.out.print(n);
        while(n!=1)
        {
        	if(n%2!=0)
        	{
        		n = n*3 + 1;
        	}
        	else
        	{
        		n = n/2;
        	}
        	System.out.print(" "+ n);
        }
	}

}
