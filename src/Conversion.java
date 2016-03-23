import java.util.Scanner;

public class Conversion {
    public static void main(String[] args){
       System.out.print("Feet            Meters          |");
       System.out.println("           Meters        Feet         ");
       System.out.print("------------------------------------");
       System.out.println("-----------------------------------");
       double foot = 1.0;
       double meter = 20.0;

       for (foot = 1.0; foot <= 10; foot++){  
         System.out.printf("%5.1f", foot);
         System.out.print("           ");
         System.out.printf("%-16.3f", footToMeter(foot));
         System.out.print("|");
         System.out.printf("%15.1f", meter);
         System.out.print("       ");
         System.out.printf("%10.3f", meterToFoot(meter));
         System.out.println();
         meter += 5.0;
       } // for foot
    } // main
    
    public static double footToMeter(double foot){
        return 0.305 * foot;             
    } // footToMeter
    
    public static double meterToFoot(double meter){
        return 3.279 * meter;
    } // meterToFoot
} // class Conversion
