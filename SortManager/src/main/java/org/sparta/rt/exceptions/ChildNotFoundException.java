package org.sparta.rt.exceptions;

public class ChildNotFoundException extends Exception{

    @Override
    public String getMessage() {
        return "Element requested could not be found in this binary tree";
    }
}
