package dp.creational;

/*While Considering the builder pattern you need to look weather the object is having

Complex constructor.
Multiple constructor having combinations of multiple parameter with nested objects

Large number of parameters.
having large number of field parameter is also the key point to consider.

Immutability.
You can force the immutability to the object once you are done with creation of object.
*/

public class builder {

  Person person = new Person.PersonBuilder()
      .setAge(15)
      .setFirstName("Ismayil")
      .setLastName("Alizad")
      .build();

}

class Person {
  private String firstName;
  private String middleName;
  private String lastName;
  private int age;
  private double height;
  private double weight;

  Person(String firstName, String middleName, String lastName, int age, double height,
      double weight) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }


  static class PersonBuilder {

    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private double height;
    private double weight;

    public PersonBuilder() {
    }

    public PersonBuilder setFirstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public PersonBuilder setMiddleName(String middleName) {
      this.middleName = middleName;
      return this;
    }

    public PersonBuilder setLastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public PersonBuilder setAge(int age) {
      this.age = age;
      return this;
    }

    public PersonBuilder setHeight(double height) {
      this.height = height;
      return this;
    }

    public PersonBuilder setWeight(double weight) {
      this.weight = weight;
      return this;
    }

    public Person build() {
      return new Person(firstName, middleName, lastName, age, height, weight);
    }
  }
}