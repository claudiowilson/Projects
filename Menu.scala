import java.io.File
import Classes._

object Program {
       //val files = GetValidDirectories(new File(".").listFiles).zipWithIndex

       def main(args: Array[String]) {
       	   println("\nWelcome to my Scala Projects Menu!\n")
       	   println("Choose a test to run.")
       	   println("1. Classes: ")
       	   val choice = Console.readInt()
       	   
       	   choice match {
       	     case 1 => RunClassTests()
       	     case _ => println("No such test")
       	   }
       }

       def GetValidDirectories(files: Array[File]):Array[File] = {
       	   files.filter(f => f.isDirectory() && !f.getName().contains('.'))
       }
       
       def RunClassTests() {
          val test = new Inventory(new Product("Motherboard", 45, 5) :: Nil)
       	  println(test.GetTotalValue())
       }
}