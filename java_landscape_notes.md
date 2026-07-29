* why does Java compile programs into an intermediate "bytecode" instead of compiling directly into machine language?
** Java is a language which converts the source code into bytecode first then machine code because it is portable we can run the java code irrespective of many machine there will be no problem in it (platform independent).

* how do interrupts make a CPU more efficient at handling asynchronous events compared to polling loops?
** Interrupt handling provides an efficient way for devices to communicate with the CPU. Instead of the CPU constantly checking device status (polling), devices can signal the CPU only when they need attention. This efficiency reduces CPU overhead and improves system performance

* If another computer wants to run your Java program do they need to recompile the "HellpWorld.java" file? why or why not?
** No, because Java works on the principle of "WORA" and it is portable because of the bytecode.