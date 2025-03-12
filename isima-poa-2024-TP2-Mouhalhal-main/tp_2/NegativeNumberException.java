import java.util.*;

public class NegativeNumberException extends Exception {

    public NegativeNumberException() {
        super("Un nombre négatif a été fourni !");
    }
    public NegativeNumberException(String message) {
        super(message);
    }
    
}
