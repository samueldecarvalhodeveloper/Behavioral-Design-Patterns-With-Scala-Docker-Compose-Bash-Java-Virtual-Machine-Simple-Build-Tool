package design_patterns.iterator

object IteratorClient {
  def execute(): Unit = {
    val collection = new WordsCollection()

    collection.addItem("First")
    collection.addItem("Second")
    collection.addItem("Third")
    
    val iterator = collection.getIterator
    val reverseIterator = collection.getReverseIterator

    println("Straight Traversal:")

    while (iterator.valid()) println(iterator.next())

    println("\nReverse Traversal:")

    while (reverseIterator.valid()) println(reverseIterator.next())
  }
}
