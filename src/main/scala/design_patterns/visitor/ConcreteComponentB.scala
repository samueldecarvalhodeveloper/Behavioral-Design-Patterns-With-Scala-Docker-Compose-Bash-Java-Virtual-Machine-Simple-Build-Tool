package design_patterns.visitor

class ConcreteComponentB extends Component {
  override def accept(visitor: Visitor): Unit = {
    visitor.visitConcreteComponentB(this)
  }

  def specialMethodOfConcreteComponentB(): String = "B"
}
