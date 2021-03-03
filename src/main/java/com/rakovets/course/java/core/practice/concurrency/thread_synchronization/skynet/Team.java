package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet;

import java.util.LinkedList;
import java.util.List;

public class Team implements Runnable {
    private final FactoryStore store;
    private final List<RoboParts> parts;
    private int numberOfRobots = 0;

    public Team(FactoryStore store) {
        this.store = store;
        this.parts = new LinkedList<>();
    }

    @Override
    public void run() {
        parts.addAll(store.loot());
        assembleRobots();
    }

    private void assembleRobots() {
        while (parts.containsAll(RoboParts.getModel())) {
            parts.remove(RoboParts.HEAD);
            parts.remove(RoboParts.TORSO);
            parts.remove(RoboParts.HAND);
            parts.remove(RoboParts.HAND);
            parts.remove(RoboParts.FEET);
            parts.remove(RoboParts.FEET);
            numberOfRobots += 1;
        }
    }

    public int getNumberOfRobots() {
        return numberOfRobots;
    }

    public List<RoboParts> getParts() {
        return parts;
    }
}
