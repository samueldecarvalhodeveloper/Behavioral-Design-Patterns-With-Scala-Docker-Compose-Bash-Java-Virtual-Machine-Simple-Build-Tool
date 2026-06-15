package design_patterns.iterator

import scala.collection.mutable.ArrayBuffer

class WordsCollection extends Aggregator[String] {
  private val items = ArrayBuffer[String]()

  def getItems: Seq[String] = items.toSeq

  def getCount: Int = items.size

  def addItem(item: String): Unit = items += item
  
  def getIterator: Iterator[String] = new AlphabeticalOrderIterator(this)

  def getReverseIterator: Iterator[String] = new AlphabeticalOrderIterator(this, true)
}
