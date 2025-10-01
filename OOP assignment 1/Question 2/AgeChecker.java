class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeChecker {

    static int age;
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException ("Access Denied: You must be 18 or older!");
        } 
        else {
            System.out.println("Access Granted: Welcome!");
        }
    }

    public static void main(String[] args) {
        try {
            age = 20; // Example age
            checkAge(age);
        } catch (InvalidAgeException e) {
           // Catch and Display Exception Message
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
