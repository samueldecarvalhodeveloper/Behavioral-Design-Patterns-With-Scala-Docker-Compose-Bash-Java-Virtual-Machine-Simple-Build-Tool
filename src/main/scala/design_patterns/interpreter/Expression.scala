package design_patterns.interpreter

trait Expression {
  def interpret(context: String): Boolean
}
