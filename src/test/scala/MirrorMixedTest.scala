import mirror.Mirror
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MirrorMixedTest extends FunSuite {

  test("should mirror one") {
    val input = "lVHt"
    val expected = "lVHt"
    val result = Mirror.mirror(input)

    assert( result == expected )
  }

  test("should mirror two") {
    val input = "lVHt\nCDGIdolo"
    val expected = "lVHt\nolodIGDC"
    val result = Mirror.mirror(input)

    assert( result == expected )
  }

  test("should mirror mixed") {
    val input = "lVHt\nCDGIdolo\nJVhv\nUstXfrIg"
    val expected = "JVhv\nolodIGDC\nlVHt\ngIrfXtsU"
    val result = Mirror.mirror(input)

    assert( result == expected )
  }

}
