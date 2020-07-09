
public class SingingChicken extends SingingAnimal {
    public SingingChicken(String name, String voice){
        super(2, name, voice);
    }

    public void sing(){
        System.out.println("Cock-a-doodle-doo");
    }
        // SingingChicken mengoverride method dance, di mana method akan memanggil method dance milik SingingAnimal terlebih dahulu, kemudian mencetak "I am also flying" (tanpa tanda kutip) diikuti newline.
    public void dance(){
        super.dance();
        System.out.println("I am also flying");
    }


}