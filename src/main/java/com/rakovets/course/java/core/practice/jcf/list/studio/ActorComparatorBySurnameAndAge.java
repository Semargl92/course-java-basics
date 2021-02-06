package com.rakovets.course.java.core.practice.jcf.list.studio;

import java.util.Comparator;

public class ActorComparatorBySurnameAndAge implements Comparator<Actor> {
    @Override
    public int compare(Actor first, Actor second) {
        if (first == second) {
            return 0;
        }
        ActorComparatorBySurname surname = new ActorComparatorBySurname();
        ActorComparatorByAge age = new ActorComparatorByAge();

        if (surname.compare(first, second) != 0) {
            return surname.compare(first, second);
        } else {
            return age.compare(first, second);
        }
    }
}
