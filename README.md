# 🛠️ Custom Interpreter Notebook

This notebook features a custom interpreter for a functional programming language inspired by both modern and traditional programming languages. The interpreter includes a custom parser created with ANTLR, with a backend lexer and analyzer implemented in Kotlin. Follow these steps to set up and use the interpreter effectively.

## 📑 Table of Contents
- [⚙️ Setup and Compilation](#-setup-and-compilation)
- [▶️ Running Code with the Interpreter](#-running-code-with-the-interpreter)
- [👀 Improving Result Visibility](#-improving-result-visibility)
- [📜 Syntax Guide](#-syntax-guide)
- [🔗 Summary](#-summary)

## ⚙️ Setup and Compilation

If you make any changes to the backend code or grammar rules, follow these steps to recompile:

1. **Clean Old Files**: Run `make clean` to remove old compiled files.
2. **Compile Updated Files**: Run `make all` to compile the updated backend and grammar files.
3. **Restart the Jupyter Kernel**: Clear any cached dependencies and load the latest changes by restarting the Jupyter kernel.

## ▶️ Running Code with the Interpreter

To start using the interpreter:

1. **Download the Required Files**: Ensure all necessary files are downloaded and in the correct directories.
   > **Note**: Do not change dependencies or the `makefile` functionality may break.
   
2. **Open the Jupyter Notebook**: Use the provided worksheet notebook.

3. **Define the Code**: In a notebook cell, define a string variable with your code, like this:
   ```kotlin
   val code = "your_code_here"
   ```

4. **Execute the Code**: Pass the string variable to the `execute` function:
   ```kotlin
   execute(code)
   ```
   The output will display in the notebook, showing the interpreter's response to the code.

## 👀 Improving Result Visibility

To make results clearer and easier to analyze:

- **Separate Outputs**: Create a new cell for each code execution. This keeps outputs separate, allowing you to easily compare and analyze different runs.

## 📜 Syntax Guide

For detailed information on language syntax, refer to the [Syntax Guide](./Syntax.md).

## 🔗 Summary

This notebook provides a straightforward interface to experiment with a functional programming language interpreter. By following these instructions, you can set up the interpreter, run custom code, and improve output readability for enhanced analysis.
