import Solution._
import org.scalatest._

class SolutionTest extends FunSuite {

  val testCases: List[(Input, Output)] = List(
    // example input -> expected output
  )

  test("Solution passes test cases") {

    assert(testCases.nonEmpty, "You should add some test cases")

    testCases.foreach { case (in, out) =>
      assertResult(out) { solution(in) }
    }
  }

}
