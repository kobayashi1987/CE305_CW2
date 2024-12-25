# CE305_CW2

java -jar lib/antlr-4.13.2-complete.jar -visitor -package visitors -o src/visitors CQL.g4

javac -d bin -cp lib/antlr-4.13.2-complete.jar $(find src -name "*.java")

java -cp bin:lib/antlr-4.13.2-complete.jar interactive.CQLInteractive

