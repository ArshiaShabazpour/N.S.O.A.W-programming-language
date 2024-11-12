### 1. **Basic Data Types**

- **None**: Represents a null or no-value state.
  ```plaintext
  x = None;
  ```

- **IntData, FloatData, DoubleData, and StringData**: Supports integer, float, double, and string types.
  ```plaintext
  x = 42;               // Integer
  y = 3.14f;            // Float
  z = 2.718;            // Double
  str = "Hello World";  // String
  ```

- **BooleanData**: Represents boolean values `true` and `false`.
  ```plaintext
  flag = true;
  ```

### 2. **Collections**

- **ArrayData**: Provides operations for creating arrays, accessing elements, updating values, and retrieving length.
  ```plaintext
  arr = [1, 2, 3, 4, 5];
  print(arr);               // Prints array
  print(arr[2]);            // Access third element (output: 3)
  arr[1] = 10;              // Update second element to 10
  print("Array length: " ++ len(arr));  // Output length (5)
  ```

- **SetData**: Includes functions to create sets, add elements, remove elements, and check for membership.
  ```plaintext
  mySet = {1, 2, 3};
  addSet(mySet, 4);         // Adds 4 to the set
  removeSet(mySet, 2);      // Removes 2 from the set
  print(inSet(mySet, 3));   // Check if 3 is in the set (output: true)
  ```

- **MapData**: Supports operations for creating maps, accessing values by key, updating values, and removing entries.
  ```plaintext
  myMap = {"a": 1, "b": 2};
  print(myMap<"a">);         // Access value by key (output: 1)
  myMap<"c"> = 3;            // Add or update a key-value pair
  mapRemove(myMap, "b");     // Remove an entry by key
  ```

### 3. **Arithmetic Operations**

- **Basic Arithmetic**: Supports `+`, `-`, `*`, and `/` for integers, floats, and doubles.
  ```plaintext
  x = 5 + 3;    // Addition
  y = 10 - 2;   // Subtraction
  z = 4 * 2;    // Multiplication
  w = 20 / 5;   // Division
  ```

- **String Multiplication**: Multiplies a string by an integer, repeating the string.
  ```plaintext
  strRepeat = "woof " * 3;   // Output: "woof woof woof "
  ```

### 4. **Comparison Operators**

- **Relational Operators**: Includes `<`, `<=`, `>`, `>=`, `==`, and `!=` for comparisons.
  ```plaintext
  x = 10 < 20;      // Less than (output: true)
  y = 15 <= 15;     // Less than or equal (output: true)
  z = 5 > 2;        // Greater than (output: true)
  isEqual = x == y; // Equality check (output: false)
  notEqual = x != y; // Inequality check (output: true)
  ```

### 5. **Control Flow**

- **If-Else Statement**: Supports conditional statements with `if-else` structure.
  ```plaintext
  if (x > 10) {
      print("Greater than 10");
  } else {
      print("10 or less");
  }
  ```

- **While Loop**: Implements a `while` loop for repeated execution based on a condition.
  ```plaintext
  i = 0;
  while (i < 5) {
      print(i);
      i += 1;
  }
  ```

- **Range-Based For Loop**: Loop iterates over a range.
  ```plaintext
  sum = 0;
  for (i in 1..5) {
      sum += i;
  }
  print(sum); // Output: 15
  ```

- **Traditional For Loop**: Standard `for` loop with initialization, condition, and increment expressions.
  ```plaintext
  sum = 0;
  for (i = 0; i < 5; i++) {
      sum += i;
  }
  print(sum); // Output: 10
  ```

### 6. **Variables and Assignment**

- **Basic Assignment**: Assigns a value to a variable.
  ```plaintext
  x = 10;
  y = x + 5;
  ```

- **Infix Increment and Decrement**: `++` and `--` operations for incrementing and decrementing.
  ```plaintext
  count = 5;
  count++;  // Increments count to 6
  count--;  // Decrements count back to 5
  ```

### 7. **Function Declarations and Invocations**

- **Declare and Call Functions**: Allows function definitions and calling with arguments.
  ```plaintext
  function greet(name, times) {
      msg = "Hello, " ++ name;
      for (i = 1; i <= times; i++) {
          print(msg);
      }
  }
  greet("Alice", 3);  // Outputs "Hello, Alice" three times
  ```

- **Recursive Function Calls**: Enables functions to call themselves.
  ```plaintext
  function factorial(n) {
      if (n < 2) {
          1;
      } else {
          n * factorial(n - 1);
      }
  }
  print(factorial(5));  // Output: 120
  ```

### 8. **String Concatenation**

- **Concatenation Operator**: `++` operator to combine strings.
  ```plaintext
  fullName = "First" ++ " " ++ "Last";
  ```

### 9. **Array and Map Manipulation**

- **Array Operations**: Array creation, access, updating, and length checking.
  ```plaintext
  arr = [1, 2, 3, 4];
  print(len(arr));     // Output: 4
  arr[0] = 5;          // Updates first element to 5
  ```

- **Map Manipulation**: Access and update key-value pairs, remove entries, and retrieve values.
  ```plaintext
  myMap = {"a": 1, "b": 2};
  myMap<"c"> = 3;        // Adds key "c"
  mapRemove(myMap, "a"); // Removes key "a"
  ```

### 10. **Ternary Operator**

- **Inline Conditional Evaluation**: Evaluates expressions based on conditions.
  ```plaintext
  result = (5 > 3) ? "Yes" : "No"; // Outputs: "Yes"
  ```

### 11. **Complex Expressions and Implicit Type Conversions**

- **Automatic String Conversion in Expressions**: Automatically converts data to a string when combined with a string.
  ```plaintext
  result = "Result is: " ++ 5;   // Output: "Result is: 5"
  ```
