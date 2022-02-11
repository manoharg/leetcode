##How HashMap works in Java

Read more: https://javarevisited.blogspot.com/2011/02/how-hashmap-works-in-java.html#ixzz7KMZHDmfT

- When we call the put method, the hashcode() method of the key object is called so that the hash 
function of the map can find a bucket location to store the value object, which is actually an index of the internal array, known as the table.
- HashMap internally stores mapping in the form of Map.Entry object which contains both the key and value object.
- Why hashMap keys are immutable ? - If they are not immutable hash fuction could give different hash value while storing and retrieving objects.
- Internally hashMap uses a fixed size array and if you keep storing objects at some point hashing function returns the same bucket for two different keys(This is called collison in HashMap). In this case, a linkedlist is formed at that bucket location and a new entry is stored as next node
- Once we found the bucket, we uses equals() method of key to find the node which has the value. If all keys are in same bucket, time complexity is O(n). In java 8, likedlist is replaced with BST to reduce the complexity to O(logn)
- HashMap works on the principle of hashing, we have put(key, value) and get(key) method for storing and retrieving Objects from HashMap. 

When we pass Key and Value object to put() method on Java HashMap, HashMap implementation calls hashCode method on Key object and applies returned hashcode into its own hashing function to find a bucket location for storing Entry object, the important point to mention is that HashMap in Java stores both key and value object as Map.Entry in a bucket is essential to understand the retrieving logic. 


### What will happen if two different objects have the same hashcode?
- Since hashcode is same, bucket location would be same and collision will occur in HashMap Since HashMap uses LinkedList to store object, this entry (object of Map.Entry comprise key and value )  will be stored in LinkedList.

-  Two enequal objects can have the same hashcode. 

- 

### How will you retrieve the Value object if two Keys will have the same hashcode?

- The interviewee will say we will call get() method and then HashMap uses Key Object's hashcode to find out bucket location and retrieves Value object but then you need to remind him that there are two Value objects are stored in the same bucket, so they will say about traversal in LinkedList until we find the value object

### What happens On HashMap in Java if the size of the HashMap exceeds a given threshold defined by load factor ?

- If the size of the Map exceeds a given threshold defined by load-factor e.g. if the load factor is .75 it will act to re-size the map once it filled 75%. 

Similar to other collection classes like ArrayList,  Java HashMap re-size itself by creating a new bucket array of size twice the previous size of HashMap and then start putting every old element into that new bucket array. This process is called rehashing because it also applies the hash function to find a new bucket location


**do you see any problem with resizing of HashMap in Java ?**
Yes there is a potential race condition that exists while resizing HashMap in Java, if two thread at the same time found that now HashMap needs resizing and they both try to resize. on the process of resizing HashMap in Java, the element in the bucket which is stored in the linked list get reversed in order during their migration to the new bucket because Java HashMap doesn't append the new element at the tail instead it append new element at the head to avoid tail traversing.

If race condition happens then you will end up with an infinite loop.




## Difference between HashMap and HashTable
- HashMap accepts null values while hashTable doesn't.

- HashMap is not synchronized

## TreeMap

## LinkedHashMap




