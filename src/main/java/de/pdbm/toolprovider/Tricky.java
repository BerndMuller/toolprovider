package de.pdbm.toolprovider;

import java.io.PrintStream;

/**
 * This is the tricky tool.
 * <p>
 * Can be called via command line or via ToolProvider
 */
public class Tricky {

	
	public static void main(String[] args) {
		System.exit(execute(args, System.out, System.err));
	}

	
	public static int execute(String[] args, PrintStream out, PrintStream err) {
		if (args.length == 2 && args[0].equals("--param")) {
			out.println("called: tricky --param " + args[1]);
			return 0;
		} else {
			err.println("usage: tricky --param <param>");
			return 1;
		}
	}


}
