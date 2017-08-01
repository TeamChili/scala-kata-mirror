package mirror 

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.Assertions._


@RunWith(classOf[JUnitRunner])
class MirrorTest extends FunSuite {

    test("should mirror horizontally") {
      val input = ""
      val expected = ""
      val result = Mirror.horizontal(input)

      assert( result == expected )
    }

  test("should mirror verictally") {
    val input = "hSgdHQ\nHnDMao\nClNNxX\niRvxxH\nbqTVvA\nwvSyRu"
    val expected = "QHdgSh\noaMDnH\nXxNNlC\nHxxvRi\nAvVTqb\nuRySvw"
    val result = Mirror.vertical(input)

    assert( result == expected )
  }

  test("should mirror verictally 2") {
    val input = "IzOTWE\nkkbeCM\nWuzZxM\nvDddJw\njiJyHF\nPVHfSx"
    val expected = "EWTOzI\nMCebkk\nMxZzuW\nwJddDv\nFHyJij\nxSfHVP"
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
