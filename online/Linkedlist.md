# Linked Lists in Java

## Table of Contents
- [Introduction](#introduction)
- [Types of Linked Lists](#types-of-linked-lists)
- [Basic Operations](#basic-operations)
- [Time Complexities](#time-complexities)
- [Common Interview Questions](#common-interview-questions)

---

## Introduction
### Question:
What is a linked list?

**Options:**
1. A data structure with elements stored in contiguous memory
2. A dynamic data structure with nodes connected by pointers
3. A type of stack

*(Hint: It allows dynamic memory allocation.)*

**Answer:** Option 2

A **linked list** is a linear data structure where elements are stored in nodes that are connected via pointers. Each node consists of two parts:
1. **Data:** The value stored in the node.
2. **Pointer (next):** A reference to the next node in the sequence.

Unlike arrays, linked lists provide dynamic memory allocation, which makes insertion and deletion operations more efficient.

---

## Types of Linked Lists
**Question:** What are the different types of linked lists?

**Options:**
1. Singly Linked List
2. Doubly Linked List
3. Circular Linked List
4. All of the above

*(Hint: Consider pointer connections.)*

**Answer:** Option 4

1. **Singly Linked List** - Each node points to the next node only.
2. **Doubly Linked List** - Each node contains a pointer to both the previous and next nodes.
3. **Circular Linked List** - The last node points back to the first node.

---

## Basic Operations

### 1. Node Structure
```java
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

### 2. Insertion
#### Question:
What is the time complexity of inserting a node at the beginning of a singly linked list?

**Options:**
1. O(1)
2. O(n)
3. O(log n)

**Answer:** Option 1

#### Code:
```java
class LinkedList {
    Node head;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
```

---

### 3. Deletion
#### Question:
What happens if we try to delete a non-existing node?

**Options:**
1. The program crashes
2. No changes happen
3. The linked list gets corrupted

**Answer:** Option 2

#### Code:
```java
void deleteNode(int key) {
    Node temp = head, prev = null;
    if (temp != null && temp.data == key) {
        head = temp.next;
        return;
    }
    while (temp != null && temp.data != key) {
        prev = temp;
        temp = temp.next;
    }
    if (temp == null) return;
    prev.next = temp.next;
}
```

---

## Common Interview Questions

### 1. Reverse a Linked List
#### Question:
Which technique is used to reverse a linked list?

**Options:**
1. Recursion
2. Iteration
3. Both

**Answer:** Option 3

#### Code:
```java
Node reverseList(Node head) {
    Node prev = null, current = head, next = null;
    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    return prev;
}
```

---

By incorporating these questions and hints, you can make learning linked lists more interactive and engaging!
