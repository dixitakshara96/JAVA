1. 
What is an exception?
* Exception is a subclass of throwable that represents an abnormal condition or event that occurs during the execution of the program and disrupt the normal flow , but it can be handled through try catch 

2. 
try vs catch
* This statement inside the try block , whose execution is monitored for exceptions that may be handled 
* catch block that defines a handler for a specific type of exception thrown from associated try block


3. 
finally
* Finally, as the word itself says, finally, the code written inside the block finally will always execute either the program crashes or not. The statement is written inside. Finally is quite important. For example, if I have opened a file, it needs to be closed, so I write that closed code inside the finally blocked.

4. 
throw vs throws
* Throw actually throw an exception.When a programmer needs to raise an exception , it uses throw
* whereas throws used to declare possible exception in a method signature


5. 
Checked vs unchecked exception
* The exceptions, Java compiler requires the programmer to either catch or declare in the methods through claw. These exceptions are called as checked exceptions, 
* whereas exceptions belonging to runtime exception or one of its subclasses for which compiler does not require explicit catching or declaring. These exceptions are called unchecked exceptions.


6. 
Exception propagation
* The process by which an uncaught exception is transferred from the method where it occurs through the calling method in a call stack until it is handled or reach the top-level.Execution context is called the exception propagation

7. 
Why specific catches should usually come before general catches
* When using multiple catch blocks more specific exception types must appear before their generals supertype because if I write the general exception before the specific exception, the specific exception block does not execute does not run.So the compiler things that why do we need this ?So that's why it is irrelevant to write?And that's why the compilation error occurs

8. 
Why exception handling is better than silently ignoring errors
* Exception handling is better because sometimes we want that program should not terminate whenever a exception is raised.So to maintain the flow of the program as it is.So we use exception handling