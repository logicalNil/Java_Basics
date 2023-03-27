
##  Features of Java

    1. Java is a platform independent language.
    2. Java is a simple language.
    3. Java is an object oriented language.
    4. Java is a secure language.
    5. Java is a robust language.
    6. Java is a multithreaded language.
    7. Java is a distributed language.
    8. Java is a dynamic language.
    9. Java is a interpreted language.
    10. Java is a high performance language.
    11. Java is a architecture neutral language.
    12. Java is a portable language.

## Data Types in Java

 #### 1. Primitive Data Types
    1.1. Boolean
    1.2. Byte
    1.3. Short
    1.4. Int
    1.5. Long
    1.6. Float
    1.7. Double
    1.8. Char

 #### 2. Non-Primitive Data Types
    2.1. String
    2.2. Arrays
    2.3. Classes
    2.4. Interfaces
    2.5. Enums
    2.6. Annotations
    2.7. Packages
    2.8. Modules
    2.9. Records
    2.10. Sealed Classes


## Constants in Java


   #### 1. Final Variables
    1.1. Final Variables are variables whose values cannot be changed once they are initialized.
    1.2. Final Variables are declared using the final keyword.
    1.3. Final Variables are also known as constants.
    1.4. Final Variables are initialized only once.
    1.5. Final Variables are initialized either at the time of declaration or inside the constructor.

   #### 2. Final Methods
    2.1. Final Methods are methods that cannot be overridden by subclasses.
    2.2. Final Methods are declared using the final keyword.
    2.3. Final Methods are used to prevent the method from being overridden.
    2.4. Final Methods are used to make the method more secure.

   #### 3. Final Classes
    3.1. Final Classes are classes that cannot be inherited by other classes.
    3.2. Final Classes are declared using the final keyword.
    3.3. Final Classes are used to prevent the class from being inherited.

   #### 4. Final Variables vs Final Methods vs Final Classes
    4.1. Final Variables are variables whose values cannot be changed once they are initialized.
    4.2. Final Methods are methods that cannot be overridden by subclasses.
    4.3. Final Classes are classes that cannot be inherited by other classes.
    4.4. Final Variables are declared using the final keyword.


## Variables in Java

   #### 1. Local Variables
        1.1. Local Variables are variables that are declared inside a method.
        1.2. Local Variables are created when the method is called, and the variable will be destroyed when the method has completed.
        1.3. Access modifiers cannot be used for local variables.
        1.4. Local Variables are visible only within the declared method, constructor, or block.
        1.5. Local Variables are implemented at stack level internally.

   #### 2. Instance Variables
        2.1. Instance Variables are variables that are declared inside a class, but outside a method, constructor or a block.
        2.2. When a space is allocated for an object in the heap, a slot for each instance variable value is created.
        2.3. Instance Variables are created when an object is created with the use of the keyword new, and they
        will be destroyed when the object is destroyed.
        2.4. Instance Variables hold values that must be referenced by more than one method, constructor or block, 
        or essential parts of an object's state that must be present throughout the class.
        2.5. Access modifiers can be used for instance variables.
        2.6. Instance Variables are visible for all methods, constructors and block in the class.
        2.7. Instance Variables have default values. For numbers, the default value is 0; 
        for Booleans, the default value is false; for Objects, the default value is null. 
        Values can be assigned during the declaration or within the constructor.
        2.8. Instance Variables are implemented at heap level internally.

   #### 3. Static Variables
        3.1. Static Variables are variables that are declared as static.
        3.2. Static Variables are also known as Class Variables.
        3.3. No matter how many objects are created, there is only one copy of a static variable.
        3.4. Static Variables are created when the program starts and destroyed when the program stops.
        3.5. Static Variables are declared in a class, outside a method, constructor or a block.
        3.6. Static Variables cannot be local.
        3.7. Static Variables can be accessed by calling with the class name: ClassName.VariableName.
        3.8. Static Variables can be accessed directly inside static methods.


## Operators in java

  #### 1. Arithmetic Operators
    1.1. + (Addition)
    1.2. - (Subtraction)
    1.3. * (Multiplication)
    1.4. / (Division)
    1.5. % (Modulus)
    1.6. ++ (Increment)
    1.7. -- (Decrement)

   #### 2. Relational Operators
    2.1. == (Equal to)
    2.2. != (Not equal to)
    2.3. > (Greater than)
    2.4. < (Less than)
    2.5. >= (Greater than or equal to)
    2.6. <= (Less than or equal to)

   #### 3. Logical Operators
    3.1. && (Logical AND)
    3.2. || (Logical OR)
    3.3. ! (Logical NOT)

   #### 4. Bitwise Operators
    4.1. & (Bitwise AND)
    4.2. | (Bitwise OR)
    4.3. ^ (Bitwise XOR)
    4.4. ~ (Bitwise Complement)
    4.5. << (Left Shift)
    4.6. >> (Right Shift)
    4.7. >>> (Zero Fill Right Shift)

   #### 5. Assignment Operators
    5.1. = (Simple Assignment)
    5.2. += (Add and Assignment)
    5.3. -= (Subtract and Assignment)
    5.4. *= (Multiply and Assignment)
    5.5. /= (Divide and Assignment)
    5.6. %= (Modulus and Assignment)
    5.7. &= (Bitwise AND and Assignment)
    5.8. |= (Bitwise OR and Assignment)
    5.9. ^= (Bitwise XOR and Assignment)
    5.10. <<= (Left Shift and Assignment)
    5.11. >>= (Right Shift and Assignment)
    5.12. >>>= (Zero Fill Right Shift and Assignment)

   #### 6. Misc Operators
    6.1. ?: (Ternary Operator)
    6.2. instanceof (Instanceof Operator)

   #### 7. Operator Precedence
    7.1. Precedence determines the grouping of terms in an expression and decides how an expression is evaluated.
    7.2. Certain operators have higher precedence than others; for example, the multiplication 
    operator has higher precedence than the addition operator.
    7.3. Precedence is used to determine how an expression is evaluated.
    7.4. Precedence is also known as the order of operations.
    7.5. Precedence is used to resolve ambiguity that may otherwise arise from the order in which operators are specified.
    7.6. Precedence is used to evaluate expressions containing more than one operator.

