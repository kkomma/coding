package aaalme;

// Define the custom exception class
class ExceptionMessage extends Exception {
    private String message;
    private int code;

    public ExceptionMessage(String message, int code) {
        super(message);
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
}

// Example class that uses the custom exception
class Example {
    public void doSomething() throws ExceptionMessage {
        try {
            // Simulate an error
            int x = 5 / 0;
        } catch (Exception e) {
            // Wrap the exception in a custom exception
            throw new ExceptionMessage("Error dividing by zero!", 500);
        }
    }
}

// Main class to test the example
public class CustomException {
    public static void main(String[] args) {
        Example example = new Example();
        try {
            example.doSomething();
        } catch (ExceptionMessage e) {
            System.out.println("Custom Exception Caught!");
            System.out.println("Message: " + e.getMessage());
            System.out.println("Code: " + e.getCode());
        }
    }
}
