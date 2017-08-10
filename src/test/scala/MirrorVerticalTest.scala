package mirror 

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.Assertions._


@RunWith(classOf[JUnitRunner])
class MirrorVerticalTest extends FunSuite {

  test("should mirror verictally 1") {
    val input = "hSgdHQ"
    val expected = "QHdgSh"
    val result = Mirror.vertical(input)

    assert( result == expected )
  }

  test("should mirror verictally 2") {
    val input = "IzOTWE\nkkbeCM"
    val expected = "EWTOzI\nMCebkk"
    val result = Mirror.vertical(input)

    assert( result == expected )
  }

  test("should mirror verictally 3") {
    val input = "cuQW\nxOuD\nfZwp\neqFx"
    val expected = "WQuc\nDuOx\npwZf\nxFqe"
    val result = Mirror.vertical(input)

    assert( result == expected )
  }

  test("should mirror verictally even more") {
    val input = "CDGIdolo\nUstXfrIg\ntMqjvxWL\nBEyuCnAm\nxsxaEERa\nxZsvOiZS\nLutlBRXE\ntxshhbqE"
    val expected = "olodIGDC\ngIrfXtsU\nLWxvjqMt\nmAnCuyEB\naREEaxsx\nSZiOvsZx\nEXRBltuL\nEqbhhsxt"
    val result = Mirror.vertical(input)

    assert( result == expected )
  }
}
