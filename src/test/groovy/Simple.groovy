import spock.lang.Specification

class Simple extends Specification {
  def trivialTest() {
    expect:
      'MyString'.length() == 8
  }
}