//Recursion+User Input
package Algorithm_BOU_CSE_6th_042;
import java.util.Scanner;
class FibonacciWithUserInput {
    int a,b,result=0;
    int series(int n){
        if(n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }
        else{
            return series(n-1)+series(n-2);
        }
    }
    //constructor
    FibonacciWithUserInput(){
        System.out.println("Input first two digits to start Fibonacci series: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Input Nth number for your output: ");
        int n=sc.nextInt();
        System.out.print(a+" ");
        System.out.println(b+" ");
        n=n-2;
        for(int i=0;i<n;i++){
            System.out.println(series(n)+" ");
        }
    }
}
