package design_patterns.visitor

class ConcreteComponentA extends Component {
  override def accept(visitor: Visitor): Unit = {
    visitor.visitConcreteComponentA(this)
  }

  def exclusiveMethodOfConcreteComponentA(): String = "A"
}
