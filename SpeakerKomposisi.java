public class SpeakerKomposisi {
    public String merk;
    public Terminal plug;

    public SpeakerKomposisi(String merkPlug, int volt){
        plug = new Terminal();
        plug.merk = merkPlug;
        plug.volt = volt;
    }

    public void on(){
        plug.on();
    }

    public void off(){
        plug.off();
    }

    public void run(){
        System.out.println("Speaker menyala....");
    }
}
