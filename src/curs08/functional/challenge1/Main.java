package curs08.functional.challenge1;

import jdk.jfr.StackTrace;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Main {
    @Test
    public void consumer_1(){
        List<String> list  = new ArrayList<>(Arrays.asList("a", "b", "c"));

        Consumer<List<String>> consumer = (list1) -> list1.removeAll(list1);
        consumer.accept(list);

        Assert.assertEquals(list, new ArrayList<>());
    }

    @Test
    public void consumer_2(){
        List<String> list1  = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> list2  = new ArrayList<>(Arrays.asList("a", "b", "c", "first", "second"));

        Consumer<List<String>> c1 = (list) -> list.add("first");
        Consumer<List<String>> c2 = (list) -> list.add("second");

        Consumer<List<String>> consumer = c1.andThen(c2);
        consumer.accept(list1);

        Assert.assertEquals(list1, list2);
    }
}
