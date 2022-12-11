public class Terminal implements InTerminal {
    public String merk;
    public int volt;

    public void on(){
        System.out.println("Saklar on...");
    }

    public void off(){
        System.out.println("Saklar off....");
    }
}
