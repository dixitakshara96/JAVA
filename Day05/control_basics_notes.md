# BLock Statement & Scope:
- Block Statement is nothing but just code inside the "{}". we use these after every important keyword in JAVA (if-else, function, class, switch-case, loops etc).
- declaring a variable inside a loop defines the scope and lifetime of that variable, the variable can be accessed anytime inside that block of code (lifetime), scope within the block and has lifetime till the execution of the block.
- we cannot access that variable outside the block ( because scope ended).

# Loop Selection Strategy:
- for loop : when you know the termination condition and your iteration is simple
- while loop : when you don't have any idea about the termination condition 
- do while loop : when you want to iterate atleast for once whether condition of getting into the loop is true or false.

- `ANALOGY` : 
lets assume ki hum stairs chadd rhe hai (mene yaha stairs chaddne ka example liya hai aap utarne ka bhi le skte hai)

1. for loop- jab tumhe pta hai tumhe kitni stairs chadd na hai toh tum bilkul neeche wali stair (initial condition) se shuru karoge aur tumhe pta hai ki mujhe aaj 100 stairs chaddni hai tabh tak chaddte rahoge and with each step you are incrementing your position (base variable).

2. while loop - jab aapko starting mein nhi pta aapko kitne stairs chaddne hai then we use this loop. with each step your postion is incremented and most importantly aap yeh analyze karte ho ki main apni destination par toh nhi pahuch gya if yes then loop terminates nhi toh endless/infinite loop chal jayega

3. do while loop - jab aapko nhi pta aapki manzil kya hai but yeh assurance hai ki atleast ek stair toh chaddna hi hai. 


# Conditional Control Flow :
- using independent if statements we prefer when we want every condition to be checked either one to the if statement is true or false. it takes more time as it checks every condition. Use Case : I generally use it when i am printing * (Star) Patterns

- in if-else-if ladder the program simply (terminates or get out) of this control flow when the "Above" given if/else-if statement is true without checking any other statements. This saves the time. Use Case: I use it in Grade and Marks program.

- `ANALOGY` : nested if
1. For example ek bhandara ho rha hai agar usme mix veg hai tabhi main usme jaungi warna nhi jaungi. (if-else)
   - (now lets get inside the if statement) lets say bhandare main mix veg thi toh main gyi ab mene check kiya ki halwa hai ki nhi, agar halwa hai toh main aapko bhi bula lungi nhi toh yeh condition satisfy nhi hui aapko nhi bulaya jayega.(if mix-veg then I go to bhandara and if I find halwa also there then I will call u as well).


# Switch Mechanism:
- break statement : it is used in loops and switch case statements to get out it. 
- Aam Zindagi : (without break) when a case is satisfies then the statement inside it executes but the cases below it also executes because nobody to stop it.
- Mentos Zindagi : (with break) whereas with break when the statement inside the case executes after the compiler/interpreter (in java interpreter) see break it get out of the switch statement.
- this is the reason why in CASE 1 the statements 2 and 3 executes.

# Answer to the tricky code ANALYSIS : 

## CASE 1 : OUTPUT 

* not fail (81>33)
* grade d (81>50)
* grade c (81>60)
* grade b (81>70)
* grade a (81>80)
### Reason because given value is 81 which is greater than all the conditions written inside if statemment and in if- if ladder every condition is checked whether the above one was true or false.

## CASE 2 : OUTPUT

* Option 2 Selected
* Option 3 Selected
### Reason because there is no break statement in Case 2 to this will execute Case 3 as well but at the end of Case 3 there is Break statement which takes out of the switch case statement.


## Nested vs Logical And 

* when i need that both the conditions must satisfy then only i want to pperform a task - I USE &&
* when i want ki pehle 1 condition satisfy kare uske baad we will find ki 2nd karegi ya nhi - I USE NESTED IF

## Switch Supported Type:

* int - primitive
* char - primitive
* String - non primitive
* Enum - non primitive
* byte - primitive
* short - primitive 
* But in modern JAVA all primitive datatypes are allow in switch case statement
