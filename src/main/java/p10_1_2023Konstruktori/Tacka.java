package p10_1_2023Konstruktori;

public class Tacka {
        private int x;
        private int y;

        public Tacka() {

        }
        public Tacka(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void stampaj() {
            System.out.println("x koordinata: " + x);
            System.out.println("y koordinata: " + y);
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
}


