
import java.util.Scanner;
public class Ex4
{
    public static void main(String[] args) 
    {
        int n, x, flag = 0, i = 0;
        Scanner s = new Scanner(System.in);
        
        int a[] = new int[10];
        System.out.println("Enter all the elements:");
        for(i = 0; i < 10; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the element you want to find:");
        x = s.nextInt();
        for(i = 0; i < 10; i++)
        {
            if(a[i] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found at position:"+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
