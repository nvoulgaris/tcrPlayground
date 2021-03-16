class FizzBuzzWoof {

  fun of(input: Int): String {
    if (input.rem(3) == 0) return "Fizz"
    return input.toString()
  }
}