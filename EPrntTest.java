
class EPrntTest extends EPrnt {
	public static void main(String[] args) {
		setDebugPrefix("Debug: ");
		if(args.length>0)
			setDebugPrinting((args[0].toLowerCase().equals("true"))? true : false);

		dprint("is debug? ");
		if(args.length>0){
			dprintln(true, (args[0].toLowerCase().equals("true"))? "true" : "false");
		}
		for(String s : args){
			P.println(s);
		}
	}
}