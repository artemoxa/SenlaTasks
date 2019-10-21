package com.artemoxa;
import java.util.Scanner;

public class Task3 {


    public static class Point {
        double x, y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("(%f, %f)", x, y);
        }
    }


    public static Point findIntersection(Point A, Point B, Point C, Point D) {
        double a1 = A.y - B.y;
        double b1 = B.x - A.x;
        double c1 = a1 * B.x + b1 * B.y;

        double a2 = C.y - D.y;
        double b2 = D.x - C.x;
        double c2 = a2 * D.x + b2 * D.y;

        double delta = a1 * b2 - a2 * b1;
        Point intersection = new Point((b2 * c1 - b1 * c2) / delta, (a1 * c2 - a2 * c1) / delta);
        if (onSegment(A,B,intersection) && onSegment(C,D, intersection))
            return intersection;
        else
            return null;
    }

    public static Boolean onSegment(Point A, Point B, Point Z){
        Boolean x = false;
        Boolean y = false;

        if (A.x > B.x){
            if ((Z.x >= B.x) && (Z.x <= A.x))
                x = true;
        } else {
            if ((Z.x >= A.x)&& (Z.x <= B.x ))
                x = true;
        }

        if (A.y > B.y){
            if ((Z.y >= B.y) && (Z.y <= A.y ))
                y = true;
        } else {
            if ((Z.y >= A.y)&& (Z.y <= B.y ))
                y = true;
        }
        return x && y;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Пересечение отрезков AB и CD");
        System.out.println("Вводите координаты точки через запятую");
        System.out.print("Введите координаты точки A: ");
        String coordA = in.nextLine();
        System.out.print("Введите координаты точки B: ");
        String coordB = in.nextLine();
        System.out.print("Введите координаты точки C: ");
        String coordC = in.nextLine();
        System.out.print("Введите координаты точки D: ");
        String coordD = in.nextLine();
        Point A = new Point(Integer.parseInt(coordA.split(",")[0]), Integer.parseInt(coordA.split(",")[1]));
        Point B = new Point(Integer.parseInt(coordB.split(",")[0]), Integer.parseInt(coordB.split(",")[1]));
        Point C = new Point(Integer.parseInt(coordC.split(",")[0]), Integer.parseInt(coordC.split(",")[1]));
        Point D = new Point(Integer.parseInt(coordD.split(",")[0]), Integer.parseInt(coordD.split(",")[1]));
        Point Z = findIntersection(A,B,C,D);
        if (Z != null)
            System.out.println("Точка пересечения: "+Z);
        else
            System.out.println("Отрезки не пересекаются");
    }
}
