public class SingingAnimal {
    private int legs;
    private String name,voice;
    public SingingAnimal(int legs,String name,String voice){
        this.legs = legs;
        this.name = name;
        this.voice = voice;
    }

    public int getLegs(){
        return legs;
    }

    public String getName(){
        return name;
    }

    public String getVoice(){
        return voice;
    }

    public void setLegs(int legs){
        this.legs = legs;
    }

    public void setVoice(String voice){
        this.voice = voice;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sing(){
        System.out.print(voice);
    }

    public void dance(){
        System.out.print("I am dancing using my "+legs+" legs");
    }
}