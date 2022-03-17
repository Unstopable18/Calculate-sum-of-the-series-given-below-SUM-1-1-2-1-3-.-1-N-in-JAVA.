import java.util.Scanner;
public class seriessum1 
{
    static float sum(int n)
    {
        float i, s = 0;
        for (i = 1; i <= n; i++)
        s = s + 1/i;
        return s;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("\n*******************************");  
        System.out.println("Enter nth term: ");
        n = sc.nextInt(); 
        System.out.println("*******************************");  
        System.out.println("Series is 1 + 1/2 + 1/3 +.......1/"+n);
        System.out.println("\nSum of the Series = "+sum(n));
        System.out.println("\n*******************************"); 
    }
}
