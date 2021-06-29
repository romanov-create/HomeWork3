package HomeWork3.NullPointerEx;

import java.util.ArrayList;
import java.util.List;

public class NullPointExx {
    static class Ball {
        int test = 1;

        @Override
        public String toString() {
            return "Ball{" +
                    "test=" + test +
                    '}';
        }
    }

    private static class Board {
        // private List balls;
        List balls = new ArrayList<>();
        public Board() {

            balls.add(new Ball());
            balls.add(new Ball());
            balls.add(new Ball());
            balls.add(new Ball());
            balls.add(new Ball());

        }

        public int count() {
            return balls.size();
        }
    }

    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board.count());
        System.out.println(board.balls.toString());
    }
}
