package dp.creational;

public class singleton {
  public static void main(String[] args){
    SingletonService instance1 = SingletonService.getInstance();
    SingletonService instance2 = SingletonService.getInstance();
    System.out.println(instance1.hashCode());
    System.out.println(instance2.hashCode());
  }
}

class SingletonService{
  static SingletonService singletonService = null;

  static SingletonService getInstance(){
    if(null == singletonService){
      singletonService = new SingletonService();
    }

    return singletonService;
  }
}