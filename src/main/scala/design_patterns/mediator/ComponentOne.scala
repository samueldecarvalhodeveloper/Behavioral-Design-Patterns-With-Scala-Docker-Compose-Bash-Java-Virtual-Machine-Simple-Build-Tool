package design_patterns.mediator

class ComponentOne extends BaseComponent {
  def doA(): Unit = {
    println("Component One Does A")

    mediator.notify(this, "A")
  }

  def doB(): Unit = {
    println("Component One Does B")

    mediator.notify(this, "B")
  }
}
