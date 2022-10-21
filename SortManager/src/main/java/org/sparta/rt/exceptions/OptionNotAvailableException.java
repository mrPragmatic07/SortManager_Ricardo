package org.sparta.rt.exceptions;

public class OptionNotAvailableException extends Exception{

    @Override
    public String getMessage() {
        return "Option is not available. The Programme has selected Bubble Sort as Default";
    }
}
