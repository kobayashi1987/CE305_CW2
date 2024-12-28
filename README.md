# CE305_CW2

To create the parser and visitor classes, run the following command in the root directory of the project:
```bash
java -jar lib/antlr-4.13.2-complete.jar -visitor -package visitors -o src/visitors CQL.g4
```

To compile the project, run the following command in the root directory of the project:
```bash
javac -d bin -cp lib/antlr-4.13.2-complete.jar $(find src -name "*.java")

java -cp bin:lib/antlr-4.13.2-complete.jar interactive.CQLInteractive
```




