## Scala | Decision Making (if, if-else, Nested if-else, if-else if, pattern matching)

Decision Making in programming is similar to decision making in real life. Scala uses control statements to control the
flow of execution of the program based on certain conditions. These are used to cause the flow of execution to advance
and branch based on changes to the state of a program.

**Decision Making Statements in Scala** :

- **If**
- **If – else**
- **Nested – If**
- **if – elsif ladder**
- **Pattern Matching** : It is a technique for checking a value against a pattern. It is similar to the switch statement
  of Java and C.

**Important Points of Pattern Matching** :

- Each match keyword must have at least one case clause.
- The last **"_"**, is a **"catch-all"** case, will be executed if none of the cases matches. Cases are also called
  alternatives.
- Pattern matching does not have any break statement.
- Pattern matching always returns some value.
- Match blocks are expressions, not statements. This means that they evaluate the body of whichever case matches. This
  is a very important feature of functional programming.
- Pattern matching can also be used for value assignment and for comprehension, not only in match block.
- Pattern matching allows matching any sort of data with the first match policy.
- Each case statement returns a value, and the whole match statement is virtually a function that returns a matched
  value.
- Multiple values can be tested in a single line by using **"|"**.

### Technologies

- Java 17
- Sbt 1.10.17
- Scala 3.3.4
