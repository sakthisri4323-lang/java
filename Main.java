
class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class MAIN {
    public static void main(String[] args) {
        int age = 16;

        try {
            if (age < 18) {
                throw new MyException("Age must be 18 or above");
            }
            System.out.println("Eligible to vote");
        } catch (MyException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
