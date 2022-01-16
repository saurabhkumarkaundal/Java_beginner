Task8:-There are N trees in Terry's front yard. He is supposed to measures the height of each tree and find the average height of trees in his yard. What is the average height of a tree in Terry's front yard?
Note:- Print your answer as floor value (average height)
Input
5
6
8 
34 
9 
3

Output
12

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Main {
	public static void main (String[] args) {
					  int n;
					  Scanner sc=new Scanner(System.in);
					  n=sc.nextInt();
					  int trees[]=new int[n];
					  for (int i=0; i<n; i++){
						  trees [i]=sc.nextInt();
					  }
					  long sum =0;
					  for(int i=0; i<n; i++){
						  sum+=trees[i];
					  }
					  System.out.println(sum/n);
	}
}
