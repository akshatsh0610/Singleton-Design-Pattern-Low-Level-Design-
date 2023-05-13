public class SingletonThreadSafe
{
    private static SingletonThreadSafe singletonThreadSafe;
    private void SingletonThreadSafe()
    {

    }
    static void fun()
    {
        System.out.println(singletonThreadSafe);
        System.out.println("fun is called !");
        System.out.println();
    }
    static synchronized SingletonThreadSafe getInstance()
    {
        if(singletonThreadSafe == null)
        {
            singletonThreadSafe = new SingletonThreadSafe();
        }
        return singletonThreadSafe;
    }
}
