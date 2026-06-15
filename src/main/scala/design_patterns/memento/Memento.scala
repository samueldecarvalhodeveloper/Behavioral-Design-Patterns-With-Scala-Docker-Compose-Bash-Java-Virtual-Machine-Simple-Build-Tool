package design_patterns.memento

trait Memento {
  def getState: String
  def getName: String
  def getDate: String
}
