package design_patterns.observer

class ConcreteObserverA extends Observer {
  override def update(subject: Subject): Unit = {
    subject match {
      case concreteSubject: ConcreteSubject if concreteSubject.state < 3 =>
        println("ConcreteObserverA: Reacted To The Event")
      case _ =>
    }
  }
}
