import java.util.Scanner;

public class Ex3 {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	        int i,j,n,temp;
	        int[] a = new int[10];
	     System.out.println("Enter the elements") ;
	     for(i=0;i<10;i++)
	     {
	         a[i] = sc.nextInt();
	     }
	for(i=0;i<10;i++)
	     {
	         for(j=i+1;j<10;j++)
	         {
	             if(a[i]>a[j])
	             {
	                temp=a[i];
	                 a[i]=a[j];
	                 a[j]=temp;
	             }
	        }
	     }
	     System.out.println("Elements sorted in ascending order are");
	     for(i=0;i<10;i++)
	     {
	         System.out.print(a[i]+" ") ;
	     }
	}

}
