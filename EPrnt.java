/**
 * Shortens 'System.out' to 'P': P.print(); P.println();
 * <p>
 * Also adds toggleable print statements, with optional prefix, for when you want to debug your code.
 * 
 * @author Vladimir J. Caso
 * @version 1.0, 02/26/25
 */ 
public abstract class EPrnt <T> {

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

	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print(b)</code>
	 * Neither the prefix nor the postfix are printed.
	 * @param p the value to be printed.
	 * @see #debugPrinting
	 */
	public static final <T> void dprintraw(T p){
		if(debugPrinting) 
			P.print(p);
	}

	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print(b)</code>
	 * Neither the prefix nor the postfix are printed.
	 * @param p the value to be printed.
	 * @see #debugPrinting
	 */
	public static final <T> void dprintlnraw(T p){
		if(debugPrinting) 
			P.println(p);
	}

	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print(debugPrefix + b + debugPostfix)</code>
	 * @param p the value to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final <T> void dprint(T p){
		if(debugPrinting) 
			P.print(debugPrefix + p + debugPostfix);
	}

	/**
	 * If <code>debugPrinting</code> is true, it calls <code>println(debugPrefix + b + debugPostfix)</code>
	 * @param p the value to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final <T> void dprintln(T p){
		if(debugPrinting) 
			P.println(debugPrefix + p + debugPostfix);
	}

	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print((ignorePrefix? "":debugPrefix) + p + debugPostfix)</code>
	 * @param ignorePrefix if true, the prefix is not printed but the postfix always is.
	 * @param p the value to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final <T> void dprint(boolean ignorePrefix, T p){
		if(debugPrinting) 
			P.print((ignorePrefix? "" : debugPrefix) + p + debugPostfix);
	}

	/**
	 * If <code>debugPrinting</code> is true, it calls <code>println((ignorePrefix? "":debugPrefix) + p + debugPostfix)</code>
	 * @param ignorePrefix if true, the prefix is not printed but the postfix always is.
	 * @param p the value to be printed.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final <T> void dprintln(boolean ignorePrefix, T p){
		if(debugPrinting) 
			P.println((ignorePrefix? "" : debugPrefix) + p + debugPostfix);
	}

	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print(debugPrefix + p + (ignorePostfix? "" : debugPostfix))</code>
	 * @param p the value to be printed.
	 * @param ignorePostfix if true, the postfix is not printed but the prefix always is.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final <T> void dprint(T p, boolean ignorePostfix){
		if(debugPrinting) 
			P.print(debugPrefix + p + (ignorePostfix? "" : debugPostfix));
	}

	/**
	 * If <code>debugPrinting</code> is true, it calls <code>println(debugPrefix + p + (ignorePostfix? "" : debugPostfix))</code>
	 * @param p the value to be printed.
	 * @param ignorePostfix if true, the postfix is not printed but the prefix always is.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final <T> void dprintln(T p, boolean ignorePostfix){
		if(debugPrinting) 
			P.println(debugPrefix + p + (ignorePostfix? "" : debugPostfix));
	}

	/**
	 * If <code>debugPrinting</code> is true, it calls <code>print((ignorePrefix? "" : debugPrefix) + p + (ignorePostfix? "" : debugPostfix))</code>
	 * @param ignorePrefix if true, the prefix is not printed but the postfix always is.
	 * @param p the value to be printed.
	 * @param ignorePostfix if true, the postfix is not printed but the prefix always is.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final <T> void dprint(boolean ignorePrefix, T p, boolean ignorePostfix){
		if(debugPrinting) 
			P.print((ignorePrefix? "" : debugPrefix) + p + (ignorePostfix? "" : debugPostfix));
	}

	/**
	 * If <code>debugPrinting</code> is true, it calls <code>println((ignorePrefix? "" : debugPrefix) + p + (ignorePostfix? "" : debugPostfix))</code>
	 * @param ignorePrefix if true, the prefix is not printed but the postfix always is.
	 * @param p the value to be printed.
	 * @param ignorePostfix if true, the postfix is not printed but the prefix always is.
	 * @see #debugPrinting
	 * @see #debugPrefix
	 * @see #debugPostfix
	 */
	public static final <T> void dprintln(boolean ignorePrefix, T p, boolean ignorePostfix){
		if(debugPrinting) 
			P.println((ignorePrefix? "" : debugPrefix) + p + (ignorePostfix? "" : debugPostfix));
	}

	/**
	 * If <code>debugPrinting</code> is true, it calls <code>printf(format, args)</code>
	 * <p> The prefix and postfix are not printed.
	 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html#printf-java.lang.String-java.lang.Object...-">PrintStream.printf(String, Object)</a>
	 * @param format the String to be printed.
	 * @param args arguments referenced by the format specifiers in the format string; 
	 */
	public static final void dprintf(String format, Object... args){ if(debugPrinting) P.printf(format,args); }
}
