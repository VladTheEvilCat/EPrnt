/**
 * Shortens 'System.out' to 'P': P.print(); P.println();
 * <p>
 * Also adds toggleable print statements, with optional prefix, for when you want to debug your code.
 * 
 * @author Vladimir J. Caso
 * @version 1.0, 02/26/25
 */ 
public abstract class EPrnt {

	/**
	 * P refers to <code>System.out</code>. Use <code>P.print</code> / <code>P.println</code> instead of <code>System.out.print</code> / <code> System.out.println </code>
	 */
	public static final java.io.PrintStream P = System.out;

	/**
	 * Whether <code>dprint</code> and <code>dprintln</code> statements can print or not.
	 */
	protected static boolean debugPrinting = false;

	/**
	 * The string that is concatenated infront of the value passed to <code>dprint</code> and <code>dprintln</code>, but NOT <code>dprintf</code>.
	 */
	protected static String debugPrefix = "";

	/**
	 * The string that is concatenated inback of the value passed to <code>dprint</code> and <code>dprintln</code>, but NOT <code>dprintf</code>.
	 */
	protected static String debugPostfix = "";

	/**
	 * Default constructor-
	 * It's an abstract class; EPrnt is uninstantiable.
	 */
	public EPrnt(){}

	/**
	 * Toggles toggleable <code>dprint</code> and <code>dprintln</code> statements; 
	 * @param canPrintDebugs whether <code>dprint</code> and <code>dprintln</code> can print or not
	 */
	public static final void setDebugPrinting(boolean canPrintDebugs){
		debugPrinting = canPrintDebugs;
	}

	/**
	 * Sets the string that is printed on the same line, 
	 * prior to the value that is passed into <code>dprint</code> and <code>dprintln</code>.
	 * <p>
	 * <code>setDebugPrefix("Debug: ");
	 * dprintln("a debug value");</code>
	 * <code>Debug: a debug value</code>
	 * @param s The string which precedes the printed value; set to an empty string to remove the prefix.
	 */
	public static final void setDebugPrefix(String s){ debugPrefix = s; }

	/**
	 * Sets the string that is printed on the same line, 
	 * after the value that is passed into <code>dprint</code> and <code>dprintln</code>.
	 * <p>
	 * <code>setDebugPrefix("Debug: ");
	 * dprintln("a debug value");</code>
	 * <code>Debug: a debug value</code>
	 * @param s The string which precedes the printed value; set to an empty string to remove the prefix.
	 */
	public static final void setDebugPostfix(String s){ debugPostfix = s; }
	
	/**
	 * Gets the string that is printed on the same line, 
	 * prior to the value passed into <code>dprint</code> and <code>dprintln</code>.
	 * @return The string which precedes the value to be printed
	 */
	public static final String getDebugPrefix(){ return debugPrefix; }

	/**
	 * Gets the string that is printed on the same line, 
	 * after to the value that is passed into <code>dprint</code> and <code>dprintln</code>.
	 * @return The string which procedes the value to be printed
	 */
	public static final String getDebugPostfix(){ return debugPostfix; }

//PRINT
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print(debugPrefix + b + debugPostfix)</code>
	 * @param b the boolean value to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final void dprint(boolean b){ if(debugPrinting) P.print(debugPrefix + b + debugPostfix); }

	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print(debugPrefix + c + debugPostfix)</code>
	 * @param c the character value to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final void dprint(char c){ if(debugPrinting) P.print(debugPrefix + c + debugPostfix); }

	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print(debugPrefix + s + debugPostfix)</code>
	 * @param s the character array to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final void dprint(char[] s){ if(debugPrinting) P.print(debugPrefix + s + debugPostfix); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print(debugPrefix + d + debugPostfix)</code>
	 * @param d the double to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final void dprint(double d){ if(debugPrinting) P.print(debugPrefix + d + debugPostfix); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print(debugPrefix + f + debugPostfix)</code>
	 * @param f the float to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final void dprint(float f){ if(debugPrinting) P.print(debugPrefix + f + debugPostfix); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print(debugPrefix + i + debugPostfix)</code>
	 * @param i the integer to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final void dprint(int i){ if(debugPrinting) P.print(debugPrefix + i + debugPostfix); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print(debugPrefix + l + debugPostfix)</code>
	 * @param l the long to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final void dprint(long l){ if(debugPrinting) P.print(debugPrefix + l + debugPostfix); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print(debugPrefix + o + debugPostfix)</code>
	 * @param o the Object to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final void dprint(Object o){ if(debugPrinting) P.print(debugPrefix + o + debugPostfix); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print(debugPrefix + s + debugPostfix)</code>
	 * @param s the String to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final void dprint(String s){ if(debugPrinting) P.print(debugPrefix + s + debugPostfix); }

//PRINTLN
/**
	 * If <code>debugPrinting</code> is true, it calls <code>println(debugPrefix + b + debugPostfix)</code>
	 * @param b the boolean value to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final void dprintln(boolean b){ if(debugPrinting) P.println(debugPrefix + b + debugPostfix); }

	/**
	 * If <code>debugPrinting</code> is true, it calls <code>println(debugPrefix + c + debugPostfix)</code>
	 * @param c the character value to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final void dprintln(char c){ if(debugPrinting) P.println(debugPrefix + c + debugPostfix); }

	/**
	 * If <code>debugPrinting</code> is true, it calls <code>println(debugPrefix + s + debugPostfix)</code>
	 * @param s the character array to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final void dprintln(char[] s){ if(debugPrinting) P.println(debugPrefix + s + debugPostfix); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>println(debugPrefix + d + debugPostfix)</code>
	 * @param d the double to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final void dprintln(double d){ if(debugPrinting) P.println(debugPrefix + d + debugPostfix); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>println(debugPrefix + f + debugPostfix)</code>
	 * @param f the float to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final void dprintln(float f){ if(debugPrinting) P.println(debugPrefix + f + debugPostfix); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>println(debugPrefix + i + debugPostfix)</code>
	 * @param i the integer to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final void dprintln(int i){ if(debugPrinting) P.println(debugPrefix + i + debugPostfix); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>println(debugPrefix + l + debugPostfix)</code>
	 * @param l the long to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final void dprintln(long l){ if(debugPrinting) P.println(debugPrefix + l + debugPostfix); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>println(debugPrefix + o + debugPostfix)</code>
	 * @param o the Object to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final void dprintln(Object o){ if(debugPrinting) P.println(debugPrefix + o + debugPostfix); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>println(debugPrefix + s + debugPostfix)</code>
	 * @param s the String to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final void dprintln(String s){ if(debugPrinting) P.println(debugPrefix + s + debugPostfix); }

	/**
	 * If <code>debugPrinting</code> is true, it calls <code>printf(debugPrefix + s)</code>
	 * <p><code>debugPrefix</code> IS NOT APPLIED TO THIS METHOD
	 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html#printf-java.lang.String-java.lang.Object...-">PrintStream.printf(String, Object)</a>
	 * @param format the String to be printed.
	 * @param args arguments referenced by the format specifiers in the format string; 
	 */
	public static final void dprintf(String format, Object... args){ if(debugPrinting) P.printf(format,args); }
}
