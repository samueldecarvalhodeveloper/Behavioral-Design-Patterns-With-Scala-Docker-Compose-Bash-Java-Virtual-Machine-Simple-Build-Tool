package design_patterns.memento

object MementoClient {
  def execute(): Unit = {
    val originator = new Originator("Super-duper-super-puper-super.")
    val caretaker = new Caretaker(originator)

    caretaker.backup()
    originator.doSomething()

    caretaker.backup()
    originator.doSomething()

    caretaker.backup()
    originator.doSomething()

    println("")

    caretaker.showHistory()

    println("\nClient: Now, Let's Rollback!\n")

    caretaker.undo()

    println("\nClient: Once More!\n")
    
    caretaker.undo()
  }
}

