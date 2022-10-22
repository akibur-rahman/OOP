
class Employee {
    private String name;
    private String id;
    
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setID(String id)
    {
        this.id = id;
    }
    
    public String getID()
    {
        return id;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Employee akib = new Employee();
        // akib.name = "Akib";
        // akib.id = "213002094";
        // System.out.println(akib.name +" "+ akib.id);
        akib.setID("213002094");
        akib.setName("Akibur Rahman");
        System.out.println(akib.getID()+" "+akib.getName());
    }
}