public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Mike Tyson",10,120,100,50);
        Fighter f2 = new Fighter("Muhammed Ali",40,85,85,40);

        Match match = new Match(f1,f2,85,100);
        match.setStartingFighterRandomly();
        match.run();


    }
}
