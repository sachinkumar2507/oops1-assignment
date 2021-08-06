package sachin
import scala.collection.mutable.ListBuffer

trait Queue {

  def enqueue(numbertoBePushed: Int)

  def dequeue(queue: ListBuffer[Int]) : Int ={

    val deletedElement = queue(0)
    queue.remove(0)
    deletedElement
  }

}