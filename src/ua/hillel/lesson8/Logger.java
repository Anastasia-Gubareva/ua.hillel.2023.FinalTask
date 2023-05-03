package ua.hillel.lesson8;

public class Logger {

    public static void info (String message )  {
        System.out.println(Color.ANSI_BLUE + message + Color.ANSI_RESET);
        }

    public static void debug (String message) {

        System.out.println(Color.ANSI_GREEN + message + Color.ANSI_RESET);
        }

    public static void warn (String message)  {

        System.out.println(Color.ANSI_YELLOW + message + Color.ANSI_RESET);
        }

    public static void error (String message) {
        System.out.println(Color.ANSI_RED   + message + Color.ANSI_RESET);
        }
}

