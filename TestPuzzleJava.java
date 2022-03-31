import java.util.ArrayList;
import java.util.Arrays;

public class TestPuzzleJava 
{
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        char randomLetter = generator.getRandomLetter();
        String randomPassword = generator.generatePassword();
        ArrayList<String> randomPasswordSet = generator.getNewPasswordSet(4);
        String [] otro = generator.shuffleArray("Hola como estas");
		System.out.println(randomRolls);
        System.out.println(randomLetter);
        System.out.println(randomPassword);
        System.out.println(randomPasswordSet);
        System.out.println(Arrays.toString(otro));
    }
}
