/*
  An expression. In Scala 3.3 an if-else construct returns a value—the result of the expression.
  After the condition we specify the return value. No return statement is needed.
 */
class IfElseDemo {

  def firstExample(): Unit = {
    var number = 10
    // Test number if an if, else-if, else construct.
    if (number == 20)
      println(20)
    else if (number == 30)
      println(30)
    else
      println("Not 20 or 30")
  }

  def expressionResult(): Unit = {
    var animal = "bird"
    // Use an if-else expression.
    // ... This returns 20 or 10 based on the animal.
    val size = if (animal == "bird") 20 else 10
    println(size)
  }

  def ifVersusMatch(): Unit = {
    val x = 100
    // Use if-statement to set value of y1 based on x.
    val y1 = if (x == 100) 20 else 30

    // Use match to set value of y2 based on x.
    // ... Equivalent to above if-statement.
    val y2 = x match {
      case 100 => 20
      case _ => 30
    }
    println(y1)
    println(y2)
  }

  def ifInsideMatch(code: Int): Unit = code match {
    case c if c > 0 => println("Important, code is " + c)
    case c if c <= 0 => println("Not important, code is " + c)
  }

}
