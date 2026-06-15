package design_patterns.visitor

trait Component {
  def accept(visitor: Visitor): Unit
}
