package design_patterns.interpreter

class AndExpression(private val expressionOne: Expression, private val expressionTwo: Expression) extends Expression {
  override def interpret(context: String): Boolean = expressionOne.interpret(context) && expressionTwo.interpret(context)
}
