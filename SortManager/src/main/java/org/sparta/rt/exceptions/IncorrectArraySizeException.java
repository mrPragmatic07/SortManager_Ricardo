package org.sparta.rt.exceptions;

public class IncorrectArraySizeException extends Exception {

    @Override
    public String getMessage() {
        return "Size chosen for Array is Incorrect. The Size of will be set to '100'";
    }
}
