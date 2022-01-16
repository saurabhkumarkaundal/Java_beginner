Task 6:-Given a number N, your task is to convert the number into a single digit by repeatedly replacing the number N with its sum of digits until the number becomes a single digit.
Sample Input:-
987

Sample Output:-
6


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
	public static void main (String[] args) {
                      Scanner sc=new Scanner(System.in);
                      int num,sum,finalResult=0;
                      num=sc.nextInt();
                      do{
                              sum=0;
                              while ((num/10)>0){
                                      int dig=num%10;
                                      sum+=dig;
                                      num=num/10;
                              }
                              sum =sum+(num%10);
                              num= sum;
                      }while((sum/10)>0);
                      finalResult=sum;
                      System.out.println(finalResult);
	}
}
