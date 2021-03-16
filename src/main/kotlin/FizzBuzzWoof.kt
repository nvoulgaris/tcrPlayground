class FizzBuzzWoof {

  fun of(input: Int): String {
    if (input.rem(3) == 0) return "Fizz"
    else if (input.rem(5) == 0) return "Buzz"
    return input.toString()
  }
}