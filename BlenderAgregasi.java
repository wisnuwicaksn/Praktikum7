public class BlenderAgregasi {
    public String merk;
    public Terminal plug;

    public BlenderAgregasi(Terminal i){
        plug = i;
    }

    public void on(){
        plug.on();
    }

    public void off(){
        plug.off();
    }

    public void run(){
        System.out.println("Blender menyala....");
    }
}
