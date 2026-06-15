package design_patterns.observer

class ConcreteObserverB extends Observer {
  override def update(subject: Subject): Unit = {
    subject match {
      case concreteSubject: ConcreteSubject if concreteSubject.state == 0 || concreteSubject.state >= 2 =>
        println("ConcreteObserverB: Reacted To The Event")
      case _ =>
    }
  }
}
