package curs08.functional.challenge2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    @Test
    public void predicate_1(){
        Predicate<String> p1 = s -> s.isEmpty();
        Predicate<String> notPredicate = p1.negate();
        Assert.assertFalse(notPredicate.test(""));
        Assert.assertTrue(notPredicate.test("Nor empty!"));
    }

    @Test
    public void predicate_2(){
        Predicate<String> p1 = s -> s != null;
        Predicate<String> p2 = s -> !s.isEmpty();
        Predicate<String> p3 = p1.and(p2);
        Assert.assertFalse(p3.test(""));
        Assert.assertFalse(p3.test(null));
        Assert.assertTrue(p3.test("Nor empty!"));
    }

    @Test
    public void predicate_3(){
        Predicate<String> p1 = s -> s.length() == 4;
        Predicate<String> p2 = s -> s.startsWith("J");
        Predicate<String> p3 = (p1.negate().and(p2)).or(p1.and(p2.negate()));
        Assert.assertTrue(p3.test("True"));
        Assert.assertTrue(p3.test("Julia"));
        Assert.assertFalse(p3.test("Java"));
    }
}
