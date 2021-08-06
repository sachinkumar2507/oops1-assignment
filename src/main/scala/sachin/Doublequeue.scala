package sachin

import scala.collection.mutable.ListBuffer

class DoubleQueue(queue: ListBuffer[Int]) extends Queue {

  override def enqueue(numbertoBePushed: Int): Unit = {

    queue += (numbertoBePushed * 2)
  }

}

class SquareQueue(queue: ListBuffer[Int]) extends Queue {

  override def enqueue(numbertoBePushed: Int): Unit = {

    queue += (numbertoBePushed * numbertoBePushed)
  }

}
