package curs08.functional.challenge3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    public static void exercise1(){
        List<String> list01 = new ArrayList<>(List.of("ana","are", "mere"));
        String result = getStringFromFIstLetter(list01);
        System.out.println(result);
    }

    private static String getStringFromFIstLetter(List<String> words){
        return words.stream()
                .map(word -> word.charAt(0))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }

    public static void exercise2(){
        List<String> list01 = new ArrayList<>(List.of("ana","are", "mere"));
        List<String> result = removeOddStrings(list01);
        System.out.println(result);
    }

    private static List<String> removeOddStrings(List<String> words){
        return words.stream()
                .filter(word -> word.length() % 2 == 0)
                .collect(Collectors.toList());
    }

    public static void exercise3(){
        List<String> list01 = new ArrayList<>(List.of("ana","are", "mere"));
        List<String> result = toUpperCaseWords(list01);
        System.out.println(result);
    }

    private static List<String> toUpperCaseWords(List<String> words){
        return words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void exercise4(){
        Map<String, Integer> map01 = new HashMap<>();
        map01.put("Ana", 6);
        map01.put("are", 14);
        map01.put("mere", 66);
        map01.put("verzi", 2);
        String result = fromMapToString(map01);
        System.out.println(result);
    }

    private static <K, V> String fromMapToString(Map<K, V> input){
        return input.entrySet().stream()
                .map(entry -> "" + entry.getKey() + " - " + entry.getValue())
                .collect(StringBuilder::new, (acc, str) -> acc.append(str).append(" | "), StringBuilder::append)
                .toString();
    }

    public static void exercise5(){
        List<Integer> list01 = new ArrayList<>(List.of(6, 3, 8, 4, 5));
        printList(list01);
    }

    private static void printList(List<Integer> numbers){
        numbers.forEach(number -> new Thread(String.valueOf(number)){
            @Override
            public void run(){
                System.out.println(getName());
            }
        }.start());

    }
}
