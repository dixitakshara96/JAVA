## Case 1 — Enhanced For-Loop Mutation 
` OUTPUT : arr[0] = 10 `
* aisa kyun hua toh humne pehle har ek array element ko access kiya aur uski value ko double kiya 
* and then reassign kiya jisse elements double ho gye
* Now array arr = {10, 20, 30} 

## Case 2 — Array Initialization & Default Values
` OUTPUT : 0 ` 
* initially jab koi value nhi de rhe hai toh default it will store defalut value of int which is 0.

## Case 3 — Array Bounds Trap
` OUTPUT : `

## Case 4 — The Length Property vs Method

## Case 5 — Array Print Behavior
` OUTPUT : actually isme ajeeb se hexadecimal no. output mai milenge` 
* ab wo no. actually memory reference hai array object ka stack mai
* agr hume array object ki value print karni hai toh 
* ` Arrays.toString(chars) ` : isse karenge

## Case 6 — Post-Increment in Arrays
` OUTPUT : 10   20` 
* post increment logic ki pehle assign hota hai then increment 
* arr[i++] : pehle arr[0] print kar dega
* arr[i] : actually arr[1] ho gya hai toh wo print ho jayega

## Case 7 — 2D Array References
` OUTPUT : 0 0`
* default value 

## Case 8 — Out of Bounds on Loop Condition
` OUTPUT : ArrayIndexOutOfBound `
* exception aajayega kyunki ab i+1 means 3 aur arr[3] kuch hai hi nhi


## Case 9 — Overwriting References
` OUTPUT : 99`
* a and b are reference variables of array object
* when we do a = b and then modified b[0] toh sach mai b[0] par 99 aajayega
* ab kyunki a bhi ussi cheez ko refer kar rha hai toh a[0] bhi modified ho gya hai
* Now a and b both are refering to the same object in heap

## Case 10 — Collection Overload
` OUTPUT : {10, 20} `
* list.remove(index) ab yaha list.remove(10) hai aur 10th index pe abhi kuch hai nhi toh delete nhi hohga
* ab error kyun nhi ayega kyunki ArrayLists dynamic hoti hai


