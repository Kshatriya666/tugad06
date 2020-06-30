public class Supporter extends SoulKnight {

    double Affinity = 5;

    public Supporter(String heroclass, String weapon, double affinity) {
        super(heroclass, weapon);
        Affinity = affinity;
    }

    public void ShowResult(String SLine){
        System.out.println(SLine);
        System.out.println("Class \t: " + heroclass);
        System.out.println("Weapon \t: " + weapon);
        System.out.println("Lives \t: " + lives);
        System.out.println("Affinity \t: " + Affinity);
        System.out.println(SLine);
        System.out.println("\n");
    }

    void Thief(){
        damage += 2;
        gold -= 500;
        gem -= 10;
        Affinity -= 99;
    }
    void FortuneTeller(){
        gold *= 5;
        gem *= 1.5;
    }
}
