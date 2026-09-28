## CASE 1 : 
#### ` OUPUT : -1 ` 
* REASON: ans never updated to mid - 1 it will remains -1 and just after 2 iterations it will break

## CASE 2 : 
#### ` OUPUT : -97483648 and 2050000000 ` 
* REASON: - THE CONCEPT IS INTEGER OVERFLOW (for 1st ans , 2nd one is simple)
- In Java Primitive Data Type it tells about the size and range of data it can hold if the value exceeds the range of the datatype size the there will be Overflow
- For example : int has size 4 byte according to which it has range [-2147483648,2146483647] any value lies in this range can be stored as int but beyond this range cannot be store in int.
- so when any something like this happens Java does not know how to handle such issue, it doesn't even through an error.
- tabh kya hota hai we assume ki saari values range ki ek circle mein arrange hai (pizza which as too many pieces) so jab last value ke baad agar exceed karega then wo phir stop nhi hoga 360" degrees ke baad wo aage aur chakkar kaatega.

## CASE 3 : 
#### ` OUPUT : infinite loop ` 
* REASON: it get stuck at the value mid = 0 , low = 1 and high = 2 as high > low toh infinite loop.

## CASE 4 : 
#### ` OUPUT : 3 , -3 , -1 ` 
* REASON: abhi nhi pta

## CASE 5 : 
#### ` OUPUT : ["Cherry" , "apple" , "banana"] ` 
* REASON: according to Ascii value 

## CASE 6 : 
#### ` OUPUT : 2 ` 
* REASON: as the loop does not break at the first occurence it will continue and iterate completely over array.

## CASE 7 : 
#### ` OUPUT : error : missing return statemnt ` 
* REASON: as we are not returning any value (that must be int) in function search() 

## CASE 8 : 
#### ` OUPUT : No output ` 
* REASON: as the target value never matches and loop will itself break after low > high

## CASE 9 : 
#### ` OUPUT : true , false, true ` 
* REASON: pehla wala true isliye as both a and b pointing to same object in heap 
* second is false as kyunki ab value badi hai toh separate obj banenge (python .is() logic)
* third true because value/content toh same hai 

## CASE 10 : 
#### ` OUPUT : 1, 3, -1 , 2 ` 
* REASON:  
- 1st output 1 : return the first index of 10 which is 1.
- 2nd output 3 : return the last index of 10 which is 1. 
- 3rd output -1 : return -1 as 99 is not found in given list
- 4th output 2 : we updated the list by removing 10 so the first value is removed now our list become {5, 15, 10} and then we are printing the idex of 10 which is 2.

