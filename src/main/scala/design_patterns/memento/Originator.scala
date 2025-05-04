package design_patterns.memento

import scala.util.Random.nextInt

class Originator(var state: String) {
  println(s"Originator: My Initial State Is: $state")

  def doSomething(): Unit = {
    state = generateRandomString(30)

    println("Originator: I Am Doing Something Important.")

    println(s"Originator: And My State Has Changed To: $state")
  }

  private def generateRandomString(length: Int): String = {
    val characterSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"

    (1 to length).map(_ => characterSet(nextInt(characterSet.length))).mkString
  }

  def save(): Memento = new ConcreteMemento(state)

  def restore(memento: Memento): Unit = {
    state = memento.getState

    println(s"Originator: My State Has Changed To: $state")
  }
}
