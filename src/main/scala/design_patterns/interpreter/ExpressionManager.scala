package design_patterns.interpreter

object ExpressionManager {
  def getMaleExpression: Expression = {
    val john = new TerminalExpression("John")
    val doe = new TerminalExpression("Doe")
    
    new OrExpression(john, doe)
  }

  def getMarriedWomanExpression: Expression = {
    val julie = new TerminalExpression("Julie")
    val married = new TerminalExpression("Married")
    
    new AndExpression(julie, married)
  }
}
