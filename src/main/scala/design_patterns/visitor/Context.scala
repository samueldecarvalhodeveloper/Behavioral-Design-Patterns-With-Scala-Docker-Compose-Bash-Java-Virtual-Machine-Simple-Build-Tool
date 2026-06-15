package design_patterns.visitor

object Context {
  def execute(components: List[Component], visitor: Visitor): Unit = {
    components.foreach(_.accept(visitor))
  }
}
