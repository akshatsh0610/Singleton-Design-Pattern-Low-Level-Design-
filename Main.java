public class Main
{
    public static void main(String [] args)
    {
//          //Singleton eager
//          SingletonEager singletonEager1=new SingletonEager();
//          SingletonEager singletonEager2=new SingletonEager();
            //System.out.println(SingletonEager.getInstance());
//            SingletonEager singletonEager1  = SingletonEager.getInstance();
//            SingletonEager singletonEager2 = SingletonEager.getInstance();
//            System.out.println();
//            System.out.println(singletonEager1);
//            System.out.println(singletonEager2);
//
//            System.out.println(SingletonEager.getInstance());
//              SingletonEager.fun();


           //SingletonLazy
        SingletonLazy.fun();
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        SingletonLazy singletonLazy3 = SingletonLazy.getInstance();

        System.out.println(singletonLazy1);
        System.out.println(singletonLazy2);
        System.out.println(singletonLazy3);

    }
}
