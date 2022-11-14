public class Eagle extends  Animal{

    public Eagle(String name) {
        super(name);
    }
    public void fly(){
        System.out.println(getName()+" Flying");
    }

    @Override
    public void live(String a) {
        System.out.println(" Eagle live");
    }


    public String toString(){
        return super.getName();
    }




}
