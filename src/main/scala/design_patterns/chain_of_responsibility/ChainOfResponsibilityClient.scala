package design_patterns.chain_of_responsibility

object ChainOfResponsibilityClient {
  def execute(): Unit = {
    val monkey = new MonkeyHandler
    val squirrel = new SquirrelHandler
    val dog = new DogHandler

    monkey.setNext(squirrel).setNext(dog)

    println("Chain: Monkey > Squirrel > Dog\n")

    Context.execute(monkey)

    println()

    println("Subchain: Squirrel > Dog\n")
    
    Context.execute(squirrel)
  }
}

