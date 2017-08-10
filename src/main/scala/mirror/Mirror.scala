package mirror

object Mirror {

  def vertical(input: String): String = input.split("\n").map(_.reverse).mkString("\n")

  def horizontal(input: String): String = input.split("\n").reverse.mkString("\n")

  def mirror(input: String): String = {
    val tuple12 = input.split("\n").zipWithIndex.partition(_._2 % 2 == 0)
    val horizontalSeq = horizontal(tuple12._1.map(_._1).mkString("\n")).split("\n")
    val verticalSeq = vertical(tuple12._2.map(_._1).mkString("\n")).split("\n")
    horizontalSeq.zip(verticalSeq).map(t => if (!t._2.isEmpty) t._1 + "\n" + t._2 else t._1).mkString("\n")
  }
}
