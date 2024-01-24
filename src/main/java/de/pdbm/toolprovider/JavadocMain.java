package de.pdbm.toolprovider;

import java.util.Optional;
import java.util.spi.ToolProvider;

/**
 * Demo to run javadoc via ToolProvider.
 */
public class JavadocMain {

	/**
	 * Main method to run javadoc.
	 * 
	 * @param args OS parameters
	 */
	public static void main(String[] args) {
		Optional<ToolProvider> javadoc = ToolProvider.findFirst("javadoc");
		String cwd = System.getProperty("user.dir");
		String src = cwd + "/src/main/java";
		String apidoc = cwd + "/target/site/apidocs";
		
		javadoc.get().run(System.out, System.err, 
				"-d", apidoc, "-sourcepath", src, "de.pdbm.toolprovider");
		
		//javadoc.get().run(System.out, System.err, "--help");
	}

}
