package ammonite.integration

object Main {
  def main(args: Array[String]): Unit = {
    args match{
      case Array("debug") =>
        import ammonite.ops._
        import ammonite.repl.Main._
        val value1 = "foo"
        val value2 = "bar"
        debug("name1" -> value1, "name2" -> value2)
      case Array("run") =>
        import ammonite.ops._
        ammonite.repl.Main.run(
          predef = "import ammonite.integration.Main._",
          predefFile = Some(
            cwd/'shell/'src/'main/'resources/'ammonite/'shell/"example-predef-bare.scala"
          )
        )

    }
  }
  def foo() = 1
  def bar() = "two"
}
