package io.zipcoder.interfaces;

public final class Students extends People<Student>{
    //eager initialization:
    private static final Students INSTANCE = new Students();

    private Students(){}

    public static Students getInstance() {
        return INSTANCE;
    }


}