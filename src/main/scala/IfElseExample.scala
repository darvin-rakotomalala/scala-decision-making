/* Scala program to illustrate the if-else statement */
class IfElseExample {

  def ifElseStatement(): Unit = {
    var a: Int = 650
    if (a > 698) {
      println("- This is a true condition")
    }
    else {
      println("- This a false condition")
    }
  }

  def expressionTest(): Unit = {
    // Conditional expression (if-else)
    // val result = if (condition) value1 else value2
    var x = 5
    val result = if x > 0 then "Positive" else "Negative"
    println("- Conditional expression (if-else): " + result)
  }

}
