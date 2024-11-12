
### 1. **String Multiplication**
   - Multiplying a string by an integer repeats the string.
   ```plaintext
   strRepeat = "ha" * 3;  // Outputs: "hahaha"
   ```

### 2. **Implicit Type Conversion in Expressions**
   - When an integer or float is added to a string, it is automatically converted into a string.
   ```plaintext
   result = "Value is: " ++ 42;   // Outputs: "Value is: 42"
   ```

### 3. **Ternary Operator**
   - Implements a ternary conditional operator, enabling inline conditional expressions.
   ```plaintext
   x = 5 > 3 ? true : false;  // Outputs: true
   ```

### 4. **Array Length and Bounds Checking**
   - Includes built-in functions to get the length of an array and ensures array bounds are checked during access and updates.
   ```plaintext
   arr = [1, 2, 3, 4, 5];
   print("Length: " ++ len(arr));  // Outputs: Length: 5
   arr[2] = 10;                    // Updates the third element
   ```

### 5. **Traditional For Loop with Multiple Expressions**
   - Supports traditional `for` loops with initialization, condition, and post-execution expressions.
   ```plaintext
   sum = 0;
   for (i = 0; i < 10; i++) {
       sum += i;
   }
   ```

### 6. **Function Definitions with Multiple Data Types**
   - Function definitions and calls with parameters of different data types, allowing flexible arithmetic and string operations.
   ```plaintext
   function greet(name, count) {
       message = "Hello, " ++ name ++ "!";
       for (i = 1; i <= count; i++) {
           print(message);
       }
   }

   greet("Alice", 3);  // Outputs: Hello, Alice! (three times)
   ```

### 7. **Recursion**
   - Functions support recursion, allowing them to call themselves.
   ```plaintext
   function factorial(n) {
       if (n < 2) {
           1;
       } else {
           n * factorial(n - 1);
       }
   }

   print(factorial(5));  // Outputs: 120
   ```

### 8. **Concatenation Operator (++) for String Operations**
   - Using `++` for string concatenation provides an intuitive way to join strings.
   ```plaintext
   greeting = "Hello" ++ " World";   // Outputs: "Hello World"
   ```

### 9. **Array, Set, and Map Operations**
   - Extended support for array, set, and map operations such as insertion, deletion, containment checks, and accessing or updating values.

   - **Array Example**
     ```plaintext
     arr = [1, 2, 3];
     print(arr[1]);        // Outputs: 2
     arr[1] = 10;          // Updates the second element to 10
     ```

   - **Set Example**
     ```plaintext
     mySet = {1, 2, 3};
     addSet(mySet, 4);     // Adds 4 to the set
     print(inSet(mySet, 2));  // Outputs: true
     ```

   - **Map Example**
     ```plaintext
     myMap = {"a": 1, "b": 2};
     print(myMap<"a">);       // Outputs: 1
     myMap<"c"> = 3;          // Adds key "c" with value 3
     mapRemove(myMap, "b");   // Removes key "b"
     ```

### 10. **Logical Operations in Comparison and Control Structures**
   - Allows various logical and comparison operations within `if` conditions, loops, and expressions.
   ```plaintext
   x = 2 < 3 ? "Yes" : "No";   // Outputs: "Yes"
   if (x == "Yes") {
       print("x is less than 3");
   }
   ```

### 11. **Infix Increment (++) and Decrement (--) Operators**
   - Allows using `++` and `--` with variables, supporting both prefix and postfix notation.
   ```plaintext
   count = 5;
   count++;  // Increments count by 1
   count--;  // Decrements count by 1
   ```







