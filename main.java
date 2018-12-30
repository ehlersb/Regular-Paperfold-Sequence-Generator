import java.util.Scanner;

/**
 * Created by Benjamin Ehlers on 12/30/2018.
 */
public class main {

    public static void main(String[] args) {
        String input;
        System.out.println("Enter how many cycles you would like to generate in the dragon curve. ");
        System.out.println("Enter '!' to quit.");
        DragonCurve dragonCurve = new DragonCurve();
        while(true) {
            Scanner scan = new Scanner(System.in);
            input = scan.nextLine();
            if(input.equals("!")) break;
            System.out.println(dragonCurve.generateCurve(Integer.parseInt(input)));
        }
    }
}
