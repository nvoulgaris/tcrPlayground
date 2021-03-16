import spock.lang.Specification


class FizzBuzzWoofSpec extends Specification {


  def "FizzBuzzWoof should ..."() {
    given:
      FizzBuzzWoof fizzBuzzWoof = new FizzBuzzWoof()
    when:
      String result = fizzBuzzWoof.of(1)
    then: 
      result == "1"
  }
}