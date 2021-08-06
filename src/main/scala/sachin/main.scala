package sachin
import java.util.Scanner
import scala.collection.mutable.ListBuffer
import scala.util.control.Breaks._

object Main {
  def main(args: Array[String]): Unit = {


    val queue = new ListBuffer[Int]
    breakable {
      while (true) {
        println("\nPress")
        println("1: To insert element for Double Queue")
        println("2: To insert element for Square Queue")
        println("3: To delete an element")
        println("4: Display the Queue")
        println("5: Exit")
        val sc = new Scanner(System.in)
        val choice = sc.nextInt()
        choice match {
          case 1 =>
            println("\nEnter the Element for the Queue")
            val numbertoBePushed = sc.nextInt()
            val queueObj = new DoubleQueue(queue)
            queueObj.enqueue(numbertoBePushed)

          case 2 =>
            println("\nEnter the Element for the Queue")
            val numbertoBePushed = sc.nextInt()
            val queueObj = new SquareQueue(queue)
            queueObj.enqueue(numbertoBePushed)
          case 3 =>

            if (queue.size == 0) println("\nQueue is empty")
            else {
              val obj = new SquareQueue(queue)
              val removedElement = obj.dequeue(queue)
              println("Popped Element is : " + removedElement)
            }
          case 4 =>
            if (queue.size == 0) println("\nQueue is empty")
            else {
              println("\n Queue")
              for (i <- queue)
                print(i + " ")
              println()

            }
          case 5 =>
            println("Closing")
            break
          case _ =>
            println(" Enter a valid option")
        }
      }
    }
  }
}