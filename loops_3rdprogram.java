Task_3:-Given an integer n, your task is to print a right angle triangle pattern of consecutive numbers of height n.
eg:-
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5


static void pattern(int n){
for (int i=1; i<=n; i++)
{
    for(int j=1; j<=i; j++)
    {
        System.out.print(j+" ");
    }
    System.out.println();
}
}
