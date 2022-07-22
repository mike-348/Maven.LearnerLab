package io.zipcoder.interfaces;

public class Instructors extends People<Instructor>{

    private static Instructors INSTANCE = new Instructors();

    public static Instructors getInstance() {
        return INSTANCE;
    }

    @Override
    public Instructor[] getArray() {
        return personList.toArray(new Instructor[personList.size()]);
    }
}
