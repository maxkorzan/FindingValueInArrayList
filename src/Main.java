import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i=0;i<10;i++){
            numbers.add(randomNumber());
        }

        System.out.println("ArrayList: "+numbers);
        System.out.print("Value to find: ");
        int userResponse = sc.nextInt();

        if(numbers.contains(userResponse)){
            System.out.println(userResponse+" is in the ArrayList.");
        }

    }

    //random number generator
    public static int randomNumber(){
        Random rand = new Random();
        int randnum = rand.nextInt(50);
        return randnum;
    }
}
