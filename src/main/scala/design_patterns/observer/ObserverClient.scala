package design_patterns.observer

object ObserverClient {
  def execute(): Unit = {
    val subject = new ConcreteSubject()
    val observer1 = new ConcreteObserverA()
    val observer2 = new ConcreteObserverB()

    subject.attach(observer1)

    subject.attach(observer2)

    subject.someBusinessLogic()
    subject.someBusinessLogic()

    subject.detach(observer2)

    subject.someBusinessLogic()
  }
}
