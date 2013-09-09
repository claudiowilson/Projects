import java.io.File

object Program {
       val files = GetValidDirectories(new File(".").listFiles).zipWithIndex

       def main(args: Array[String]) {
       	   println("\nWelcome to my Scala Projects Menu!\n")
	   println("Choose a folder to run tests on.")

	   for((file, index) <- files) {
	   	    println(index + " " + file.getName())
	   }
       }

       def GetValidDirectories(files: Array[File]):Array[File] = {
       	   files.filter(f => f.isDirectory() && !f.getName().contains('.'))
       }
}