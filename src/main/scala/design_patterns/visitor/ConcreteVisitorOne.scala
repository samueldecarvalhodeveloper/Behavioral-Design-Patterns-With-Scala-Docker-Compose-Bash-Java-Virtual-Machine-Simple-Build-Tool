package design_patterns.visitor

class ConcreteVisitorOne extends Visitor {
  override def visitConcreteComponentA(element: ConcreteComponentA): Unit = {
    println(s"${element.exclusiveMethodOfConcreteComponentA()} + ConcreteVisitorOne")
  }

  override def visitConcreteComponentB(element: ConcreteComponentB): Unit = {
    println(s"${element.specialMethodOfConcreteComponentB()} + ConcreteVisitorOne")
  }
}
