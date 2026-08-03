# String in JAVA
* non primitive datatype
* String is an object because we have built-in String Class in JAVA
* String stored in "String Pool" (very string is an object so there is an object reference)
* there is proper indexing of every String object
* immutable can't change the value of same object instance once in is created
* String Operations :
1. .length()
2. .charAt()
3. .toLowerCase()
4. .toUpperCase()
5. .trim()

# DataTYpes in JAVA
1. Primitive 
* Fixed (Static) Memory Size and no methods
- byte
- small
- int
- long
- float
- double
- char
- boolean

2. Non Primitive 
* Dynamic Memory Size and Methods (because CLasses)
- String
- Class
- Object
- Scanner

# Methods in JAVA (functions)
* a block of code which performs a specific task.
* reusability and modularity
1. Static function: belongs to Class (Eg. Math.sqrt(25);)

2. Instance funtion: belongs to Object instance (Eg. String name="ABC"; 
name.toLowerCase();)

### ANALOGY (Static vs Instance) 😅
1. Every normal human has fingers (Static Method no object needed) but every human has unique Fingerprint (Instance method need an object)

2. In wedding there is Buffet (Static Method no object needed) and BuffetPlate (each plate which we take) aur phir hum apni pasand ki dishes lete hai (Instance Method).

# UserInput and Scanner
* the input which the user can give to the program at command-line
* Scanner class in java helps in taking Input from User.
* we can take input using
1. next() : accept only single word before space
2. nextLine(): accept complete input
3. nextInt(): accept only int 
4. nextDouble(): accept int and decimal but return only decimal
* we need to import Scanner package 

### ANALOGY (next() vs nextLine())
1. jab ghar par hote hai toh usually ek sabzi milti hai khaane ko (.next() single word input only) whereas jab bandara hota hai toh waha toh aaloo-matar, kaddu, mix-veg and etc-etc sab rehta hai (.nextLine() accept complete userInput).

2. nextInt() : only good students are allowed
3. nextDouble(): both good and bad (baddies) are alllowed but session end hone par sabhi good student ban gye

# Package Import
* java has structured packages which contains different different classes
* when we need a particular class we import the package which has that class

# Difference between == and .equal()
1. == : checks whether the refence is same
eg. jaise mene Zudio se clothes khareede aur aapne bhi same Zudio se clothes Khareede the location is same

2. .equals() : checks whether the content is same
eg. aapne bhi white tshirt khareedi (Vishal Mega Mart se) aur mene bhi white tshirt khareedi (Zudio se) the content is same.

# QNA
1. Why is String called Object instead of a primitive data type?
* In java String is a class (non primitive data type) so every string is an object

2. Why do we use Scanner?
* to take input in Java we use Scanner Class

3. What is the difference between next() and nextLine()?
* next() takes only one word input whereas nextLine() takes complete input

4. Which String Method did you find most useful and why?
* charAt(i) we can find the character at index i (thoda indexing pta chal jayega).



