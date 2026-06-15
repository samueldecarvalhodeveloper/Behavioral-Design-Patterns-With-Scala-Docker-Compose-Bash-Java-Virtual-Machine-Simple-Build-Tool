package design_patterns.iterator

class AlphabeticalOrderIterator(collection: WordsCollection, reverse: Boolean = false) extends Iterator[String] {
  private var position: Int = if (reverse) collection.getCount - 1 else 0

  def rewind(): Unit = {
    position = if (reverse) collection.getCount - 1 else 0
  }

  def current(): String = collection.getItems(position)

  def key(): Int = position

  def next(): String = {
    val item = collection.getItems(position)
    position += (if (reverse) -1 else 1)
    item
  }

  def valid(): Boolean = {
    if (reverse) position >= 0
    else position < collection.getCount
  }
}
