package de.pdbm.toolprovider;

import java.io.PrintWriter;
import java.util.Optional;
import java.util.spi.ToolProvider;

public class TrickyToolProvider implements ToolProvider {

	@Override
	public String name() {
		return "tricky";
	}
	
	
	@Override
    public Optional<String> description() {
        return Optional.of("Runs the very tricky Tool");
    }
    
    
	@Override
	public int run(PrintWriter out, PrintWriter err, String... args) {
		return Tricky.execute(args, System.out, System.err);
	}

}
