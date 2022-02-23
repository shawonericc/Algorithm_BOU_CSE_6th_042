
package Algorithm_BOU_CSE_6th_042;

import java.util.Scanner;

public class Input {
    int num,i,j;
    Scanner input=new Scanner(System.in);
 //public int sort(){}  ekta value pass korar jonno..
    //array er jonno  public int[] sort(){}
    public int sort(){
        return 0;
    }
    
    public int[] sort_input(){
        System.out.println("Enter the number of integer to sort: ");
        num= input.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter "+num+" integer: ");
        
        for(i=0;i<num;i++){
            arr[i]=input.nextInt();
        }
        return arr; 
    }
    
    public int single_input(){
        
        return 0;
    }
}
