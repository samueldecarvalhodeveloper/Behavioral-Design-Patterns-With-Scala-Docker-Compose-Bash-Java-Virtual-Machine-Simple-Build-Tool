package design_patterns.template_method

object TemplateMethodClient {
  def execute(): Unit = {
    println("Same Client Code Can Work With Different Subclasses:")
    
    Context.execute(new ConcreteClassOne())
    
    println()

    println("Same Client Code Can Work With Different Subclasses:")
    
    Context.execute(new ConcreteClassTwo())
  }
}
