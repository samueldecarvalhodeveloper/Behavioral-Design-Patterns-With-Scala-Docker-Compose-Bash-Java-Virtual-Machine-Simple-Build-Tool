package design_patterns.observer

import scala.collection.mutable.ListBuffer

class ConcreteSubject extends Subject {
  var state: Int = 0

  private val observers: ListBuffer[Observer] = ListBuffer()

  override def attach(observer: Observer): Unit = {
    if (observers.contains(observer)) {
      println("Subject: Observer Has Been Attached Already")
    } else {
      observers += observer

      println("Subject: Attached An Observer")
    }
  }

  override def detach(observer: Observer): Unit = {
    if (!observers.contains(observer)) {
      println("Subject: Nonexistent Observer")
    } else {
      observers -= observer

      println("Subject: Detached An Observer")
    }
  }

  override def notifyObservers(): Unit = {
    println("Subject: Notifying Observers...")

    observers.foreach(_.update(this))
  }

  def someBusinessLogic(): Unit = {
    state = scala.util.Random.nextInt(11)

    println("\nSubject: I Am Doing Something Important")

    println(s"Subject: My State Has Just Changed To: $state")

    notifyObservers()
  }
}
