package com.java8;


import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;

public class StreamTest {

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(2, 4, 7, 5, 8);
        stream1.forEach(ele -> System.out.println(ele));

        System.out.println();
         
         int[] ia = {20, 30, 40, 50, 60};
        IntStream stream2=Arrays.stream(ia);
        stream2.forEach(System.out::println);
        System.out.println();
		
        List<Integer> list1=List.of(2, 3, 4, 5, 6, 7, 8);
        Stream<Integer> stream3=list1.stream();
        stream3.forEach(System.out::println);
        System.out.println("====================");
        
        Stream<Integer> stream4 = list1.stream();
       
        Stream<Integer> stream5=stream4.filter(ele->ele%2==0);
        stream5.forEach(System.out::println);
        System.out.println("====kkkk================");
        
        list1.stream().filter(ele->ele%2==0).forEach(System.out::println);
        System.out.println();
        System.out.println("====================");
        
        
		List<Object> list2 = List.of("a", 5, "b", 6, "c", 7);
		list2.stream().filter(ele -> ele instanceof Integer )
		.map(ele->(Integer) ele).
				forEach(System.out::println);
        
    }
}
