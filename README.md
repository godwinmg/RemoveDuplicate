# RemoveDuplicate

This repository is for a coding assignment to remove all duplicate integers from an integer array. 
Java wont automatically do boxing to primitives. So we need to make sure that it safely converts to
a list of primitives before doing duplicate elimination operation.

I used 3 different approaches to achieve the solution. 

1) Exploited Java 8 inbuilt feature: - IntStream is a stream for primitive int data type which will boxed
into its equivalant wrapper Integer and collect the intermediate result using collect() and convert it into
a list using Collectors.

2) Used google Guava primitive api to convert the int[] into a list  using Ints.asList().

3) Used HashSet to eleminate the duplicates.

4) In order to achieve the insertion order, we should use a data structure which memorize its insertion order. 
I used LinkedHashSet which is a HashSet backed by LinkedList , So it retains the insertion Order. 

Inorder to run this program without issues, please make sure that you have Java 8,Maven and TestNG are installed in your system.

Java 1.8
TestNG 6.9.10
Google Guava 19.0

