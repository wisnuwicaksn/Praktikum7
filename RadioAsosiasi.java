public class RadioAsosiasi {
    public String merk;
    public Terminal plug;

    public void on(){
        plug.on();
    }

    public void off(){
        plug.off();
    }

    public void run(){
        System.out.println("Radio menyala....");
    }
}
