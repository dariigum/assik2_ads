MyArrayList


Implements the MyList interface using an array-based approach.
Supports dynamic resizing to accommodate a variable number of elements.
Provides methods for adding, removing, accessing elements, and more.

MyLinkedList


Implements the MyList interface using a doubly linked list approach.
Supports efficient insertion, deletion, and traversal operations.
Prevents loops and handles edge cases like empty lists.
Usage:


MyStack


Implements a stack data structure based on MyLinkedList.
Provides standard stack operations like push, pop, peek, and isEmpty.
Utilizes the underlying linked list for efficient stack operations.

MyQueue


Implements a queue data structure based on MyLinkedList.
Supports queue operations like enqueue, dequeue, peek, and isEmpty.
Leverages the linked list implementation for efficient queue operations.

MyMinHeap


Implements a min-heap data structure based on MyArrayList.
Provides methods for insertion, removal, and retrieval of minimum element.
Ensures the heap property is maintained after each operation.

EmptyQueueException

using java.util is now allowed, created new class to throw an exception

NoSuchElementException

using java.util is now allowed, created new class to throw an exception



Node Class Implementation

This repository contains the Java implementation of a generic Node class. The Node class is a fundamental building block used in various data structures like linked lists, trees, and graphs. It represents an individual element in a data structure and contains a reference to the next or previous node, depending on the type of data structure.

Node Class


The Node class is a generic class that can hold any type of data.
It contains an instance variable to store the data and references to the next and/or previous nodes.
The class provides constructors to initialize nodes with data and optional references.
It also includes getter and setter methods to access and modify the data and node references.
