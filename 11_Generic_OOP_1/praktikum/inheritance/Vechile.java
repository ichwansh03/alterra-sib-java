
public class Vechile {
    String name;
    String with_engine;

    public Vechile(String name, String with_engine) {
        this.name = name;
        this.with_engine = with_engine;
    }

    public void identify_myself(String name, String with_engine){
        System.out.println("Hi I'm "+name+", My name is "+this.name+" my engine status is "+with_engine);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWith_engine() {
        return with_engine;
    }

    public void setWith_engine(String with_engine) {
        this.with_engine = with_engine;
    }
}
