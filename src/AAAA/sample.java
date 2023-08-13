package AAAA;
import java.util.Scanner;

public class sample{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row number: ");
        int row=sc.nextInt();

        System.out.print("Enter column number: ");
        int column=sc.nextInt();

        int array[][]=new int[row][column];

        System.out.println("Enter elements of array:");
        
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
         array[i][j]=sc.nextInt();
            }
        }
        
        // logic for problem
        int positive=0,negative=0,odd=0,even=0,zero=0;
       for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
        if(array[i][j]>0)positive +=1;
        if (array[i][j]<0)negative +=1;
        if (array[i][j]%2==1)odd +=1;
        if (array[i][j]%2==0)even +=1;
        if (array[i][j]==0)zero +=1; }
        }
        System.out.println();
        System.out.print("Number of positive numbers="+positive);System.out.println();
        System.out.print("Number of nagative numbers="+negative);System.out.println();
        System.out.print("Number of odd numbers="+odd);System.out.println();
        System.out.print("Number of even numbers="+even);System.out.println();
        System.out.println("Number of 0="+zero);
        sc.close();
    }
}