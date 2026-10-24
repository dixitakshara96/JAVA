## Case 1 — peek vs pop, aur String concatenation

### Output

```text
9
9
7 4 
 4 1
{4}
```

### Reason

- Stack works on the Principle of LIFO.
- `peek()` is use to view the topmost element of the stack.
- `pop()` is to delete the topmost element from the stack.
- `size()` return the  length/size of the stack .

---

## Case 2 —  Popping an Empty Stack

### Output

```text
Exception
EmptyStackException
```

### Reason

- when '(' is encountered it is pushed into stack then ')' encountered at that time '(' is popped up from the stack and Stack is Empty.
- after that again ')' is encountered and `pop()` condition runs but there is nothing in Stack to pop up (UnderFlow) condition.

---

## Case 3 — Stack vs ArrayDeque Print Order

### Output

```text
[1, 2, 3]
[3, 2, 1]
3 3
```

### Reason

- 

---

## Case 10 — Palindrome Check with l != r (Revision: Two Pointers)

### Output

```text
true
false
true
```

### Reason

- using two pointers we can quickly find if the given String is palindrome or not
- as the characters beginning and ending must be same to be palindome


---