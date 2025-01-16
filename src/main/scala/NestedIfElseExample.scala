/* Scala program to illustrate the nested if-else statement */
class NestedIfElseExample {

  def nestedIfElse(): Unit = {
    var a: Int = 70
    var b: Int = 40
    var c: Int = 100

    // condition_1
    if (a > b) {
      // condition_2
      if (a > c) {
        println("- a is largest");
      }
      else {
        println("- c is largest")
      }
    }
    else {
      // condition_3
      if (b > c) {
        println("- b is largest")
      }
      else {
        println("- c is largest")
      }
    }
  }

}
