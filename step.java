/*
 * OOPSBannerApp UC4 – Render OOPS as Banner
 * Using String Array and For-Each Loop
 */

public class step {

    public static void main(String[] args) {

        // String array to store banner lines
        String[] lines = new String[7];

        // OOPS Banner Design
        lines[0] = String.join(" ", " ***  ", " ***  ", " ***** ", " ***** ");
        lines[1] = String.join(" ", "**  **", "**  **", "**    * ","**     ");
        lines[2] = String.join(" ", "**  **", "**  **", "*****  ", " *****  ");
        lines[3] = String.join(" ", "**  **", "**  **", "**         ", "   **");
        lines[4] = String.join(" ", "**  **", "**  **", "**         ", "   **");
        lines[5] = String.join(" ", "**  **", "**  **", "**     ", "**  **");
        lines[6] = String.join(" ", " ***  ", " ***  ", " ***** ", " ****  ");

        // Print banner using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}