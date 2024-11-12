
# Instructions for Using the Custom Interpreter Notebook
This notebook contains a custom interpreter for a functional programming language that combines features from both modern and traditional programming languages. It’s built with a custom parser using ANTLR, and the backend lexer and analyzer are implemented in Kotlin.
Follow these instructions to use the interpreter effectively:

## 1. Setup and Compilation
If you make any changes to the backend code or grammar rules:

Run make clean: This removes old compiled files.
Run make all: This compiles the updated files in both the backend and grammar.
Restart the Jupyter Kernel: This clears any cached dependencies and loads the latest changes.

## 2. Running Code with the Interpreter
Open the Worksheet jupyter note book, In a cell define the Code: Create a string variable containing your code. 
For example:
```
val code = "your_code_here"
```
Execute the Code: Pass the string variable to the execute function:
```
execute(code)
```
The result will display in the notebook output, allowing you to see the interpreter's response to the code.

## 3. Improving Result Visibility
To view results more clearly, create a new cell for each new code execution. This keeps outputs separated, making it easier to compare and analyze different runs.
Summary
