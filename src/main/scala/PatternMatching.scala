/* Scala program to illustrate the pattern matching */
class PatternMatching {

  def matching1Example(): Unit = {
    // calling test method
    println(testIntMatching(1));
  }

  // method containing match keyword
  private def testIntMatching(x: Int): String = x match {

    // if value of x is 0,
    // this case will be executed
    case 0 => "- Hello, Dev!!"

    // if value of x is 1,
    // this case will be executed
    case 1 => "- Are you learning Scala?"

    // if x doesn't match any sequence,
    // then this case will be executed
    case _ => "- Good Luck!!"
  }

  def matching2Example(): Unit = {
    println(testStringMatching("Test"))
  }

  // method containing match keyword
  private def testStringMatching(x: String): String = x match {

    // if value of x is "G1",
    // this case will be executed
    case "G1" => "- First case test"

    // if value of x is "G2",
    // this case will be executed
    case "G2" => "- Scala Tutorials"

    // if x doesn't match any sequence,
    // then this case will be executed
    case _ => "- Default Case Executed"
  }

}
