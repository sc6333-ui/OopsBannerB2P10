/**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 * 
 * Uses String.join("", ...) to construct each line of the banner
 * instead of string concatenation with the + operator.
 * 
 * Each character (O, O, P, S) is 9 characters wide
 * and rendered in 7 lines.
 */

public class op44{

    public static void main(String[] args) {

        // Line 1
        System.out.println(String.join("",
                "  *****  ",
                "  *****  ",
                "  ****** ",
                "  ****** "
        ));

        // Line 2
        System.out.println(String.join("",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                " **      "
        ));

        // Line 3
        System.out.println(String.join("",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                " **      "
        ));

        // Line 4
        System.out.println(String.join("",
                " **   ** ",
                " **   ** ",
                " ******  ",
                "  *****  "
        ));

        // Line 5
        System.out.println(String.join("",
                " **   ** ",
                " **   ** ",
                " **      ",
                "      ** "
        ));

        // Line 6
        System.out.println(String.join("",
                " **   ** ",
                " **   ** ",
                " **      ",
                "      ** "
        ));

        // Line 7
        System.out.println(String.join("",
                "  *****  ",
                "  *****  ",
                " **      ",
                " ******  "
        ));
    }
}