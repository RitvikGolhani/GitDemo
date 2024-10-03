//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1,1);
        Point p2 = new Point (2,2);

        Line l1 = new Line(p1, p2);
        System.out.println(l1.calculateLength());
    }
}