# Beispiele zu meinem Artikel ToolProvider in Java aktuell 03/2024

## Finden aller ToolProvider

```
mvn clean compile exec:java -Dexec.mainClass=de.pdbm.toolprovider.SearchForProvidedTools
```


## Aufruf von Javadoc über ToolProvider

```
mvn clean compile exec:java -Dexec.mainClass=de.pdbm.toolprovider.JavadocMain
```

## Eigener ToolProvider

Das Projekt enthält ein Kommandozeilenwerkzeug, das z.B. so verwendet werden kann,
nachdem das Projekt gebaut wurde (``mvn compile``)

```
./tricky --param 42
```

Um dieselbe implementierende Klasse über den ToolProvider aufzurufen, verwendet man
im ``target/classes``-Verzeichnis

```
java de.pdbm.toolprovider.TrickyViaToolProvider
```
