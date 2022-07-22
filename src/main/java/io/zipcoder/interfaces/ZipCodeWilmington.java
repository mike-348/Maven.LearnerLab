package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington{

    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    public static ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
//        teacher.lecture(students.personList.toArray(new Student[0]), numberOfHours);
        Student[] studentArray = new Student[students.personList.size()];
        for (int i = 0; i < students.personList.size(); i++) {
            studentArray[i] = students.personList.get(i);
        }
        teacher.lecture(studentArray, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
//        instructors.findById(id).lecture(students.personList.toArray(new Student[0]), numberOfHours);
        Student[] studentArray = new Student[students.personList.size()];
        for (int i = 0; i < students.personList.size(); i++) {
            studentArray[i] = students.personList.get(i);
        }
        instructors.findById(id).lecture(studentArray, numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studyMap = new HashMap<>();
        Student[] studentArray = new Student[students.personList.size()];
        for (int i = 0; i < students.personList.size(); i++) {
            studentArray[i] = students.personList.get(i);
        }
        for (Student s : studentArray) {
            studyMap.put(s, s.getTotalStudyTime());
        }
        return studyMap;
    }
}
