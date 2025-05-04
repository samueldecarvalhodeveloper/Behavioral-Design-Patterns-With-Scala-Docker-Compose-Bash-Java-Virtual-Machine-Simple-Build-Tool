package design_patterns.interpreter

class TerminalExpression(private val data: String) extends Expression {
  override def interpret(context: String): Boolean = {
    context.contains(data)
  }
}
