package hillel.lesson8;



public class Main {

    public static void main(String[] args) {
        Logger.info(Level.INFO.getMessage());
        Logger.debug(Level.DEBUG.getMessage());
        Logger.warn(Level.WARN.getMessage());
        Logger.error(Level.ERROR.getMessage());
    }
}