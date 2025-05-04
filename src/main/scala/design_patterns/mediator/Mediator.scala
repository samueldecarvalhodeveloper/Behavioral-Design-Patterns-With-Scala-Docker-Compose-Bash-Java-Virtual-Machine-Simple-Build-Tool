package design_patterns.mediator

trait Mediator {
  def notify(sender: Any, event: String): Unit
}
