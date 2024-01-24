package de.pdbm.toolprovider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.spi.ToolProvider;
import java.util.stream.Collectors;

public class SearchForProvidedTools {

	public static void main(String[] args) throws IOException {
		String home = System.getProperty("java.home");
		Map<Boolean, List<Path>> progs = 
				Files.walk(Paths.get(home + "/bin")).filter(Files::isRegularFile)
					.map(Path::getFileName)
					.collect(Collectors.partitioningBy(name -> ToolProvider.findFirst(name.toString()).isPresent()));
		
		System.out.println("ToolProvider: " + progs.get(Boolean.TRUE));
		System.out.println("Nicht unterstützt: " + progs.get(Boolean.FALSE));
		
		progs.get(Boolean.TRUE).forEach(path -> printProvider(path.toString()));
	}

	
	private static void printProvider(String name) {
		ToolProvider provider = ToolProvider.findFirst(name).get();
		System.out.println(provider.getClass());
	}
}
