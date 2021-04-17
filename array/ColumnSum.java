package ARRAY;
import java.util.*;
import java.util.Arrays;
public class ColumnSum {
    public static void main(String [] arg)
    {
        System.out.println("enter the number of rows and column for the matrix");
        Scanner input=new Scanner(System.in);
        int row=input.nextInt();
        int col=input.nextInt();
        int [][] refarray=new int[row][col];
        System.out.println("now lets take the input of the matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                refarray[i][j]=input.nextInt();
            }
        }
        System.out.println("enter the index value whose sum has to find ");
        int x=input.nextInt();
       int k= sumColumn(refarray,x);
       System.out.println("the sum of the array is " + k);

    }
    public static int sumColumn(int [][]var,int index)
    {
        int sum=0;
        for(int i=0;i<var.length;i++)
        {
            sum=sum+var[i][index];
        }
        return sum;

    }
}
