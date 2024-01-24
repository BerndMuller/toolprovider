package de.pdbm.toolprovider;

import java.util.Optional;
import java.util.spi.ToolProvider;

public class TrickyViaToolProvider {

	public static void main(String[] args) {
		Optional<ToolProvider> tricky = ToolProvider.findFirst("tricky");
		tricky.get().run(System.out, System.err, "--param", "42");
		
		//System.out.println(tricky.get().description().get());
	}

}
