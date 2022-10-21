package org.sparta.rt.exceptions;

public class IncorrectMaxValueException extends Exception{

    @Override
    public String getMessage() {
        return "Max Value chosen for Array Indexes is Incorrect. The program has chosen the value of '100'";
    }
}
