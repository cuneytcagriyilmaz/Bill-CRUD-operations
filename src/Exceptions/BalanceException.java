package Exceptions;

public class BalanceException extends Exception{
    public BalanceException(String message){
        System.out.println(message);
    }
}
