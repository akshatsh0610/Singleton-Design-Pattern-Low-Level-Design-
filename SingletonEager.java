public class SingletonEager
{
      private static SingletonEager singletonEager = new SingletonEager();  //instance variable
//    public SingletonEager(){
//        System.out.println("object created , hashcode: " + this);
//    };

      private SingletonEager()
      {
          System.out.println("object created , hashcode: " + this);
      }
       public static SingletonEager getInstance()
       {
          return singletonEager;
       }
       public static void fun()
       {
           System.out.println(singletonEager);
           System.out.println("fun is called !");
       }
}
