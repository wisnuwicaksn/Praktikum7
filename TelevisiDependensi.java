public class TelevisiDependensi {
    public String merk;
    public int volt;

    public void on(Terminal i){
        i.on();
    }

    public void off(Terminal i){
        i.off();
    }

    public void run(){
        System.out.println("TV menyala....");
    }
}
