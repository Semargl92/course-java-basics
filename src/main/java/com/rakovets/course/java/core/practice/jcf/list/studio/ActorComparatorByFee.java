package com.rakovets.course.java.core.practice.jcf.list.studio;

import java.util.Comparator;

public class ActorComparatorByFee implements Comparator<Actor> {
    @Override
    public int compare(Actor first, Actor second) {
        if (first == second) {
            return 0;
        } else if (first.getFee() > second.getFee()) {
            return 1;
        } else if (first.getFee() < second.getFee()) {
            return -1;
        } else {
            return 0;
        }
    }
}
