import spock.lang.Specification


class FizzBuzzWoofSpec extends Specification {


  def "FizzBuzzWoof should ..."() {
    given:
      FizzBuzzWoof fizzBuzzWoof = new FizzBuzzWoof()
    when:
      String result = fizzBuzzWoof.of(input)
    then:
      result == expectedOutput
    where:
      input || expectedOutput
      1     || "1"
      2     || "2"
      3     || "Fizz"
      4     || "4"
      5     || "Buzz"
  }
}