package design_patterns.visitor

object VisitorClient {
  def execute(): Unit = {
    val components: List[Component] = List(new ConcreteComponentA(), new ConcreteComponentB())

    println("The Client Code Works With All Visitors Via The Base Visitor Interface:")

    val visitorOne = new ConcreteVisitorOne()

    Context.execute(components, visitorOne)

    println()

    println("It Allows The Same Client Code To Work With Different Types Of Visitors:")

    val visitorTwo = new ConcreteVisitorTwo()

    Context.execute(components, visitorTwo)
  }
}
