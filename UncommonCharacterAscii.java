import java.util.Set;
import java.util.HashSet;

public class UncommonCharacterAscii {

    public static void main(String[] args) {
        Set<Character> input1 = Set.of('A', 'B', 'C');
        Set<Character> input2 = Set.of('B', 'C', 'D');
        
        // Find the uncommon character from input1
        Set<Character> uncommon = new HashSet<>(input1);
        uncommon.removeAll(input2);

        if (!uncommon.isEmpty()) {
            char uncommonChar = uncommon.iterator().next();
            int asciiValue = (int) uncommonChar;

            // Reduce the ASCII value to a single digit
            int result = reduceToSingleDigit(asciiValue);

            System.out.println(result);
        } else {
            System.out.println("No uncommon character found.");
        }
    }

    private static int reduceToSingleDigit(int number) {
        while (number >= 10) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }
        return number;
    }
}