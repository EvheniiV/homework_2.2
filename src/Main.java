public class Main {
    public static void main(String[] args) {
        int score = 100;
        int scoreUp = 1100;
        int scoreBonus = scoreUp >= 1000 ? scoreUp /  100 : 0;
        int totalScore = score + scoreUp + scoreBonus;
        System.out.println("На вашем счету: " + totalScore + " руб.");


    }
}
