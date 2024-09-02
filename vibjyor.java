import java.util.*;
public class vibjyor {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        // Reset
        String color=s.next();
        final String RESET = "\033[0m";  // Text Reset

        // Regular Colors
        final String VIOLET = "\033[0;45m";  // VIOLET (Purple)
        final String INDIGO = "\033[0;44m";  // INDIGO (Blue)
        final String BLUE = "\033[0;44m";    // BLUE
        final String GREEN = "\033[0;42m";   // GREEN
        final String YELLOW = "\033[0;43m";  // YELLOW
        final String ORANGE = "\033[0;40m";  // ORANGE (Using red as closest color)
        final String RED = "\033[0;41m";     // RED

        // Example usage
        String rainbowText="";
        switch(color)
        {
            case "V": rainbowText = VIOLET;
            break;
            case "I": rainbowText = INDIGO;
            break;
            case "B": rainbowText = BLUE;
            break;
            case "G": rainbowText = GREEN;
            break;
            case "Y": rainbowText = YELLOW;
            break;
            case "O": rainbowText = ORANGE;
            break;
            case "R": rainbowText = RED;
            break;
        }
        System.out.print(rainbowText+"Rainbow Color");
    }
}
