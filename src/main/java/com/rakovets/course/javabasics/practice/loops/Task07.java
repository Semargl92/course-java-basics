package com.rakovets.course.javabasics.practice.loops;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Разработать программу для фитнес браслета.
 *
 * @author Dmitry Rakovets
 */
class Task07 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int startDistance = 50;
        int finishDistance = 100;
        double dailyProgress = 10;

        double totalDistance = calculateTotalDistance(startDistance, finishDistance, dailyProgress);
        System.out.printf("Result: %f", totalDistance);
    }

    /**
     * Рассчитывает пробег (т.е дистанцию, которую пробежал спортсмен за все тренировки), который совершит спортсмен
     * при подготовке к марафону.
     *
     * @param startDistance             дистанция которую пробегает спортсмен до начала тренировки
     * @param finishDistance            дистанция которую желает пробежать спортсмен после окончания тренировок
     * @param dailyProgressAsPercentage ежедневный прогресс в процентах по отношению к предыдущему забегу
     * @return пробег (с точностью до 2 знаков после десятичного разделителя)
     */
    static double calculateTotalDistance(int startDistance, int finishDistance, double dailyProgressAsPercentage) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода

        double progressDistance = startDistance;
        double totalDistanceCalculating = 0.0;

        while (progressDistance <= finishDistance && progressDistance != 0) {
            progressDistance += progressDistance * dailyProgressAsPercentage / 100;
            totalDistanceCalculating += progressDistance;
        }
        return BigDecimal.valueOf(totalDistanceCalculating).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
