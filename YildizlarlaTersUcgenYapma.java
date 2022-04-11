
package tersucgenyapmprogrami;
import java.util.*;
public class TersUcgenYapmProgrami {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi = input.nextInt();
        
        for(int i=sayi; i>=0;i--)
        {
            for(int j=i; j<sayi; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i;k++)
            {
                System.out.print("*");
                System.out.print(" ");
                
            }
            
            System.out.println(" ");
        }
        
        
    }
    
}