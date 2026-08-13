
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TextIO {
    

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // Reads an integer from the user
    public static int getInt() {
        try {
            return Integer.parseInt(reader.readLine().trim());
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid integer input.");
        }
    }

    // Reads an integer from the current line
    public static int getlnInt() {
        return getInt();
    }

    // Reads a double from the user
    public static double getDouble() {
        try {
            return Double.parseDouble(reader.readLine().trim());
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid number input.");
        }
    }

    // Reads a character from the user
    public static char getChar() {
        try {
            String input = reader.readLine();

            if (input == null || input.isEmpty()) {
                throw new IllegalArgumentException("No character entered.");
            }

            return input.charAt(0);

        } catch (IOException e) {
            throw new IllegalArgumentException("Unable to read character.");
        }
    }
}
