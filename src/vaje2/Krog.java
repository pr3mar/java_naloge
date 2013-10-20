import java.util.Scanner;

class Circle
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int r = scan.nextInt();
        
        for(int y = -r; y < r; y++)
        {
            int size = (int)Math.sqrt(r*r - y*y);
            
            for(int j = r - size - 1; j >= 0; j--)
                System.out.print(" ");
            
            for(int j = 0; j < size*2; j++)
                System.out.print("*");
            
            System.out.print("\n");
        }        
    }
}
