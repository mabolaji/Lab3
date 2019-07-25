package com.lab3.q1;

public interface IQueue {
    // This method is used to view the head of queue without removing it. It returns Null if the queue is empty.
    String  peek();
    // This method is similar to peek(). It throws NoSuchElementException when the queue is empty.
    String element();
    // This method is used to add elements at the tail of queue. More specifically, at the last of linked-list if it is used, or according to the priority in case of priority queue implementation
    void add(String t);
}
