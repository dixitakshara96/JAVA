# QNA

1. Why is this: while(true) useful for menu-driven applications?
* it provides a good user interative interface in Command-Line as it continues till the user wants to exit.
* allows user to perform any operation as many time as he/she wants.

2. What is the difference between: break; and throw new Exception(); ?
* break : used to get out of the loop, switch case 
* throw : helps the programmer to explicitly raise an exception. 

3. Suppose an ArrayList contains:10 20 30 40 What happens internally, conceptually, when an element is removed from the middle? You don't need source-code-level implementation.
* when an element is remove from middle the indexes shifts dynamically 

4. Why would you choose: HashSet instead of: ArrayList for storing unique roll numbers?
* because each student as a unique roll number in a class and HashSet stores unique data objects.
* whereas ArrayList can store duplicate data objects as well.


5. Why might a  HashMap be better than two separate arrays: 33 rollNumbers[] names[] ?
* HashMap is efficient in terms of accessing or performing any operation to key- value pair in comparison to ArrayList. 

6. What is the difference between: list.get(5) and: list.contains(5) ?
* list.get(5) will return value at index 5
* list.contains(5) will search if value 5 exists in ArrayList or not and return boolean value.

7. In exception handling, why is this dangerous? catch(Exception e) { // do nothing }
* this is what called silently ignoring the issue not handling or propagating it 
* this will take the program flow to an Inconsistent State.
* for example if I am withdrawing money from ATM and Similar thing happens there then if bank server didn't work then also ATM shows that Cash is withdrawn Successfully.

8. What is the biggest conceptual difference between the previous task and this task? Explain the programming mindset difference
* The previous Task stablishes the logical concept behind the pattern printing , also made realize to observe the input and output. 
* Whereas in this task all the dots are connected (like wider view to decision making statements and loops and switch case vs exception handling).
* the difference between Exception Handling and Path Deciding Statements
* in this task I can feel like a backend developer how the developer will handles exception and where she/he raise her/his own exception 

# Tricky code Analysis

1. Case 1 
* Exact output? : 
` A `
` C` 
` D `
` E `

* Which statements execute? : the statement before the exception code will execute , catch statement will executes, finally statement always executes, and the last statement also execute

* Does B print? : NOPE because that statement is inside the try block after the exception occur so it cannot run as exception needs to be catch to maintain the program flow.

* Does finally execute : finally block always execute 

2. Case 2
* Predict exact output. : pehle toh finally hi execute hoga then method return hoga 
* ` Finally ` 
* ` 10 `

3. Case 3
* COMPILATION ERROR 
* because specific exception baad mei likha hai toh waha tak toh program kabhi jaa hi nhi payega toh compiler error dega
* it is like ki agar ek leaf mei problem hai toh mai branch thodi cut karungi tree ki 
* that is whhy we need to focus on the sequence of catch exception

4. Case 4
* remove(x) : will remove the value at index x (here x is an integer )
* so remove(1) : will remove the value 20 which is at index 1.

5. Case 5 
* size : 3
* {10 ,20 ,30}
* because HashSet stores only unique elements if it gets duplicate elements it ignores it 
* cannot guarantee the exact set output because set is unordered (itself sort or arrange into ascending order)

6. Case 6
* size : 2 
* 101 : C
* HashMap doesnot allow entry of duplicate key ( key must be unique) so if we try to enter the existing key again then the old value will be replaced by the new value and hence there will be only 2 key-value pairs in HashMap

7. Case 7
* ` Start`
* ` Caught`
* ` End`
* Does execution resume from "Middle" after catch? : NOPE because the catch after handling the exception does not go back to try block, it resume the program and maintain the program flow which is after that catch block

8.  Case 8
* Exact output? : [1,3]
* Will all even numbers be removed? : YES because array.get(i) will return the value at index i and if that value is completely divisible by 2 (even) then the value at index i is removed (array.remove(i)).

* Why can modifying the list during iteration become tricky? : (mere hisab se) as we access the elements using array indexing to sometimes it is confusing that if we are using values or index.