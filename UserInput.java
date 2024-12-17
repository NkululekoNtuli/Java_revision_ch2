import java.util.Scanner;

public class UserInput {

    public static  void main(String[] args){
        int anInt;
        String aString;
        byte abByte;
        short aShort;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer>> ");
        anInt = input.nextInt();
        System.out.print("Please enter an string>> ");
        input.nextLine();
        aString = input.nextLine();
        System.out.print("Please enter an float>> ");
        System.out.print("Please enter an byte>> ");
        abByte = input.nextByte();
        System.out.print("Please enter a short>> ");
        aShort = input.nextShort();

        System.out.println(anInt);
        System.out.println(aString);
        System.out.println(abByte);
        System.out.println(aShort);
    }
}
