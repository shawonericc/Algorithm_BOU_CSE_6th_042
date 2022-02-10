
package Algorithm_BOU_CSE_6th_042;
import  java.util.Scanner;
public class Algorithm{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            System.out.println("-----------------------------\n"
                              +"   ***Computer Algorithm***  \n"
                              +"-----------------------------\n"
                              +"1. Data Structure\n"
                              +"2. Algorithm");
            
         System.out.println("Type your choise: ");
         int choice=s.nextInt();
         if(choice==1){
             System.out.println("-------------- ---\n"
                               +" *Data Structure* \n"
                               +"------------------\n"
             +"1. Linear Search\n"
             +"2. Binary Search\n"
             +"3. Bubble Sort\n"
             +"4. Insertion Sort\n"
             +"5. Selection Sort\n"
             +"6. Merge Sort\n"
             +"7. Quick Sort\n"
             +"8. Counting Sort\n"
             +"9. Radix Sort\n"
             +"10. Bucket Sort\n"
             +"11. Shell Sort\n"
             +"12. Stack\n"
             +"13. Queue\n"
             +"14. Linked List\n"
             +"15. Heap Sort\n"
             +"16. Binary Search Tree\n"
             +"17. Fibonacci Numbers\n"
             +"18. Euclidean GCD Algorithm\n"
             +"19. Univsersal Hashing\n");
       System.out.println("\n");
       System.out.println("Enter Your DataStructure choice: ");
       int n1=s.nextInt();

               switch(n1){
                   case 1:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 2:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                
                   case 3:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 4:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 5:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 6:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 7:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 8:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 9:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 10:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 11:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 12:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 13:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 14:
                       Linked lk=new Linked();
                       lk.linked_display();
                       
                       break;
                   case 15:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 16:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 17:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 18:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 19:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   default:
                       System.out.println("Invalid choice");
               }
         }
         else{
             System.out.println("-------------\n"
             +"    *Algorithm*    \n"
             +"-----------------\n"
             +"1. Graph Representation\n"
             +"2. BFS\n"
             +"3. DFS\n"
             +"4. TOPOLOGICAL SORT\n"
             +"5. KRUSHKAL\n"
             +"6. PRIM'S\n"
             +"7. DIJKASTRA\n"
             +"8. BELMEN FORD\n"
             +"9. FLOYED-WARSHALL\n");
         
            System.out.println("Choose your Algorithm choice: ");
            int n2=s.nextInt();
                switch(n2){
                   case 1:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 2:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 3:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 4:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 5:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 6:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 7:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 8:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   case 9:
                       System.out.println("Sorry This code is in note created yet!!!");
                       break;
                   default:
                       System.out.println("Invalid choice!!");
                }
            }
            
        }
    }
    
}
