# Problem Statement : 

The prime factors of 13195 are 5, 7, 13 and 29.  What is the largest prime factor of the number 600851475143 ?

# Hint:
There are multiple solution approaches starting time complexity from O(N^2), O(N), O(sqrt(N)) , O(N*log(N) upto O(log(N)) 

When you are done , please go through [PSEDO.md](PSEDO.md) file for solutions and their pseudo code.

Also, example implementation is given in JAVA , look for [LargestPrimeFactor.java](LargestPrimeFactor.java) file

# Time Complexities
- **Option 1** > O((N-1)*sqrt(N)) // time taken in my system is 17 milliseconds
- **Option 2** > O((sqrt(N)-1)*(sqrt(N)-2)/2) // time taken in my system is  14 milliseconds
- **Option 3** > more optimised using probability primality test -- left Open for you
