**Intent** 
==============================
Provide a way to access the elements of an aggregate object sequentially 
without exposing its underlying representation.

**Structure**
============================
The Client uses the Collection class' public interface directly. 
But access to the Collection's elements is encapsulated behind the additional level of abstraction 
called Iterator. 

Each Collection derived class knows which Iterator derived class to create and return. 
After that, the Client relies on the interface defined in the Iterator base class.
![IteratorPattern](https://sourcemaking.com/files/v2/content/patterns/Iterator.png)

**Advantages**
============================
* We are able to access elements of a collection without exposing the internal structure of elements or collection itself.
* Iterator supports multiple simultaneous traversals of a collection from start to end in forward, backward or both directions.
* Iterator provide a uniform interface for traversing different collection types transparently.