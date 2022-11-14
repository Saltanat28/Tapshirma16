public class Tirtle extends Animal{

    public Tirtle(String name) {
        super(name);
    }
    public void swim(){
        System.out.println(getName()+  " swimming");

    }

    @Override
    public void live(String a) {
        System.out.println("Turtle live");
    }

    public String toString(){
        return super.getName();
    }
}
