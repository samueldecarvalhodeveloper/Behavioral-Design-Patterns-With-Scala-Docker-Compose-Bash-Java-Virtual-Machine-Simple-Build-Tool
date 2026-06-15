import design_patterns.chain_of_responsibility.ChainOfResponsibilityClient
import design_patterns.command.CommandClient
import design_patterns.interpreter.InterpreterClient
import design_patterns.iterator.IteratorClient
import design_patterns.mediator.MediatorClient
import design_patterns.memento.MementoClient
import design_patterns.observer.ObserverClient
import design_patterns.state.StateClient
import design_patterns.strategy.StrategyClient
import design_patterns.template_method.TemplateMethodClient
import design_patterns.visitor.VisitorClient

object Main {
  def main(args: Array[String]): Unit = {
    println("Visitor:")
    println()

    VisitorClient.execute()

    println()

    println("Template Method:")
    println()

    TemplateMethodClient.execute()

    println()

    println("Strategy:")
    println()

    StrategyClient.execute()

    println()

    println("State:")
    println()

    StateClient.execute()

    println()

    println("Observer:")
    println()

    ObserverClient.execute()

    println()

    println("Memento:")
    println()

    MementoClient.execute()

    println()

    println("Mediator:")
    println()

    MediatorClient.execute()

    println()

    println("Iterator:")
    println()

    IteratorClient.execute()

    println()

    println("Chain Of Responsibility:")
    println()

    ChainOfResponsibilityClient.execute()

    println()

    println("Command:")
    println()

    CommandClient.execute()

    println()

    println("Interpreter:")
    println()

    InterpreterClient.execute()
  }
}
