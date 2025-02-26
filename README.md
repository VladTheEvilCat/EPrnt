Shortens 'System.out' to 'P': P.print(); P.println();
Also adds toggleable print statements, with optional prefix, for when you want to debug your code.
All PrintStream methods are accessed through `P`
"Full" code example:
```java
public class ClassName extends EPrnt {
  public static void main(String[] args){
    P.print("It's not delivery, "); // Much shorter than System.out.print!
    P.println("it's Bonjourno!"); // Much shorter than System.out.println!

    setDebugPrinting(true);
    dprintln("DebugPrinting is set to true."); // Much shorter than `if(debug) System.out.println(...)`!

    setDebugPrefix("DEBUG: ");
    dprintln("this is a debug line");

    setDebugPrefix("");
    dprint("no more prefix!");
  }
}
```
prints:
```
It's not delivery, it's Bonjourno!
DebugPrinting is set to true.
DEBUG: this is a debug line
no more prefix!
```

Note: You don't really need all this. You could just add
```java
public static final java.io.PrintStream P = System.out;
```
to the class fields, but then you won't get the extra debug printing stuff.
