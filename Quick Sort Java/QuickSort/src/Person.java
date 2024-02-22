public class Person {
    
    private String name;
    private int age;
    private float height;

    public Person(String n, int a, float h) {
        name = n;
        age = a;
        height = h;
    
    }

public String getName() {return name;}

public int getAge() {return age;}

public float getHeight() {return height;}

@Override
public String toString() {
    return ("(" + name + ", " + age + ","+ height + ")");   
}

}
