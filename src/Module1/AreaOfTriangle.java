package Module1;

public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println(getSquare(6,5,3,3,4,0));
    }

    public static double getSquare(int x1, int y1, int x2, int y2, int x3, int y3) {
        double AB = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        double BC = Math.sqrt(Math.pow(x3-x2,2) + Math.pow(y3-y2,2));
        double AC = Math.sqrt(Math.pow(x1-x3,2) + Math.pow(y1-y3,2));

        double p = (AB+BC+AC)/2;

        return Math.sqrt(p*(p-AB)*(p-AC)*(p-BC));
    }
}
