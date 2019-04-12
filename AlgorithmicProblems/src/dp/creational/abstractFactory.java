package dp.creational;

class abstractFactory {
  public static void main(String[] arg){
    FactoryProvider.getFactory("Animal").create("Dog");
  }
}

interface Animal {
  String getAnimal();
  String makeSound();
}

interface AbstractFactory<T> {
  T create(String animalType) ;
}

class Duck implements Animal {

  @Override
  public String getAnimal() {
    return "Duck";
  }

  @Override
  public String makeSound() {
    return "Squeks";
  }
}

class Dog implements Animal {

  @Override
  public String getAnimal() {
    return "Dog";
  }

  @Override
  public String makeSound() {
    return "Dog sound";
  }
}

class AnimalFactory implements AbstractFactory<Animal> {

  @Override
  public Animal create(String animalType) {
    if ("Dog".equalsIgnoreCase(animalType)) {
      return new Dog();
    } else if ("Duck".equalsIgnoreCase(animalType)) {
      return new Duck();
    }

    return null;
  }

}

class FactoryProvider {
  public static AbstractFactory getFactory(String choice){

    if("Animal".equalsIgnoreCase(choice)){
      return new AnimalFactory();
    }
/*    else if("Color".equalsIgnoreCase(choice)){
      return new ColorFactory();
    }*/

    return null;
  }
}
