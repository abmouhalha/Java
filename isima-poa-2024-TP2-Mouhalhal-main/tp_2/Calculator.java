import java.util.*;


public class Calculator {

    public static double divide(double a, double b)throws ArithmeticException, NegativeNumberException{
        
        
        if(a/b==0)
        {
            throw new ArithmeticException("Division par zéro !");
        }
        if(a/b<0)
        {
            throw new NegativeNumberException("Les nombres négatifs ne sont pas autorisés !");

        }

        return a/b;

    }
    
}
