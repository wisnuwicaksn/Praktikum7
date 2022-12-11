public class Main {
    public static void main(String[] args) {
        //Membuat object Terminal
        Terminal plug = new Terminal();  
        
        //Memanggil atribut
        plug.merk = "Bardi";
        plug.volt = 12;

        //Dependensi
        TelevisiDependensi tv = new TelevisiDependensi();

        tv.merk = "Sharp LED";
        tv.on(plug);
        tv.run();
        tv.off(plug);
        System.out.println();

        //Asosiasi
        RadioAsosiasi radio = new RadioAsosiasi();

        radio.merk = "Toshiba";
        radio.plug = plug;
        radio.on();
        radio.run();
        radio.off();
        System.out.println();

        //Agregasi
        BlenderAgregasi blender = new BlenderAgregasi(plug);

        blender.merk = "Philips";
        blender.on();
        blender.run();
        blender.off();
        System.out.println();

        //Komposisi
        SpeakerKomposisi speaker = new SpeakerKomposisi("Bardi", 12);

        speaker.merk = "JBL";
        speaker.on();
        speaker.run();
        speaker.off();
        System.out.println();
    }
}
