# Attempt 1 - O((N-1)*sqrt(N)) a.k.a. O(Nsqrt(N))
```
storing input given number as N which is large long type variable

assume largest prime factor number is -1

for each iteration denoted by i from 2 to square root of N , loop is incremented by 1
{

if N mod i is equal to ZERO
then  check the number is prime or not by calling isPrime function as given below
	
    if the number is prime 
		store or replace previously identified prime factor with the new number

	if largest prime factor is still equal to -1 
		return N
	else
		return largest prime factor

 }

isPrime —>
{
 	for each iteration denoted by j from 2 up to  given number M, loop is incremented by 1
	{
		if M mod j is equal to ZERO
		{
			return false
			break
		}
		
	 }
	return true	
}
```

# Attempt 2 - O((sqrt(N)-1))*(sqrt(N)-2)/2))v a.k.a O(N)
```
storing input given number as N which is large long type variable

assume largest prime factor number is -1

for each iteration denoted by i from 3 to square root of N , loop is incremented by 2 [ only odd number is possibility of prime beyond 2]
{

if N mod i is equal to ZERO
then  check the number is prime or not by calling isPrime function as given below
	
    if the number is prime 
		store or replace previously identified prime factor with the new number

	if largest prime factor is still equal to -1 
		return N
	else
		return largest prime factor

 }

isPrime —>
{
 	for each iteration denoted by j from 2 up to sqrt of given number M, loop is incremented by 1
	{
		if M mod j is equal to ZERO
		{
			return false
			break
		}
		
	 }
	return true	
}
```
