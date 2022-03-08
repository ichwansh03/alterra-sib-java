
public class Bikes extends Vechile{

    int while_count;

    public Bikes(String name, String with_engine) {
        super(name, with_engine);
    }

    public void identify_myself(String name, String with_engine){
        System.out.println("Hi I'm "+name+", My name is "+this.name+" my engine status is "+with_engine+", I have "+this.while_count);
    }

    public int getWhile_count() {
        return while_count;
    }

    public void setWhile_count(int while_count) {
        this.while_count = while_count;
    }
}
