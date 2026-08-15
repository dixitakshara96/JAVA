# 1. while vs do-while
* While : the condition is checked first if condition is true then only we enter into the while block and the statements written inside it is being executed. 
* do-while : first we enter into the do block and statement written inside it is being executed then after that the while condition is check if it is true then onlythe execution happens further  else the loop terminates.

* ANALOGY : Do while loop is used when we want that the statement inside the loop should be execute at least once.

For an example, Abhi placement season, Chal Raha and everybody is thinking ki kam se kam 1 wagah se toh job offer mill ,  at least ek jagah se toh job unko matlab confirm , ye confirm ho ki 1 wagah se toh mile hi
 

# 2. Sentinel Values :
* in simple words what I had understand that values which are not logically accurate ( thoda sa ML here jab hum data cleaning karte hai toh we find that if data is valid or not and accurate or not, VAlid is like ki age -ve nahi ho sakti accuracy be like ki 340 age kisi ki bhi nhi ho skti).
* Sentinel must generally be checked before processing the value.
* Analogy : Sentinel values for that, I have an analogy in which a person is storing statistical info of the input ages of different people. So if a person is giving a negative value, negative age value, it means it doesn't Exist in real world. So the loop which ignores the sentinal values, the corrupted values is basically the sentinal loop either we ignore the values using the sentinal loop or we discard them.

# 3. Priming a loop 
* The first input is obtained before the loop so that the loop has something to test.
* Initialization gives a variable an initial state.
* Priming provides the first input/value needed to start a loop's control process.
* simply jab ek variable input kraya jaye specailly to start the loop 

# 4. Break vs Continue
* Break : when got the condition it get out of the nearest loop
* continue : when got the condition it skips it and execute the others as it is (Nearest loop)
* Analogy : Suppose, I have a switchboard in which there are 10 buttons of 10 bulb, and I have to open each light in a sequence, take from 1 to 10. So I have this condition like when I have opened the third switch, there was a break. So I will switch on the first. The second, when I'm going to press the third button, I got the command to break this loop so I'm not going to on any other button after the.  Getting into this condition. Only the first and second bulb is light up now. Second situation, the continue situation like the third bulb. It has the situation of continue, so I'll open the first switch. Second switch the third switch when I come to the third switch. The continue condition it going to skip that condition. And I'll open the 1,2, 4,5 ,6 7 8 9 10. So except the third bulb, all the bulbs from 1 to 10 are light up

# 5. Nested Loop
* loop inside a loop : For each one iteration of the outer loop, the inner loop completes its cycle. 
* if there is two loop then it resembles 2-D matrix (row X column) or (m X n) .
* Analogy : For nested loop, the example of for loop is basically the outer loop and the inner loop, so let us assume that there are 3 classes and each class contains 30 students. The outer loop or the row is for the classes 1 2 3, and the inner loop are representing the columns. The 30 students in each class is for the inner loop.  So the break and continues situation here is simply like, ki. If for the second student, if I had the condition of break, so what will going to happen? I'll get the information of first student from first class. Then, jaise hi, a first class, mei second student, aye Jahan Meri break condition, hai, us class, se, Bhara ajaungi or phir Koi bhi, aage, us class ke student ki information, mujhe milegi after that, I  Will going to enter in the second classroom. Similarly, to this student ki details, mujhe milengi, second student ki details, ke liye jaise, Mein jaungi break condition, aa Gaye, I will get out of that room similar to that jab third class mejonge, Pele student, ki information, mujhe, milegi jaise, he mujhe second student ki information, ke liye Mein jaungi, I will get out of that room because break condition aa chuki hai ab now, taking example of  Continue statement, second student may continue condition hi hai , so when I am going to enter the first class, fetch the information student jaise, second student ki bare aayegi, I am going to skip that student and phir, mei 3 4 5 6  7 8 9 10 baki saare, students, key information collect Karungi, except the second student similarly, in second class, first student key information than second student, skipped third fourth fifth 6 7 8 9 10. similar to that in third class sare  students info milegi, except the second student.So this is the workflow of break and continue in nested loop.They will work in the  nearest enclosing loop

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
