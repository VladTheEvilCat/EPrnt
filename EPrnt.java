/**
 * Shortens 'System.out' to 'P': P.print(); P.println();
 */ 
public abstract class EPrnt {
	public static final java.io.PrintStream P = System.out;
	protected static boolean debugPrinting = false;
	public void setDebugPrinting(boolean canPrintDebugs){
		debugPrinting = canPrintDebugs;
	}

	public static final void dprint(boolean b){ if(debugPrinting) P.print(b); }
	public static final void dprint(char c){ if(debugPrinting) P.print(c); }
	public static final void dprint(char[] s){ if(debugPrinting) P.print(s); }
	public static final void dprint(double d){ if(debugPrinting) P.print(d); }
	public static final void dprint(float f){ if(debugPrinting) P.print(f); }
	public static final void dprint(int i){ if(debugPrinting) P.print(i); }
	public static final void dprint(long l){ if(debugPrinting) P.print(l); }
	public static final void dprint(Object o){ if(debugPrinting) P.print(o); }
	public static final void dprint(String s){ if(debugPrinting) P.print(s); }

	public static final void dprintln(boolean b){ if(debugPrinting) P.println(b); }
	public static final void dprintln(char c){ if(debugPrinting) P.println(c); }
	public static final void dprintln(char[] s){ if(debugPrinting) P.println(s); }
	public static final void dprintln(double d){ if(debugPrinting) P.println(d); }
	public static final void dprintln(float f){ if(debugPrinting) P.println(f); }
	public static final void dprintln(int i){ if(debugPrinting) P.println(i); }
	public static final void dprintln(long l){ if(debugPrinting) P.println(l); }
	public static final void dprintln(Object o){ if(debugPrinting) P.println(o); }
	public static final void dprintln(String s){ if(debugPrinting) P.println(s); }

	public static final void dprintf(String format, Object... args){ if(debugPrinting) P.printf(format,args); }
}
