package design_patterns.mediator

abstract class BaseComponent {
  protected var mediator: Mediator = _

  def setMediator(mediator: Mediator): Unit = {
    this.mediator = mediator
  }
}
