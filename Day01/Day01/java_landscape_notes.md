### why does Java compile programs into an intermediate "bytecode" instead of compiling directly into machine language?
- Java is a language which converts the source code into bytecode first then machine code because it is portable we can run the java code irrespective of many machine there will be no problem in it (platform independent).

### how do interrupts make a CPU more efficient at handling asynchronous events compared to polling loops?
- Interrupt handling provides an efficient way for devices to communicate with the CPU. Instead of the CPU constantly checking device status (polling), devices can signal the CPU only when they need attention. This efficiency reduces CPU overhead and improves system performance

### If another computer wants to run your Java program do they need to recompile the "HellpWorld.java" file? why or why not?
- No, because Java works on the principle of "WORA" and it is portable because of the bytecode.

### What is the Fetch and Execution Cycle?
-The fetch-and-execute cycle is the continuous core operation of a CPU where it retrieves instructions from memory, decodes them, and performs the required actions


### What is the difference between Compiler and Interpreter?
1. Compiler: Translates whole source code into an intermediate machine-code file at one time, runs fast because the translation happens before execution.
2. Interpreter: Translates and runs source code line by line, no intermediate file is made, making startup faster but overall runtime slower. 


### What is JVM and JavaByte code?
1. Java Virtual Machine (JVM): A software engine that acts as a runtime layer to translate Java bytecode into exact machine instructions for your specific computer hardware.
2. Java Bytecode: A standardized, portable intermediate code format created by the Java compiler from human-readable source code.


### What are variables and why do they require "types" in programming?
1. Variables: Named storage boxes in computer memory used to hold data values while a program runs.
2. Why types are needed: Types tell the computer how much memory to reserve and how to interpret the bit patterns (for example, treating a value as text, a whole number, or a decimal).


### What is the Difference between a loop and a branch?
1. Loop: Repeats a block of code multiple times until a specific condition turns false.
Example for, while, do-while loop.
2. Branch: Makes a single choice to jump to a different section of code based on whether a condition is true or false.
Example if-else or switch case statement