1. Why were collections introduced?
* Collections are the dynamic data structures provided to store, organize and manipulate data (object in java).
* store
* organize
* manipulate (operations)


2. Array vs ArrayList
* Array : 
` Fixed size`
` No special Method `
` Stores Primitive DT `

* ArrayList :
` Dynamic size `
` Method `
` Stores Object not primitive DT `


3. ArrayList vs HashSet
* ArrayList 
` Stores duplicate elements also`
` ordered`
` can access values using index`

* HashSet 
` only unique elements`
` unordered (always sorted itself is ascending order) `
` no indexing so cannot access`

4. HashSet vs HashMap
* HashSet
` stores elements (object)`
` only unique values`
` unordered`
` Collection type : it is a subclass of Collection`

* HashMap
` stores key value pair`
` unique key `
` unordered but can access values using key`
` Map type : subclass of Map`

5. What is a key-value pair?
* mapping of a key to the associated value this is a pair which is stored in HashMap
* there must be unique key 
* no duplicate key is allowed 
* if tries to store different value with already existing key then the old value is replaced by the new value.

6. Why can HashSet output order be unpredictable?
* because it is unordered 
* no indexing as well 

7. What happens when an existing HashMap key is inserted again?
* if tries to store different value with already existing key then the old value is replaced by the new value.

8. Why is entrySet() useful?
* entrySet() contains 
` entry.getKey()` : all the keys 
` entry.getValue()`: all the values
* hence it is useful when we need to access both the key and value

9. Where would you use List, Set and Map in a real system?
* List : To store Marks of the students (data which can be same )
* Set : To store ID ( data which must be unique)
* Map : University Roll Number and Student Name ( useful for mapping dependent and independent entities)








