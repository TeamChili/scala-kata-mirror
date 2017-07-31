package mirror 

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.Assertions._


@RunWith(classOf[JUnitRunner])
class MirrorTest extends FunSuite {
 
  object Mirror {
    def vertical(input: String): String = ""
    def horizontal(input: String): String = "" 
  }

    test("should mirror horizontally") {
      val input = ""
      val expected = ""
      val result = Mirror.horizontal(input)

      assert( result == expected )
    }


}
