package io.zipcoder.interfaces;

public enum Educator implements Teacher{

    KRIS(001, "kris"), DOLIO(002, "dolio"), KAREN(003, "karen");

    Instructor instructor;
    double timeWorked;

    Educator(long id, String name) {
        this.instructor = new Instructor(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        this.timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        for (Learner l : learners) {
            l.learn(numberOfHours/ learners.length);
        }

    }
}
