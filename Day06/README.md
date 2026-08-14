# Tricky Code Analysis & Output

1. `Output` : 1 2 4 5
* continue statement is just going to skip i=3 and then increment the value of i (i++) hence runs as it was running. Because continue only skip or ignores the statement and then loop works as it is.

2. `Output` : 1 1 2 1 3 1
* yes break terminates the nearest enclosed loop 
* nope it doesnot terminate outerloop.

3. `Output` : 1 1 1 3 2 1 2 3 3 1 3 3
* the nearest enclosed loop (inner loop) is affected by the continue

4. `Output` : Hello (only for once)
* because do while loop is bottom tested loop which executes atleast once , either the condition is true or false.

5. `Output` : Compilation Error
* the compiler ensures that there must be a guarantted assignment it checks the Control Flow path of the program.
* assigmnent hona mangta toh mangta.

6. `Output` : 50
* this going to be execute no issue here because the if condiiton is always true and hence assignment is guaranteed 100%. And compiler focuses on Control Flow Path which is 100% safe here for all conditions.

7. `Output` : 

8. `Output` : Compilation Error
* because int x is declared inside the if statement it has scope inside that if block only so, if we going to access its value after the if block this going to be an error.

9. `Output` : 

10. `Output` : 1 2 5