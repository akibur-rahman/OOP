class Stat
{
    static int b = 4;
    static int a;
    static {
        a = b * 3;
    }

    static void hello()
    {
        System.out.println("Hello");
    }
}

public class Static_properties_and_methods
{
    public static void main(String[] args) {
        System.out.println(Stat.a);
        Stat.b = 100;
        System.out.println(Stat.a); //static variables can be called by class_name.variable
        Stat.hello(); // static methods can be called by class_name.method
    }
}