Task5:-Given a number N, you need to check whether the given number is Armstrong number or not. Now what is Armstrong number let us see below:
A number is said to Armstrong if it is equal to sum of cube of its digits.
Output
You need to return "true" if the given number is an Armstrong number otherwise "false"
  
  static boolean isArmstrong(int N)
    {
        // your code here
        int a = 0;
        int n=N;

        while (N != 0)
        {
           int reminder =N%10;
            a=a+ (reminder*reminder*reminder);
            N=N/10;
        }

        if(a == n)
            return true;
        else
            return false;
    }
