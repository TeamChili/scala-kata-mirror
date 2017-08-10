import mirror.Mirror
import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.{Matchers, PropSpec}

class MirrorHorizontalSpec extends PropSpec with TableDrivenPropertyChecks with Matchers {

  val inputsWithSolutions = Table(
    ("lVHt\nCSbg\nyeCt", "yeCt\nCSbg\nlVHt"),
    ("lVHt\nJVhv\nCSbg\nyeCt", "yeCt\nCSbg\nJVhv\nlVHt"),
    ("njMK\ndbrZ\nLPKo\ncEYz", "cEYz\nLPKo\ndbrZ\nnjMK"),
    ("QMxo\ntmFe\nWLUG\nowoq", "owoq\nWLUG\ntmFe\nQMxo"),
    ("FYvi\ndZQn\nuGef\nQoSy", "QoSy\nuGef\ndZQn\nFYvi")
  )

  property("horizontally mirrored input should be equal to solution") {

    forAll(inputsWithSolutions)((input, solution) =>
      Mirror.horizontal(input) should be (solution)
    )
  }

}
