package ru.servplus.scala.task2

object Sum extends App {
  val intList: Seq[Int] = List(1, 2, 3, 4, 5, 5)
  val sum = intList.filter(_ % 2 != 0).sum
  println(sum)
}