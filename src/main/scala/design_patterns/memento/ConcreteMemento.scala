package design_patterns.memento

import java.time.LocalDateTime
import java.time.LocalDateTime.now
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatter.ofPattern

class ConcreteMemento(private val state: String) extends Memento {
  private val date: String = now.format(ofPattern("yyyy-MM-dd HH:mm:ss"))

  override def getState: String = state

  override def getName: String = s"$date / (${state.take(9)}...)"

  override def getDate: String = date
}
