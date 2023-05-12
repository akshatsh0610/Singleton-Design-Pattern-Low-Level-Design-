public class SingletonLazy
{
    private static SingletonLazy singletonLazy;
    SingletonLazy()
    {

    }
    static void fun()
    {
        System.out.println(singletonLazy);
        System.out.println("fun is called !");
        System.out.println();
    }
    static SingletonLazy getInstance()
    {
        if(singletonLazy == null)
        {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }

}
