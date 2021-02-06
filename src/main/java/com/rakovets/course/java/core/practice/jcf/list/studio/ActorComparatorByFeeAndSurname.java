package com.rakovets.course.java.core.practice.jcf.list.studio;

import java.util.Comparator;

public class ActorComparatorByFeeAndSurname implements Comparator<Actor> {
    @Override
    public int compare(Actor first, Actor second) {
        if (first == second) {
            return 0;
        }
        ActorComparatorByFee fee = new ActorComparatorByFee();
        ActorComparatorBySurname surname = new ActorComparatorBySurname();

        if (fee.compare(first, second) != 0) {
            return fee.compare(first, second);
        } else {
            return surname.compare(first, second);
        }
    }
}
