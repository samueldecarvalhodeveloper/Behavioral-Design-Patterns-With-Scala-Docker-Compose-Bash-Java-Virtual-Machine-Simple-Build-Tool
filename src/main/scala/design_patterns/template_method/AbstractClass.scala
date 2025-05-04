package design_patterns.template_method

abstract class AbstractClass {
  def templateMethod(): Unit = {
    baseOperationOne()
    requiredOperationsOne()
    baseOperationTwo()
    hookOne()
    requiredOperationTwo()
    baseOperationThree()
    hookTwo()
  }

  private def baseOperationOne(): Unit = {
    println("AbstractClass Says: I Am Doing The Bulk Of The Work")
  }

  private def baseOperationTwo(): Unit = {
    println("AbstractClass Says: But I Let Subclasses Override Some Operations")
  }

  private def baseOperationThree(): Unit = {
    println("AbstractClass Says: But I Am Doing The Bulk Of The Work Anyway")
  }

  protected def requiredOperationsOne(): Unit
  
  protected def requiredOperationTwo(): Unit

  protected def hookOne(): Unit = {}
  
  private def hookTwo(): Unit = {}
}
