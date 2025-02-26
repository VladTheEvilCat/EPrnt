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
	 * P now refers to <code>System.out</code>. Use <code>P.print</code> / <code>P.println</code> instead of <code>System.out.print</code> / <code> System.out.println </code>
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
	 * Default constructor-
	 * It's an abstract class; EPrnt is uninstantiable.
	 */
	private EPrnt(){}

	/**
	 * Toggles toggleable <code>dprint</code> and <code>dprintln</code> statements; 
	 * @param canPrintDebugs whether <code>dprint</code> and <code>dprintln</code> can print or not
	 */
	public static final void setDebugPrinting(boolean canPrintDebugs){
		debugPrinting = canPrintDebugs;
	}

	/**
	 * Sets the string that is printed on the same line, 
	 * prior to the value passed into <code>dprint</code> and <code>dprintln</code>.
	 * <p>
	 * <code>setDebugPrefix("Debug: ");
	 * dprintln("a debug value");</code>
	 * <code>Debug: a debug value</code>
	 * @param s The string which precedes the printed value; set to an empty string to remove the prefix.
	 */
	public static final void setDebugPrefix(String s){ debugPrefix = s; }
	
	/**
	 * Gets the string that is printed on the same line, 
	 * prior to the value passed into <code>dprint</code> and <code>dprintln</code>.
	 * @return The string which precedes the value to be printed
	 */
	public static final String getDebugPrefix(){ return debugPrefix; }

//PRINT
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print(debugPrefix + b)</code>
	 * @param b the boolean value to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 */
	public static final void dprint(boolean b){ if(debugPrinting) P.print(debugPrefix + b); }

	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print(debugPrefix + c)</code>
	 * @param c the character value to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 */
	public static final void dprint(char c){ if(debugPrinting) P.print(debugPrefix + c); }

	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print(debugPrefix + s)</code>
	 * @param s the character array to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 */
	public static final void dprint(char[] s){ if(debugPrinting) P.print(debugPrefix + s); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print(debugPrefix + d)</code>
	 * @param d the double to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 */
	public static final void dprint(double d){ if(debugPrinting) P.print(debugPrefix + d); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print(debugPrefix + f)</code>
	 * @param f the float to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 */
	public static final void dprint(float f){ if(debugPrinting) P.print(debugPrefix + f); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print(debugPrefix + i)</code>
	 * @param i the integer to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 */
	public static final void dprint(int i){ if(debugPrinting) P.print(debugPrefix + i); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print(debugPrefix + l)</code>
	 * @param l the long to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 */
	public static final void dprint(long l){ if(debugPrinting) P.print(debugPrefix + l); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print(debugPrefix + o)</code>
	 * @param o the Object to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 */
	public static final void dprint(Object o){ if(debugPrinting) P.print(debugPrefix + o); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print(debugPrefix + s)</code>
	 * @param s the String to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 */
	public static final void dprint(String s){ if(debugPrinting) P.print(debugPrefix + s); }

//PRINTLN
/**
	 * If <code>debugPrinting</code> is true, it calls <code>println(debugPrefix + b)</code>
	 * @param b the boolean value to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 */
	public static final void dprintln(boolean b){ if(debugPrinting) P.println(debugPrefix + b); }

	/**
	 * If <code>debugPrinting</code> is true, it calls <code>println(debugPrefix + c)</code>
	 * @param c the character value to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 */
	public static final void dprintln(char c){ if(debugPrinting) P.println(debugPrefix + c); }

	/**
	 * If <code>debugPrinting</code> is true, it calls <code>println(debugPrefix + s)</code>
	 * @param s the character array to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 */
	public static final void dprintln(char[] s){ if(debugPrinting) P.println(debugPrefix + s); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>println(debugPrefix + d)</code>
	 * @param d the double to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 */
	public static final void dprintln(double d){ if(debugPrinting) P.println(debugPrefix + d); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>println(debugPrefix + f)</code>
	 * @param f the float to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 */
	public static final void dprintln(float f){ if(debugPrinting) P.println(debugPrefix + f); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>println(debugPrefix + i)</code>
	 * @param i the integer to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 */
	public static final void dprintln(int i){ if(debugPrinting) P.println(debugPrefix + i); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>println(debugPrefix + l)</code>
	 * @param l the long to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 */
	public static final void dprintln(long l){ if(debugPrinting) P.println(debugPrefix + l); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>println(debugPrefix + o)</code>
	 * @param o the Object to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 */
	public static final void dprintln(Object o){ if(debugPrinting) P.println(debugPrefix + o); }
	
	/**
	 * If <code>debugPrinting</code> is true, it calls <code>println(debugPrefix + s)</code>
	 * @param s the String to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 */
	public static final void dprintln(String s){ if(debugPrinting) P.println(debugPrefix + s); }

	/**
	 * If <code>debugPrinting</code> is true, it calls <code>printf(debugPrefix + s)</code>
	 * <p><code>debugPrefix</code> IS NOT APPLIED TO THIS METHOD
	 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html#printf-java.lang.String-java.lang.Object...-">PrintStream.printf(String, Object)</a>
	 * @param format the String to be printed.
	 * @param args arguments referenced by the format specifiers in the format string; 
	 */
	public static final void dprintf(String format, Object... args){ if(debugPrinting) P.printf(format,args); }
}
