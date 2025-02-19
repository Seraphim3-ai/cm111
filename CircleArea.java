import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args){

        double Area = 0;
        double R = 0;

            Scanner input = new Scanner(System.in);
                System.out.println("Please enter a radius");
        
        R = input.nextDouble();
            Area = Math.PI * (R * R);
                System.out.printf("The area of your circle is %.3f", Area);
    }  
}
