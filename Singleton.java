package Feb_19_Singleton;

public class Singleton
{

    private static Singleton instanceVariable;
    // private constructor to prevent instatnation
    private Singleton()
    {

    }
    // public static method to provide global access to instance
    public static Singleton getInstance()
    {
        // double checked locking for thread safety
        if(instanceVariable == null)
        {
          synchronized (Singleton.class)
          {
              if(instanceVariable == null)
              {
                  instanceVariable = new Singleton();
              }
          }
        }
        return instanceVariable;
    }

}
