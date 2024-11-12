KOTLIN_HOME = backend/kotlinc
ANTLR_JAR = target/grammar/antlr-4.13.2-complete.jar
KOTLIN_COMPILER = $(KOTLIN_HOME)/lib/kotlin-compiler.jar
ANTLR_RUNTIME_JAR = target/grammar/antlr-runtime-4.13.2.jar

KOTLIN_SRC = \
    backend/data.kt \
    backend/expr.kt \
    backend/runtime.kt

ANTLR_SRC = target/grammar/PL.g4
GRAMMAR_CLASSES = target/grammar/PLLexer.class target/grammar/PLParser.class target/grammar/PLListener.class

KOTLIN_OUTPUT = target/class
GRAMMAR_OUTPUT = target/grammar

$(KOTLIN_OUTPUT):
	@if not exist "$(KOTLIN_OUTPUT)" mkdir "$(KOTLIN_OUTPUT)"

compile_kotlin: $(KOTLIN_OUTPUT)
	java -jar $(KOTLIN_COMPILER) -kotlin-home "$(KOTLIN_HOME)" -d $(KOTLIN_OUTPUT) $(KOTLIN_SRC)

$(GRAMMAR_CLASSES): $(ANTLR_SRC)
	@if not exist "$(GRAMMAR_OUTPUT)" mkdir "$(GRAMMAR_OUTPUT)"
	java -jar $(ANTLR_JAR) -Dlanguage=Java -o $(GRAMMAR_OUTPUT) $(ANTLR_SRC)
	javac -cp "$(ANTLR_JAR);$(KOTLIN_OUTPUT)" -d $(GRAMMAR_OUTPUT) $(GRAMMAR_OUTPUT)/PLLexer.java $(GRAMMAR_OUTPUT)/PLParser.java $(GRAMMAR_OUTPUT)/PLListener.java

.PHONY: all clean

all: compile_kotlin $(GRAMMAR_CLASSES)

clean:
	-rm -rf $(KOTLIN_OUTPUT) $(GRAMMAR_OUTPUT)
