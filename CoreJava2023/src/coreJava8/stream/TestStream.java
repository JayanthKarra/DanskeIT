package coreJava8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStream {
	public static void main(String []  args)
	{
		/* A stream is :Stream is conceptually a pipeline in which elements are computed on demand.

		Not a data structure
		Designed for lambdas
		Do not support indexed access
		Can easily be aggregated as arrays or lists
		Lazy access supported
		Parallelizable */
		
		//Case 1: Print elements
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
		stream.forEach(p -> System.out.println(p));
		
		//Case 2:Stream of array 
		Stream<Integer> stream1 = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
	     System.out.println("Stream of Array");
		stream1.forEach(p -> System.out.println(p));
		
		//Stream of List
		List<Integer> list = new ArrayList<Integer>();
		 
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> stream2 = list.stream();
        System.out.println("Stream of List");
        stream2.forEach(p -> System.out.println(p));


        //Generate
        Stream<Integer> randomNumbers = Stream
                .generate(() -> (new Random()).nextInt(100));
        System.out.println(" Generate");
            randomNumbers.limit(20)
                 .forEach(System.out::println);
            
         //  Stream of String chars or tokens
            IntStream stream5 = "12345_abcdefg".chars();
            System.out.println("");
            stream5.forEach(p -> System.out.println(p));         
        //OR
            Stream<String> stream4 = Stream.of("A$B$C".split("\\$"));
            System.out.println("Stream of String token");
            stream4.forEach(p -> System.out.println(p));
            
            
   //---------------Stream Intemediate Opereration------------------------------------------------------
            List<String> memberNames = new ArrayList<>();
            memberNames.add("Amitabh");
            memberNames.add("Shekhar");
            memberNames.add("Aman");
            memberNames.add("Rahul");
            memberNames.add("Shahrukh");
            memberNames.add("Salman");
            memberNames.add("Yana");
            memberNames.add("Lokesh");
            
            /*--Stream.filter()
            accepts a Predicate to filter all elements of the stream. This operation is
            intermediate which enables us to call another stream operation (e.g. forEach()) on the result.*/
            System.out.println(" Filter Stream ");
            memberNames.stream().filter((s) -> s.startsWith("A"))
            .forEach(System.out::println);
            
            /* Stream.map()
			The map() intermediate operation converts each element in the stream into 
			another object via the given function.*/
            System.out.println(" Convert to upper case using map() of Stream");
            memberNames.stream().filter((s) -> s.startsWith("A"))
            .map(String::toUpperCase)
            .forEach(System.out::println); 
            
            /*---Stream.sorted()
			The sorted() method is an intermediate operation that returns a sorted view of the stream.*/
            System.out.println(" Sorting using sorted() of Stream");
            memberNames.stream().sorted()
            .map(String::toUpperCase)
            .forEach(System.out::println);

            
            



//-**********************Stream Terminal Operation******************************
        //1. Stream to list
            System.out.println(" Stream to list");
            List<String> memNamesInUppercase = memberNames.stream().sorted()
                    .map(String::toUpperCase)
                    .collect(Collectors.toList()); 
            System.out.print(memNamesInUppercase);
            
          //2. String match
            boolean matchedResult = memberNames.stream()
                    .anyMatch((s) -> s.startsWith("A"));   
            System.out.println(matchedResult); //true
             
            matchedResult = memberNames.stream()
                    .allMatch((s) -> s.startsWith("A")); 
            System.out.println(matchedResult); //false

             
            matchedResult = memberNames.stream()
                    .noneMatch((s) -> s.startsWith("A")); 
            System.out.println(matchedResult); //false
            
        //3. Identify total count
            long totalMatched = memberNames.stream()
            	    .filter((s) -> s.startsWith("A"))
            	    .count();
            	 
            	System.out.println(totalMatched); //2

         // 4. reduce()
            	/*Reducing is the repeated process of combining all elements. reduce operation applies a binary operator 
            	to each element in the stream where the first argument to the operator is the return value of the previous 
            	application and second argument is the current stream element.
            	*/
            	
            	Optional<String> reduced = memberNames.stream()
            	        .reduce((s1,s2) -> s1 + "#" + s2);
            	 
            	reduced.ifPresent(System.out::println);


// findfirst()
            	// Creating a List of Integers 
                List<Integer> ls = Arrays.asList(3, 5, 7, 9, 11); 
          
                // Using Stream findFirst() 
                Optional<Integer> answer = ls.stream().findFirst(); 
          
                // if the stream is empty, an empty 
                // Optional is returned. 
                if (answer.isPresent()) { 
                    System.out.println(answer.get()); 
                } 
                else { 
                    System.out.println("no value"); 
                } 
                
                
   //min()
                List<Integer> li = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
                
                Optional<Integer> minNumber = li.stream()
                                        .min((i, j) -> i.compareTo(j));
                				//.max((i, j) -> i.compareTo(j));
         
                System.out.println(" Minimum number from list:  "+minNumber.get());
//findAny()
                
                List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

                Optional<Integer> any = list1.stream().filter(x -> x > 1).findAny();
                if (any.isPresent()) {
                    Integer result = any.get();
                    System.out.println(" Find any element > 1 is : "+result);
                }

  // flatMap()
                List<Integer> l1= Arrays.asList(1,2,3);
                List<Integer> l2 = Arrays.asList(4,5,6);
                List<Integer> l3 = Arrays.asList(7,8,9);
                List<List<Integer>> listOfLists = Arrays.asList(l1, l2, l3);
                
                List<Integer> listOfAllIntegers = listOfLists.stream()
                        									  .flatMap(x -> x.stream())
                        									  .collect(Collectors.toList());  
                                                   System.out.println(listOfAllIntegers);

// Distinct
                   // Creating a list of integers 
                   List<Integer> list2 = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5); 
             
                   System.out.println("The distinct elements are :"); 
             
                   // Displaying the distinct elements in the list 
                   // using Stream.distinct() method 
                   list2.stream().distinct().forEach(System.out::println); 
//Limit
                   System.out.println(" Limit() of stream");
                   Stream.of(11, 12, 13, 14, 15).limit(3)
                   .forEach(s->System.out.println(s));  
	
 // peek()
                   /*1. It returns a Stream consisting of the elements of current stream.
                    * 2. It additionally perform the provided action on each element as elements.
                   */
                   Stream.of("bus", "car", "bycle", "flight", "train")
                   .filter(e -> e.length() > 3)
                   .peek(e -> System.out.println("Filtered value: " + e))
                   .map(String::toUpperCase)
                   .peek(e -> System.out.println("Mapped value: " + e))
                   .collect(Collectors.toList());
                   
   //Skip - skip() method to skip first 5 even numbers from an infinite stream of even numbers and then collecting the next 10 even numbers into a new Stream.
                   Stream<Integer> evenNumInfiniteStream = Stream.iterate(0, n -> n + 2);
                   
                   List<Integer> newList = evenNumInfiniteStream
                           .skip(5)
                           .limit(10)
                           .collect(Collectors.toList());
                   System.out.println(newList);
                   
       //Serial and parallel stream
                   System.out.println("=================================");
                   System.out.println("Using Sequential Stream");
                   System.out.println("=================================");
                   int[] array= {1,2,3,4,5,6,7,8,9,10};
                   IntStream intArrStream=Arrays.stream(array);
                   intArrStream.forEach(s->
                   {
                       System.out.println(s+" "+Thread.currentThread().getName());
                   }
                           );
            
                   System.out.println("=================================");
                   System.out.println("Using Parallel Stream");
                   System.out.println("=================================");
                   IntStream intParallelStream=Arrays.stream(array).parallel();
                   intParallelStream.forEach(s->
                   {
                       System.out.println(s+" "+Thread.currentThread().getName());
                   }
                           );
                   
	}

}
