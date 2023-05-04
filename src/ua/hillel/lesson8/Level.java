package ua.hillel.lesson8;

public enum Level {

    INFO ("Information: "),
    DEBUG("Debugging: "),
    WARN("Warning: "),
    ERROR("Error: ");
    private final String message;

    public String getMessage;

    Level(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

