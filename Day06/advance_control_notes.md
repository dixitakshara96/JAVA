# 1. while vs do-while
* While : the condition is checked first if condition is true then only we enter into the while block and the statements written inside it is being executed. 
* do-while : first we enter into the do block and statement written inside it is being executed then after that the while condition is check if it is true then onlythe execution happens further  else the loop terminates.
 

# 2. Sentinel Values :
* in simple words what I had understand that values which are not logically accurate ( thoda sa ML here jab hum data cleaning karte hai toh we find that if data is valid or not and accurate or not, VAlid is like ki age -ve nahi ho sakti accuracy be like ki 340 age kisi ki bhi nhi ho skti).
* Sentinel must generally be checked before processing the value.

# 3. Priming a loop 
* The first input is obtained before the loop so that the loop has something to test.
* Initialization gives a variable an initial state.
* Priming provides the first input/value needed to start a loop's control process.
* simply jab ek variable input kraya jaye specailly to start the loop 

# 4. Break vs Continue
* Break : when got the condition it get out of the nearest loop
* continue : when got the condition it skips it and execute the others as it is (Nearest loop)

# 5. Nested Loop
* loop inside a loop : For each one iteration of the outer loop, the inner loop completes its cycle. 
* if there is two loop then it resembles 2-D matrix (row X column) or (m X n) .

# 6. Normal vs Enhanced for
* normal for loop has initialization , condition , change in value
* for each 

# 7. Dangling else
* An else belongs to the nearest unmatched if.
* it is a good programming pratice to add {} .

# 8. Definite Assignment
* in java compiler ensures if a variable guaranteed an assignment.
* if not then it will going to throw an error
* Compiler reasons about Control Flow Path.

# 9. throw vs catch
* throw keyword used to give an error at a particular point where a programmer wants
* catch statement hold that Error or exception and print the desired conditions.

# 10. Exception vs Error code
* Exxception disrupt normal execution flow and pass error details up the call stack
* Error Codes represent a legacy procedural pattern where methods return an integer or string identifier (like -1 or "NOT_FOUND") to indicate failure.

# 11. Floating Point Division by Zero 
* floating-point division by zero never throws an exception. 
* Instead, it safely returns special constants defined by the IEEE 754 standards: Infinity, -Infinity, or NaN (Not a Number). 
* This differs fundamentally from integer division by zero, which immediately throws a java.lang.ArithmeticException.Outcomes of Floating-Point Division by Zero 
* The exact result depends entirely on the sign and value of the numerator: 
1. Infinity: Returned when a positive floating-point number is divided by zero (e.g., 5.0 / 0.0).
2. -Infinity: Returned when a negative floating-point number is divided by zero (e.g., -5.0 / 0.0).
3. NaN: Returned when exactly zero is divided by zero (e.g., 0.0 / 0.0)


# 12. Pattern logic
* Step 1 — Count rows : this will define the design of  outer loop .
* Step 2 — Analyze each row : Row | Spaces | Stars | Other characters
* Step 3 and 4 — Find mathematical relationships : spaces → one inner loop
stars  → another inner loop
* Step 5 — At the end of each row: moves to the next line.
