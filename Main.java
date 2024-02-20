package Feb_19_Singleton;

import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
    // Instantiation of the Singleton class using the public static method
       Singleton singleton = Singleton.getInstance();
       System.out.println("Singleton obj hashcode "+ singleton.hashCode());
        System.out.println();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("Singleton obj1 hashcode "+singleton1.hashCode());
        System.out.println();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Singleton obj2 hashcode "+singleton2.hashCode());
        System.out.println();
        System.out.println("verify that all instance returnn same value   ");



    }
}
