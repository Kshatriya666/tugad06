public class Main {
    public static void main(String[] args) {
        SoulKnight player1 = new SoulKnight("Knight","Void Sword");
        player1.Knight();
        player1.VoidSword();
        player1.GetGolds();
        player1.GetGems();
        player1.ShowResult("===PLAYER 1===");

        Supporter supporter = new Supporter("Thief","Triple Crossbow",5);
        supporter.Thief();
        supporter.TripleCrossbow();
        supporter.ShowResult("===SUPPORTER===");

        SoulKnight player2 = new SoulKnight("Priest","Staff of Nature");
        player2.Priest();
        player2.StaffOfNature();
        player2.GetGolds();
        player2.GetGems();
        player2.ShowResult("===PLAYER 2===");

        SoulKnight player3 = new SoulKnight("Berserker","One Punch");
        player3.Berserker();
        player3.OnePunch();
        player3.GetGolds();
        player3.GetGems();
        player3.ShowResult("===PLAYER 3===");

        Robot robot = new Robot("Apocalypse","Rocket Cannon",100);
        robot.Apocalypse();
        robot.OnePunch();
        robot.ShowResult("===ROBOT===");
    }
}
