package ru.netology.services;

public class Vacation {
    public int calculateService(int income, int expenses, int threshold) {
        int monthCount = 0;
        int haveMoney = 0;

        for (int month = 1; month <= 12; month++) {
            if (haveMoney < threshold) {
                System.out.println("Месяц " + month + ". Денег " + haveMoney + ". Придётся работать. Заработал +" + income + ", потратил -" + expenses);
                haveMoney = haveMoney + income - expenses;
            } else {
                System.out.println("Месяц " + month + ". Денег " + haveMoney + ". Буду отдыхать. Потратил -" + expenses + ", затем ещё -" + ((haveMoney - expenses) / 3) * 2);
                haveMoney = (haveMoney - expenses) / 3;
                monthCount++;
            }
        }
        System.out.println();
        return monthCount;
    }
}
