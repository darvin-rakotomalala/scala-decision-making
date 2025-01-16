@main
def main(): Unit =
  println("----------------------------------------------------------------------------------")
  println("Hello world! This is an example to illustrate the Decision Making Statements in Scala")

  val ifExample = new IfExample()
  ifExample.ifStatement()

  val ifElseEx = new IfElseExample()
  ifElseEx.ifElseStatement()

  val nestedIfElseEx = new NestedIfElseExample()
  nestedIfElseEx.nestedIfElse()

  val ifElseIfLadderEx = new IfElseIfLadder()
  ifElseIfLadderEx.ifElseIfLadderExample()

  val matchingEx = new PatternMatching()
  matchingEx.matching1Example()
  matchingEx.matching2Example()
