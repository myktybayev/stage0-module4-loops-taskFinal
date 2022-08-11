package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        String part1 = "", part2 = "";
        String res = "";

        if (cathetusLength != 0) {

            for (int i = 0; i < cathetusLength - 1; i++) {
                part1 += cathetusLength - i;
                part2 += i + 2;
            }
            String bottom = part1 + "1" + part2;
            res = bottom;

            for (int i = 0; i < cathetusLength - 1; i++) {
                bottom = bottom.replace("" + (cathetusLength - i), " ");
                bottom = bottom.stripTrailing();

                res = bottom + "\n" + res;
            }

            System.out.println(res);
        }else{
            System.out.print("");
        }


    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(9);
    }
}
