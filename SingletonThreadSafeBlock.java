public class SingletonThreadSafeBlock
{
    private static SingletonThreadSafeBlock singletonThreadSafeblock;
    private void SingletonThreadSafeBlock()
    {

    }
    static void fun()
    {
        System.out.println(singletonThreadSafeblock);
        System.out.println("fun is called !");
        System.out.println();
    }
    static SingletonThreadSafeBlock getInstance()
    {
        synchronized (SingletonThreadSafeBlock.class)
        {
            if (singletonThreadSafeblock == null) {
                singletonThreadSafeblock = new SingletonThreadSafeBlock();
            }
        }
        return singletonThreadSafeblock;
    }
}
