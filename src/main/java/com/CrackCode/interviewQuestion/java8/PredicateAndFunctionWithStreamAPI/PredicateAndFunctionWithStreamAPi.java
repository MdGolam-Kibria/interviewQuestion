package com.CrackCode.interviewQuestion.java8.PredicateAndFunctionWithStreamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateAndFunctionWithStreamAPi {
    public static void main(String[] args) {
        Man man = new Man();
        man.setName("helal");
        man.setAge(25);
        man.setOccupation("Software Engineer");

        Man man2 = new Man();
        man2.setName("Sayeem");
        man2.setAge(12);
        man2.setOccupation("Software Tester");
        Collection manList = Collections.synchronizedList(Arrays.asList(man, man2));

        /** now show the tricks */
        testTheTricks(manList);
        /**see another tricks**/
        testAnotherTricks(manList);
    }

    private static void testTheTricks(Collection manList) {
        Predicate<Man> is18Plus = v -> v.getAge() >= 18;
        Function<Man, String> addWithName = v -> v.getName() + v.getOccupation();

        Stream nameList = manList.stream().filter(is18Plus).map(addWithName);
        nameList.forEach(s -> System.out.println(s));
    }

    /**
     * best practice
     */
    private static void testAnotherTricks(Collection manList) {
        Predicate<Man> is18Plus = v -> v.getAge() >= 18;
        Function<Man/*Source*/, Man/*returnable Object*/> addWithName = v -> new PredicateAndFunctionWithStreamAPi().getMan(v);

        Stream nameList = manList.stream().filter(is18Plus).map(addWithName);
        nameList.forEach(s -> System.out.println(s));
    }

    public static Man getMan(Man man) {
        Predicate<Man> is18Plus = v -> v.getAge() >= 18;
        if (is18Plus.test(man))
            man.setAge(100);
        return man;
    }
}
