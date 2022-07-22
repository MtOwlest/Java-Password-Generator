import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //first 1
        double random1 = Math.random();
        double random2 = Math.random();
        double random3 = Math.random();
        double random4 = Math.random();
        double random5 = Math.random();

        String UniquePass1 = "";
        String UniquePass2 = "";
        String UniquePass3 = "";
        String UniquePass4 = "";
        String UniquePass5 = "";

        System.out.println("If you want a password, please type: New Password - Now check your Passwords.txt folder!");

        Scanner scanner = new Scanner(System.in);

        if (scanner.nextLine().equals("New Password")){
            Randomizer(UniquePass1, random1);

        }
        System.out.println(UniquePass2);
        if (scanner.nextLine().equals("New Password")){
            Randomizer(UniquePass2, random2);

        }
        System.out.println(UniquePass3);
        if (scanner.nextLine().equals("New Password")){
            Randomizer(UniquePass3, random3);

        }
        System.out.println(UniquePass4);
        if (scanner.nextLine().equals("New Password")){
            Randomizer(UniquePass4, random4);

        }
        System.out.println(UniquePass5);
        if (scanner.nextLine().equals("New Password")){
            Randomizer(UniquePass5, random5);
        }

        System.out.println("Ur done :)");

    }

    public static void Randomizer(String UniquePass, double random){
        if (random <= 1) {
            random *= 10;
        }

        if (random > 2 && random < 4) {
            UniquePass = random + "#";
        }

        if (random > 0 && random < 2) {
            UniquePass = random + "$";
        }

        if (random > 4 && random < 6) {
            UniquePass = random + "&";
        }

        if (random > 6 && random < 8) {
            UniquePass = random + "%";
        }

        if (random > 8 && random < 10) {
            UniquePass = random + "@";
        }

        if (random > .00000001 && random < .3) {
            UniquePass = UniquePass + "^";
        }

        if (random > .3 && random < .6) {
            UniquePass = UniquePass + "!";
        }

        if (random > .6 && random < .8) {
            UniquePass = UniquePass + "+";
        }

        if (UniquePass.contains("9")){
            UniquePass = UniquePass.replace("9", "$");
        }

        if (UniquePass.contains("8")){
            UniquePass = UniquePass.replace("8", "$~*#");
        }

        if (UniquePass.contains("3")){
            UniquePass = UniquePass.replace("3", "}*#^");
        }

        System.out.println("Randomized: " + UniquePass);
    }
}
