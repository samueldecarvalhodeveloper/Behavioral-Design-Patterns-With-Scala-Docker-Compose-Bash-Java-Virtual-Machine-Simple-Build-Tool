package design_patterns.template_method

class ConcreteClassTwo extends AbstractClass {
  override protected def requiredOperationsOne(): Unit = {
    println("ConcreteClassTwo Says: Implemented Operation One")
  }

  override protected def requiredOperationTwo(): Unit = {
    println("ConcreteClassTwo Says: Implemented Operation Two")
  }

  override protected def hookOne(): Unit = {
    println("ConcreteClassTwo Says: Overridden Hook One")
  }
}
