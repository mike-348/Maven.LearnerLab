package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People<E extends Person> implements Iterable<E>{

    List<E> personList = new ArrayList<>();


    public void add(E person) {
        personList.add(person);
    }

    public E findById(long id) {
        for (E p : personList) {
            if (p.getID() == id) {
                return p;
            }
        }
        return null;
    }

    public Boolean contains(E person) {
        return personList.contains(person);
    }

    public void remove(E person) {
        personList.remove(person);
    }

    public void remove(long id) {
        personList.remove(findById(id));
    }

    public void removeAll() {
        for (E p : personList) {
            personList.remove(p);
        }
    }

    public Integer count() {
        return personList.size();
    }

    public Person[] toArray(List<E> personList) {
        return personList.toArray(new Person[0]);

    }

    @Override
    public Iterator<E> iterator() {
        return personList.iterator();
    }
}
