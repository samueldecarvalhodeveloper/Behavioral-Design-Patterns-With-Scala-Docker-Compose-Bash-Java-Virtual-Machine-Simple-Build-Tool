package design_patterns.memento

import scala.collection.mutable.Stack

class Caretaker(private val originator: Originator) {
  private val mementos: Stack[Memento] = Stack()

  def backup(): Unit = {
    println("\nCaretaker: Saving Originator's State...")

    mementos.push(originator.save())
  }

  def undo(): Unit = {
    if (mementos.isEmpty) {
      println("Caretaker: No Mementos To Restore.")

      return
    }

    val memento = mementos.pop()

    println(s"Caretaker: Restoring State To: ${memento.getName}")

    originator.restore(memento)
  }

  def showHistory(): Unit = {
    println("Caretaker: Here Is The List Of Mementos:")

    mementos.reverse.foreach(memento => println(memento.getName))
  }
}
