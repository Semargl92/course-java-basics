package com.rakovets.course.java.core.practice.jcf.list.studio;

import java.util.Comparator;

public class ActorComparatorBySurname implements Comparator<Actor> {
    @Override
    public int compare(Actor first, Actor second) {
        if (first == second) {
            return 0;
        } else if (first.getLastName().compareTo(second.getLastName()) > 0) {
            return 1;
        } else if (first.getLastName().compareTo(second.getLastName()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
