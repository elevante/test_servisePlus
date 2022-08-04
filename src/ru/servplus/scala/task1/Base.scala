package ru.servplus.scala.task1

case class Base(id: Int, description: String, kind: Option[Int])

object Base {
  def checkKind(base: Base): String = {
    base.kind match {
      case Some(kind) =>
        if (kind % 2 == 0) { "Чётное"} else { base.description }
      case _ => "Неизвестно"
    }
  }
}