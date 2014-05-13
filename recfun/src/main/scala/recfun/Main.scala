package recfun

import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    assert(c >= 0 && r >= 0 && c <= r)
    if (c == 0 || r == 0 || c == r)
      1
    else
      pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balH(inp: List[Char], stack: List[Char]): Boolean = {
      if (inp.isEmpty)
        stack.isEmpty
      else {
        inp.head match {
          case '(' => balH(inp.tail, inp.head +: stack)
          case ')' => {
            if (stack.isEmpty) false
            else balH(inp.tail, stack.tail)
          }
          case default => balH(inp.tail, stack)
        }
      }
    }
    balH(chars, List())
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def coinC(targ: Int, l: List[Int]): Int = {
      if (l.isEmpty) 0
      else {
        assert(l.head > 0)
        val leftAmt = targ - l.head
        if (leftAmt == 0) 1
        else {
          if (leftAmt > 0) {
            coinC(leftAmt, l) + coinC(targ, l.tail)
          }
          else coinC(targ, l.tail)
        }
      }
    }
    coinC(money, coins.sorted)
  }

}
