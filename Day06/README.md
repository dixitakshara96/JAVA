# Tricky Code Analysis & Output

1. `Output` : 1 2 4 5
* continue statement is just going to skip i=3 and then increment the value of i (i++) hence runs as it was running. Because continue only skip or ignores the statement and then loop works as it is.

2. `Output` : (1 1)
(2 1)
(3 1)
* yes break terminates the nearest enclosed loop 
* nope it doesnot terminate outerloop.

3. `Output` : (1 1) (1 3) (2 1) (2 3) (3 1) (3 3)
* the nearest enclosed loop (inner loop) is affected by the continue

4. `Output` : Hello (only for once)
* because do while loop is bottom tested loop which executes atleast once , either the condition is true or false.

5. `Output` : Compilation Error
* the compiler ensures that there must be a guarantted assignment it checks the Control Flow path of the program.
* assigmnent hona mangta toh mangta.

6. `Output` : 50
* this going to be execute no issue here because the if condiiton is always true and hence assignment is guaranteed 100%. And compiler focuses on Control Flow Path which is 100% safe here for all conditions.

7. `Output` : Underage
* because the else statement belongs to the nearest if here toh bhale hi age 20 ho aur pehle wale if ko satisfy kar jaye but andar wale if ko satisfy nhi karegi nd hence else block execute ho jayega.


8. `Output` : Compilation Error
* because int x is declared inside the if statement it has scope inside that if block only so, if we going to access its value after the if block this going to be an error.

9. `Output` : COMPILATION FAILED
* because while condition humesha true rahegi and hum loop ke andar aa jayenge but break se milenge wo hume bhar bhej dega lekin iss sab mei nuksan kiska hua ? System.out.println() ka kaise kyunki wo break ke baad likha hai toh kabhi print ho hi nhi skta compilar pareshan ho jayega .

10. `Output` : 1 2 4 5 
* similar break condition hai toh break ke baad uch aur execute nhi karegi 

# Important conclusion in star printing 
* try to make pattern in notebook first make equations using observation in spaces and pattern 
* write the matrix form of each element (i,j)
* Inverted and Upright triangle logic helped me in printing diamond pattern (comination of the 2)
* Inverted and Upright hollow pyramid logic helped me in printing hollow diamond pattern (comination of the 2)
* can identify the mathematical equation or pattern between row and columns. 