# Lab04: Collections (Arrays, and sets and hash maps. Oh My!)

The goal of this laboratory exercise is to learn more about the different types of data structures, specifically collections, programmers use everyday to solve programming problems. This lesson will include understanding the axiomatic complexity to better understand when best to apply certain data structures, as well as what operations can be performed on these data structures. We will look at both the theoretical bases as well as Groovy specific details of these collection types.

By now, you should be familiar with forking and cloning projects in GitHub, therefore, I will abstain from providing instructions on how to do so. I will also abstain from providing instruction on how to commit and push your solutions for the steps below. Again, you have done this enough now that it should be almost second nature. If you forget, the instructions are very similar to all the previous lab exercises.

## Step 1. Axiomatic Complexity

Axiomatic complexity is a fancy mathematical term that means we want to understand approximately how many instructions a computer must execute in order to complete a certain task. Because the speed at which computing systems speed up is itself very fast, we tend to talk in terms of mathematical functions and their relation to each other. These mathematical functions have one variable in common, `n`. `n` represents the size of the data set. For example, in an array that contains 100 elements `n == 100`. We can then use these functions and the value of `n` to relatively compare how fast certain operations are. Given an algorithm with axiomatic complexity `n^2`, an operation on 10 items would take approximately 100 computations to complete whereas an operation on 100 items would take approximately 10,000 computations to complete. This is because (10^2) == 100 and (100^2) == 10,000.

If you would like to gain a deeper understanding, please see this [Wiki](https://en.wikipedia.org/wiki/Big_O_notation) article. While subject is very computer sciency, it is crucial to understanding in order to make the proper decision about what type of data structure to use to solve a particular problem. You don't need a deep understaning in order to make the correct decision as long as you understand the relative growth rate of the functions associated with certain data structures. This [graph](http://m.wolframalpha.com/input/?i=plot+log+n%2C+n%2C+n+log+n%2C+n%5E2+from+0+to+10&x=0&y=0) illustrates these relationships.

Remember, the best algorithm is an algorithm that takes constant time. In other words, the best solution takes the same amount of time regardless of whether you have 1 item in the collection or a billion.

## Step 3. Arrays and Lists

For this lab exercise you will not write very much code, but you will run some code. In this step we're going to run the program in step3.groovy. This program will demonstrate the difference in performance for arrays and lists by running various basic operations on them. The main take away from this step is that arrays and lists are better for different situations.

Run the program and record the results in the table below:

| Collection Type | Results for list | Results for array |
|-----------------|------------------|-------------------|
| Insertion       | put results here | put results here  |
| Deletion        | put results here | put results here  |
| Access nth item | put results here | put results here  |

For each of the operations insert a comma separated list of timings (in seconds) for each of the sizes run in the groovy app. For example, 1 s, 2s, 4s for each of the runs of 10, 100, and 1,000 elements.

## Step 4. Maps

## Step 5. Sets
