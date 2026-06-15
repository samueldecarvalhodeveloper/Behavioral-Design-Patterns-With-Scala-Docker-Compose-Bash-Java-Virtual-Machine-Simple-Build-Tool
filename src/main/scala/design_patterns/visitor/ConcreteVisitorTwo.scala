package design_patterns.visitor

class ConcreteVisitorTwo extends Visitor {
  override def visitConcreteComponentA(element: ConcreteComponentA): Unit = {
    println(s"${element.exclusiveMethodOfConcreteComponentA()} + ConcreteVisitorTwo")
  }

  override def visitConcreteComponentB(element: ConcreteComponentB): Unit = {
    println(s"${element.specialMethodOfConcreteComponentB()} + ConcreteVisitorTwo")
  }
}
