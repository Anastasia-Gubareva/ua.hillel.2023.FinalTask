package hillel.lesson10;

public class Exceptions {

    static class EmptyDeckException extends Exception {
        public EmptyDeckException(String message) {
            super(message);
        }
    }

    static class InvalidCardIndexException extends Exception {
        public InvalidCardIndexException(String message) {
            super(message);
        }
    }
}
