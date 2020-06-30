public class Robot extends SoulKnight{
    double Durability = 100;

    public Robot(String heroclass, String weapon, double durability) {
        super(heroclass, weapon);
        Durability = durability;
    }

    public void ShowResult(String SLine){
        System.out.println(SLine);
        System.out.println("Class \t: " + heroclass);
        System.out.println("Weapon \t: " + weapon);
        System.out.println("Lives \t: " + lives);
        System.out.println("Durability \t: " + Durability);
        System.out.println(SLine);
        System.out.println("\n");
    }

    void Apocalypse(){
        damage *= 10;
    }

    void Durability(){
        System.out.println("Durability :" + Durability);
    }
}