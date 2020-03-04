**Intent** 
=
Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass 
but lets subclasses override specific steps of the algorithm without changing its structure.

**Definition**
=
The Template Method Pattern defines the skeleton of an algorithm in a method, 
deferring some steps to subclasses. 
Template Method lets subclasses redefine certain steps of an algorithm 
without changing the algorithm’s structure.

**Structure**
=
The **Abstract Class** declares methods that act as steps of an algorithm, 
as well as the actual template method which calls these methods in a specific order. 
The steps may either be declared abstract or have some default implementation.

**Concrete Classes** can override all of the steps, but not the template method itself.

**Applicability**
=
1. Use the Template Method pattern when you want to let clients extend only particular 
steps of an algorithm, but not the whole algorithm or its structure.

2. Use the pattern when you have several classes that contain almost identical algorithms 
with some minor differences. As a result, you might need to modify all classes 
when the algorithm changes.


**Differences with Strategy**
=
1. Template Method is based on inheritance: it lets you alter parts of an algorithm by extending 
those parts in subclasses. Strategy is based on composition: you can alter parts of the object’s behavior by 
supplying it with different strategies that correspond to that behavior. 

2. Template Method works at the class level, so it’s static. 
Strategy works on the object level, letting you switch behaviors at runtime.

