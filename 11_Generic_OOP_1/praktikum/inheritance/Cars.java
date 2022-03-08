
public class Cars extends Vechile{

    int wheel_count;
    String engine_type;

    public Cars(String name, String with_engine, int wheel_count, String engine_type) {
        super(name, with_engine);
        this.wheel_count = wheel_count;
        this.engine_type = engine_type;
    }

    public void identify_myself(String name, String with_engine){
        System.out.println("Hi I'm "+name+", My name is "+this.name+" my engine status is "+with_engine+", I have "+this.wheel_count+" Wheel(s), My engine type: "+this.engine_type);
    }

    public int getWheel_count() {
        return wheel_count;
    }

    public void setWheel_count(int wheel_count) {
        this.wheel_count = wheel_count;
    }
}
