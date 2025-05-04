package design_patterns.visitor

trait Visitor {
  def visitConcreteComponentA(element: ConcreteComponentA): Unit

  def visitConcreteComponentB(element: ConcreteComponentB): Unit
}
