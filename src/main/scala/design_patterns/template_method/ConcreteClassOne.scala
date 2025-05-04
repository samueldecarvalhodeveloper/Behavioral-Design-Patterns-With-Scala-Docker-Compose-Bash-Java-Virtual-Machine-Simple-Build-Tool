package design_patterns.template_method

class ConcreteClassOne extends AbstractClass {
  override protected def requiredOperationsOne(): Unit = {
    println("ConcreteClassOne Says: Implemented Operation One")
  }

  override protected def requiredOperationTwo(): Unit = {
    println("ConcreteClassOne Says: Implemented Operation Two")
  }
}
