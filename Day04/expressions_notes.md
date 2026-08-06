# QNA
## Q.1. Math.random() logic: Math.random() returns " [0.0,1.0) ".Using maths logic, Explain why (int) ( Math.random() * 6) + 1 strictly returns integer from 1 to 6 just a little logical part.
- Using girl's maths logic (didn't search anywhere) 
1. (int) :- returns integer values as Math.random() was returning float or double value
2. Math.random() * 6 :- as (int) Math.random() gonna returns [0,1) so multiplying 6 gonna give [0,6) .
3. +1 at last :- because to get interval between [0,6] (include 6) we add one so that we get [0,7) jisme 6 ly karega.
(i don't know i could be wrong so kindly tell).

## Q.2. Integer Overflow: What is integer overflow, and why must a Java application handle upper/lower limits of primitive types like int during arithmetic?
- In Java Primitive Data Type it tells about the size and range of data it can hold if the value exceeds the range of the datattype size the there will be Overflow
- For example : int has size 4 byte according to which it has range [-2147483648,2146483647] any value lies in this range can be stored as int but beyond this range cannot be store in int.
- so when any something like this happens Java does not know how to handle such issue, it doesn't even through an error.
- tabh kya hota hai we assume ki saari values range ki ek circle mein arrange hai (pizza which as too many pieces) so jab last value ke baad agar exceed karega then wo phir stop nhi hoga 360" degrees ke baad wo aage aur chakkar kaatega. (I'll try to add image related to this)s


## Why == should not be used for strings and what it physically checks in memory ?
- String is a non primitive datatype which stores object
- == checks whether the variables are pointing to same object or not 
- we usually use .equals() which checks whether the content is same or not

## Type Conversion
1. Implicit : you don't need to change the type of datatype manually, java (compiler) doing that automatically.
- here, basically small size datatype changes to larger size datatype not vice versa.
- this is a beautiful way of compiler to maintain data's integrity.
- this concept is known Implicit Widening.

2. Explicit : which we had to do manually 
- here, we can perform both the things Widening or narrowing.
- Narrowing is basically avoided because of data loss.
- Analogy : gareeb ameer banega toh faida hoga (data precision) whereas jab ameer gareeb ban jayega toh loss hoga (data loss ).


## How declaring package affects compilation and execution paths from CLI
- declaring a package at the beginning or your project folder structure influence the execution paths from CLI.
- Analogy (for myself) : Your parent's or family's name/surname influence your whole name(first name + last name) similar to that your folder name is your package name and your file name will be your java class name. (access : folder_Name.file_Name or we can say package_Name.class_Name).

## Increment/Decrement Operator:
1. Post Increment/Decrement : i++ / i--
- a = i++
- work same as pre increment for single variable but internally works different.
- 1st of all value assigned then incremented (increased) by +1
- Analogy : pehle aapki shaadi hui aur phir bacche huye

2. Pre Increment/Decrement : ++i / i--
- a = ++i
- 1st of all value incremented (increased by 1) then assigned
- Analogy : pehle bacche huye (adopted) aur phir shaadi hui



