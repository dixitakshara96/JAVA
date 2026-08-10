# Task 05 

## Control Flow Statements/ Decision Making Path

1. `if/ if-else/ if-if ladder/ if-else-if ladder/ nested if`

* `if Statement` : checkes whether the condition written is true if the executes the code written inside if block.

### Diagram
```mermaid
flowchart TD
    A[Start] --> B{Condition?}
    B -- True --> C[Execute if-block]
    B -- False --> D[Skip]
    C --> E[End]
    D --> E[End]
```

* `if - else` : executes else code when if codition was false.

### Diagram
```mermaid
flowchart TD
    A[Start] --> B{Condition?}
    B -- True --> C[Execute if-block]
    B -- False --> D[Execute else-block]
    C --> E[End]
    D --> E[End]
```

* `if-else-if` (Single Chain, Two Conditions)

Checks a second condition only if the first is false, then falls back to else. This is the basic building block of a ladder.

### Diagram
```mermaid
flowchart TD
    A[Start] --> B{condition1?}
    B -- True --> C[Execute block 1]
    B -- False --> D{condition2?}
    D -- True --> E[Execute block 2]
    D -- False --> F[Execute else block]
    C --> G[End]
    E --> G[End]
    F --> G[End]
```

* `if` Ladder (Series of Independent `if` Statements)

Every if is checked independently . Multiple blocks can execute if multiple conditions are true.

### Diagram
```mermaid
flowchart TD
    A[Start] --> B{condition1?}
    B -- True --> C[Execute block 1]
    B -- False --> D
    C --> D{condition2?}
    D -- True --> E[Execute block 2]
    D -- False --> F
    E --> F{condition3?}
    F -- True --> G[Execute block 3]
    F -- False --> H[End]
    G --> H[End]
```

* `if-else-if` Ladder (Chained, Mutually Exclusive)

A chain of conditions where **only one** block executes — the first true condition wins, and the rest are skipped.

### Diagram
```mermaid
flowchart TD
    A[Start] --> B{condition1?}
    B -- True --> C[Execute block 1]
    B -- False --> D{condition2?}
    D -- True --> E[Execute block 2]
    D -- False --> F{condition3?}
    F -- True --> G[Execute block 3]
    F -- False --> H[Execute default block]
    C --> I[End]
    E --> I[End]
    G --> I[End]
    H --> I[End]
```

* Nested `if`

An `if` (or `if-else`) statement placed **inside** another `if` (or `else`) block. Used when a second condition only matters if the first is already true.

### Diagram
```mermaid
flowchart TD
    A[Start] --> B{condition1?}
    B -- False --> F[Execute outer-else]
    B -- True --> C{condition2?}
    C -- True --> D[Execute inner-if block]
    C -- False --> E[Execute inner-else block]
    D --> G[End]
    E --> G[End]
    F --> G[End]
```

2. `Switch-Case statemnt : it also helps in decision making` 

## LOOP Statements:

* `for` Loop

Used when the **number of iterations is known** in advance. Initialization, condition, and update are all in one line — condition is checked **before** each iteration (entry-controlled).

### Syntax
```c
for (initialization; condition; update) {
    // loop body
}
```

### Diagram
```mermaid
flowchart TD
    A[Start] --> B[Initialization]
    B --> C{Condition?}
    C -- True --> D[Execute loop body]
    D --> E[Update]
    E --> C
    C -- False --> F[End]
```

* `while` Loop

Used when the number of iterations is **not known in advance** and depends on a condition. Condition is checked **before** each iteration (entry-controlled) — body may run **zero** times.

### Diagram
```mermaid
flowchart TD
    A[Start] --> B{Condition?}
    B -- True --> C[Execute loop body]
    C --> B
    B -- False --> D[End]
```

* `do-while` Loop

Similar to `while`, but the condition is checked **after** each iteration (exit-controlled) — body always runs **at least once**, even if the condition is false initially.

### Syntax
```c
do {
    // loop body
} while (condition);
```

### Diagram
```mermaid
flowchart TD
    A[Start] --> B[Execute loop body]
    B --> C{Condition?}
    C -- True --> B
    C -- False --> D[End]
```

3. `BLock Statements & Variable Scope` : 

Variable Scope in JAVA is thoda different no variable is global can be static but not global.
BLock Statement helps in identifying the scope and lifetime of the variable.
the variable cannot be access outside the block statement in which it has declared or define

4. `Algorithm Writing and Refinement also Pseudo Code` :
- we write algorithm at the time of designing, it is a step by step procedure of solving a particular problem.
-  Algo Refinement is to break the bigger problem into very samll small steps (single unit) so that it will be easy to find the solution.
- Psedo code is a type of writing an algorithm, we write algo in a simple human readable english language, each step is define in it. it is independent of any programming lang.
- Properties of a GOOD ALGO
1. Finite
2. Unambiguous
3. Definite
4. Input
5. Output
6. Time 




