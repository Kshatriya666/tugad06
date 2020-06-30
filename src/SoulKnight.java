public class SoulKnight {
    String heroclass;
    String weapon;
    int lives = 5;
    double gold;
    double gem;
    double damage;

    public SoulKnight(String heroclass, String weapon) {
        this.heroclass = heroclass;
        this.weapon = weapon;
    }


    //HERO CLASS
    void Knight(){
        damage += 2;
    }
    void Knight(String HOLYKNIGHT){
        damage *= 4;
        lives += 20;
    }
    void Priest(){
        lives += 5;
    }
    void Assassin(){
        gold *= 3;
    }
    void Berserker(){
        damage *= 2;
    }


    //WEAPON
    void VoidSword(){
        damage += 30;
        lives -= 1;
    }
    void VoidSword(String CURSED){
        damage += 500;
        lives -= 99;
    }
    void TripleCrossbow(){
        damage += 18;
        damage *= 3;
    }
    void OnePunch(){
        damage += 999;
    }
    void OnePunch(String BROKEN){
        damage -= 250;
    }
    void StaffOfNature(){
        damage += 5;
        gem *= 2;
    }
    void StaffOfNature(String AWAKEN){
        damage += 250;
        gem *= 5;
    }

    void ShowResult(String SLine){
        System.out.println(SLine);
        System.out.println("Class \t: " + heroclass);
        System.out.println("Weapon \t: " + weapon);
        System.out.println("Lives \t: " + lives);
        System.out.println("Gold \t: " + Math.round(gold));
        System.out.println("Gem \t: " + Math.round(gem));
        System.out.println(SLine);
        System.out.println("\n");
    }

    void GetGolds (){
        gold = 125.25 * damage;
    }
    void GetGems (){
        gem = 0.5 * damage;
    }
}