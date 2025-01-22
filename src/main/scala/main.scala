@main
def main(): Unit =
  println("----------------------------------------------------------------------------------")
  println("Hello world! This is an example to illustrate the Decision Making Statements in Scala")

  val ifExample = new IfExample()
  ifExample.ifStatement()

  val ifElseEx = new IfElseExample()
  ifElseEx.ifElseStatement()
  ifElseEx.expressionTest()

  val nestedIfElseEx = new NestedIfElseExample()
  nestedIfElseEx.nestedIfElse()

  val ifElseIfLadderEx = new IfElseIfLadder()
  ifElseIfLadderEx.ifElseIfLadderExample()

  val matchingEx = new PatternMatching()
  matchingEx.matching1Example()
  matchingEx.matching2Example()

  println("----------------------------------------------------------------------------------")
  println("First example:")
  val example = new IfElseDemo()
  example.firstExample()

  println("Expression result:")
  example.expressionResult()

  println("If versus match:")
  example.ifVersusMatch()

  println("If inside match:")
  example.ifInsideMatch(1)
  example.ifInsideMatch(-50)

