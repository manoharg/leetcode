## [Binary search](https://www.youtube.com/watch?v=GU7DpgHINWQ&ab_channel=Errichto)

### Algorithm
 
 ```java
 
 /*
 Try to find a pattern like TTTFFF and find the first False or last True.
 For rotated array, compare mid with last element
 For peak, compare mid with mid-1
 */
 
 L=0, R=N-1;
 ans = -1;
 while(L<=R)
   mid = L + (R-L)/2;
   if(a[mid]>=X) {
      ans = mid; // possible answer so store it and search for a better ans
      R = mid-1;
   } else {
      L = mid +1;   
   }
 ```
Problems

Template is not good. Go through Erichto's video and solve problems.

https://leetcode.com/explore/learn/card/binary-search/125/template-i/950/

Search in rotated sorted array with duplicates 

Heater problem - Read about Arrays.binarySearch() and Collections.binraySearch()

Find K closest elements - https://www.youtube.com/watch?v=ZZmIVlgDIlQ&ab_channel=RenZhang

