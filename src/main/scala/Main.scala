object Main {
  def series(n: Int): Int = {
    if (n == 0) 0 else series(n - 1) + n
  }
}