
public class Buses extends Vechile{
    int while_count;
    String private_bus;

    public Buses(String name, String with_engine, int while_count, String private_bus) {
        super(name, with_engine);
        this.while_count = while_count;
        this.private_bus = private_bus;
    }

    public void identify_myself(String name, String with_engine){
        System.out.println("Hi I'm "+name+"("+this.private_bus+"), My name is "+this.name+" my engine status is "+with_engine+", I have "+this.while_count);
    }

    public int getWhile_count() {
        return while_count;
    }

    public void setWhile_count(int while_count) {
        this.while_count = while_count;
    }

    public String getPrivate_bus() {
        return private_bus;
    }

    public void setPrivate_bus(String private_bus) {
        this.private_bus = private_bus;
    }
}
