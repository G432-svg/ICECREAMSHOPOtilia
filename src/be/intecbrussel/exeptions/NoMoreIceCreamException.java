package be.intecbrussel.exeptions;

import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class NoMoreIceCreamException extends RuntimeException {

    public NoMoreIceCreamException(){
        this("No more ice in the stock!");
    }

    public NoMoreIceCreamException(String message) {
        super(message);
    }

    public NoMoreIceCreamException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoMoreIceCreamException(Throwable cause) {
        super(cause);
    }

    public NoMoreIceCreamException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
