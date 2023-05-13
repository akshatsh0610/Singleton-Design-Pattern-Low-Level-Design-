# Singleton Design Patterns (Low Level Design)
This repository is complete tutorial of singleton design patterns  . Hope you will find it helpful

A design pattern is a well described solution to a common software problem . Using appropriate design pattern makes our code easy to understand and debug . It leads to faster development and new members of the team understand it easily. There are many design patterns that we can use .

Now let’s talk about Singleton Design Pattern .

Suppose you want to create a class for which only a single instance (or object) should be created and that single object can be used by all other classes. So , here we can use Singleton Design Pattern . So we can say that when only one object is to be created and shared among different classes then we use Singleton Design Pattern . For example , suppose you live in a hostel where only one washing machine is present now all the residents of the hostel use that washing machine only . So here we can clearly see that single washing machine is being shared among multiple people .

We can implement Singleton Design Pattern in different ways . Let’s have a look on each one of them .

1. Singleton Eager Initialization — :
In eager initialization, the instance of the singleton class is created at the time of class loading.But this implementation has some disadvantage let’s have a look on it .The drawback to eager initialization is that the object is created even though the client application might not be using it.
To solve this problem Lazy Initialization comes in picture .

2. Lazy Initialization -:
Lazy initialization is a technique used to delay the creation of an object until it is first requested.This approach can be more memory-efficient and can avoid potential initialization errors, compared to the Eager initialization approach. However, the Lazy initialization approach is not thread-safe and can result in the creation of multiple SingletonLazy instances if multiple threads attempt to access the getInstance() method simultaneously.To make the SingletonLazy class thread-safe, we can use synchronization or other techniques such as the Double-Checked Locking pattern or the Initialization-on-demand Holder pattern.

3.  Singleton Thread Safe Method -:
To solve the issue that is arised in Singleton Lazy Initialization we use Singleton Thread Safe Method . A thread-safe Singleton method is a design pattern that ensures a class has only one instance and provides a global point of access to that instance, while also guaranteeing that the Singleton instance is created only once and accessed safely by multiple threads.

4 . Singleton Thread Safe Block -: (Double Checking)
This is similar to Singleton Thread Safe Method the only difference here is that the "if" block is synchronised here.

If you want to know more about please follow this link -: https://medium.com/@akshatsharma0610/singleton-design-pattern-561c8bbdb6d9

If you find this repository useful please upvote it .
