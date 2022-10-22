
class Student
{
    String name;
    int id;
    float cgpa;

    public static void shout()
    {
        System.out.println("I can do anything.");
    }

    public void setID(int i) {
    }
}

public class ClassesAndObjects {

    public static void main(String[] args) {
        Student akib = new Student();
        akib.name = "Akibur Rahman";
        akib.id = 213002094;
        akib.cgpa = 3.08f;
        System.out.println("Akib's Details are:\n" + akib.name +"\n"+ akib.id+"\n" + akib.cgpa+ "\n");
    }
}
