package file.java.gold;

public class GoldRunner {

        public static void main(String[] args) {
            Gold gold = new Gold();
            Metal metal = new Metal(gold);
            metal.melt();
        }
    }


