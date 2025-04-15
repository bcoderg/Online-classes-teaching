# Recursion in Java

## Table of Contents
- [Introduction](#introduction)
- [Key Concepts](#key-concepts)
- [Time and Space Complexity](#time-and-space-complexity)
- [Common Recursion Problems](#common-recursion-problems)
- [Advanced Problems](#advanced-problems)

---

## Introduction

### Question:
What is recursion?

**Options:**
1. A process where a function calls itself
2. A loop that repeats until a condition is met
3. A memory allocation technique

*(Hint: Think about self-referencing functions.)*

**Answer:** Option 1

**Recursion** is a programming technique where a function calls itself to solve smaller instances of the same problem. Recursion is often used to break down problems into smaller, more manageable parts.

---

## Key Concepts

### 1. Base Case & Recursive Case
Every recursive function must have:
1. **Base Case:** The condition that terminates recursion and prevents infinite loops.
2. **Recursive Case:** The part where the function calls itself with a smaller subproblem.

Example:
```java
void printNumbers(int n) {
    if (n == 0) return; // Base case: stop recursion when n reaches 0
    System.out.println(n);
    printNumbers(n - 1); // Recursive case: call function with n-1
}
```

---

## Time and Space Complexity

| Function              | Time Complexity | Space Complexity |
|----------------------|----------------|-----------------|
| Factorial Calculation | O(n)            | O(n)            |
| Fibonacci Series      | O(2^n)          | O(n)            |

---

## Common Recursion Problems

### 1. Reverse an Array
#### Problem Statement
Reverse an array using recursion.

#### Code:
```java
void reverseArray(int[] arr, int start, int end) {
    if (start >= end) return; // Base case: if start meets end
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    reverseArray(arr, start + 1, end - 1);
}
```

---

### 2. Sorting an Array
#### Problem Statement
Sort an array using recursion.

#### Code:
```java
void recursiveSort(int[] arr, int n) {
    if (n == 1) return; // Base case: single element is sorted
    for (int i = 0; i < n - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
    recursiveSort(arr, n - 1);
}
```

---

### 3. Sort a Stack Using Recursion
#### Problem Statement
Sort a stack using recursion.

#### Code:
```java
void sortedInsert(Stack<Integer> stack, int element) {
    if (stack.isEmpty() || stack.peek() <= element) {
        stack.push(element);
        return;
    }
    int top = stack.pop();
    sortedInsert(stack, element);
    stack.push(top);
}

void sortStack(Stack<Integer> stack) {
    if (!stack.isEmpty()) {
        int top = stack.pop();
        sortStack(stack);
        sortedInsert(stack, top);
    }
}
```

### Time Complexity of `sortStack` and `sortedInsert`

- **`sortedInsert` Time Complexity:** O(n) in the worst case, where `n` is the number of elements in the stack.
- **`sortStack` Time Complexity:** O(n^2) in the worst case, as it calls `sortedInsert` for each element in the stack.

### Space Complexity

- Both `sortStack` and `sortedInsert` use O(n) space due to the recursion stack.


void sortStack(Stack<Integer> stack) {
    if (!stack.isEmpty()) {
        int top = stack.pop();
        sortStack(stack);
        sortedInsert(stack, top);
    }
}
```

---

### 4. Reverse a Stack Using Recursion
#### Problem Statement
Reverse a stack using recursion.

#### Code:
```java
void insertAtBottom(Stack<Integer> stack, int item) {
    if (stack.isEmpty()) {
        stack.push(item);
        return;
    }
    int top = stack.pop();
    insertAtBottom(stack, item);
    stack.push(top);
}

void reverseStack(Stack<Integer> stack) {
    if (!stack.isEmpty()) {
        int top = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, top);
    }
}
```

---

### 5. Generate All Binary Strings
#### Problem Statement
Generate all binary strings of length `n`.

#### Code:
```java
void generateBinaryStrings(int n, String str) {
    if (n == 0) {
        System.out.println(str);
        return;
    }
    generateBinaryStrings(n - 1, str + "0");
    generateBinaryStrings(n - 1, str + "1");
}
```

---

### 6. Generate Parentheses
#### Problem Statement
Generate all valid combinations of `n` pairs of parentheses.

#### Code:
```java
void generateParentheses(int open, int close, String str) {
    if (open == 0 && close == 0) {
        System.out.println(str);
        return;
    }
    if (open > 0) generateParentheses(open - 1, close, str + "(");
    if (close > open) generateParentheses(open, close - 1, str + ")");
}
```

---

### 7. Count Subsequences with Sum K
#### Problem Statement
Count all subsequences of an array that sum up to `K`.

#### Code:
```java
int countSubsequences(int[] arr, int index, int sum, int target) {
    if (index == arr.length) {
        return (sum == target) ? 1 : 0;
    }
    return countSubsequences(arr, index + 1, sum + arr[index], target) +
           countSubsequences(arr, index + 1, sum, target);
}
```

---

By covering these problems step by step, you can build a strong foundation in recursion and enhance problem-solving skills.
