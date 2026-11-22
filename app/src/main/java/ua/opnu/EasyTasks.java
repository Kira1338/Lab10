package ua.opnu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EasyTasks {

    public static void main(String[] args) {
        // Для виконання лабораторної роботи необхідно написати вміст методів згідно умовам завдання,
        // після чого протестувати метод за допомогою тестів, які знаходяться в папці
        // src\test\TaskTest.java
    }

    public List<Integer> doubling(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer n : nums) {
            result.add(n * 2);
        }

        return result;
    }

    public List<Integer> square(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer n : nums) {
            result.add(n * n);
        }
        return result;
    }

    public List<String> moreY(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String s : strings){
            result.add("y" + s + "y");
        }

        return result;
    }

    public List<Integer> noNeg(List<Integer> nums) {
        List<Integer> result= new ArrayList<>();
        for (Integer n : nums) {
            if (n>=0) result.add(n);
        }
        return result;
    }

    public List<Integer> no9(List<Integer> nums) {
        List<Integer> result= new ArrayList<>();
        for (Integer n : nums) {
            if (Math.abs(n % 10) != 9) result.add(n);
        }
        return result;
    }

    public List<String> noZ(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String s : strings){
            if (s != null && !s.contains("z")) result.add(s);
        }
        return result;
    }

    public List<String> refinedStrings(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            if (!result.contains(s)) result.add(s);

        }

        result.sort((a, b) -> Integer.compare(b.length(), a.length()));
        return result;

    }

    public List<String> flatten(List<String> strings) {
        return strings.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .toList();

    }

}