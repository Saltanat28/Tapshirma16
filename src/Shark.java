public class Shark extends Animal {
    public Shark(String name) {
        super(name);
    }
    public void attack(){
        System.out.println( getName()+ " attacking");
    }

    @Override
    public void live(String a) {
        System.out.println("Animal live");
    }
    public String toString(){
        return super.getName();
    }
}
