// Widad Istiqomah 18218011

import java.util.Scanner;
//import java.util.Array;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            // Membaca sebuah titik untuk lingkaran
        System.out.println("X lingkaran");
        int xCir = input.nextInt();
        System.out.println("y lingkaran");
        int yCir = input.nextInt();
        Point p = new Point(xCir, yCir);
            //Membaca 3 buah titik untuk segitiga
        System.out.println("X1 segitiga");
        int xS1 = input.nextInt();
        System.out.println("Y1 segitiga");
        int yS1 = input.nextInt();
        System.out.println("X2 segitiga");
        int xS2 = input.nextInt();
        System.out.println("Y2 segitiga");
        int yS2 = input.nextInt();
        System.out.println("X3 segitiga");
        int xS3 = input.nextInt();
        System.out.println("Y3 segitiga");
		int yS3 = input.nextInt();
            //Membaca 4 buah titik untuk segiempat
        System.out.println("X1 segitiga");
        int xK1 = input.nextInt();
        System.out.println("Y1 segitiga");
        int yK1 = input.nextInt();
        System.out.println("X2 segitiga");
        int xK2 = input.nextInt();
        System.out.println("Y2 segitiga");
        int yK2 = input.nextInt();
        System.out.println("X3 segitiga");
        int xK3 = input.nextInt();
        System.out.println("Y3 segitiga");
        int yK3 = input.nextInt();
        System.out.println("X4 segitiga");
        int xK4 = input.nextInt();
        System.out.println("Y4 segitiga");
        int yK4 = input.nextInt();
            // Instansiasi lingkaran
        Circle cir = new Circle(5, p);
        cir.print();
            // Instansiasi segitiga
		Point s1 = new Point(xS1, yS1);
		Point s2 = new Point(xS2, yS2);
        Point s3 = new Point(xS3, yS3);
        Point[] segi3 = new Point[3];
        segi3[0] = s1;
        segi3[1] = s2;
        segi3[2] = s3;
        Triangle t = new Triangle(segi3);
        t.print();
            //Instansiasi segiempat
        Point[] segi4 = new Point[4];
        Point k0 = new Point(xK1, yK1);
		Point k1 = new Point(xK2 , yK2);
        Point k2 = new Point(xK3 , yK3);
        Point k3 = new Point(xK4, yK4);
        segi4[0] = k0;
		segi4[1] = k1;
		segi4[2] = k2;
        segi4[3] = k3;
        Rectangle r = new Rectangle(segi4);
		r.print();
            //Mencetak info dari lingkaran (dengan radius 5), segitiga, dan segiempat

            //Deklarasi sebuah variabel dengan tipe Shape lalu assign objek segitiga yang sudah dibuat ke variabel ini
        Shape shape = t;
            //Cetak informasi variabel shape *perhatikan outputnya 
        shape.print();
            // cetak info jenis segitiga
        if (t.isSamaSisi()){
            t.print();
            System.out.println("segitiga merupakan segitiga sama sisi");
        } else {
            System.out.println("segitiga tidak sama sisi");
        }
        if (t.isSamaKaki()){
            t.print();;
            System.out.println("segitiga merupakan segitiga sama kaki");
        } else {
            System.out.println("segitiga tidak sama kaki");
        }
        //Menghitung keliling lingkaran
        System.out.println("keliling lingkaran: " + cir.keliling());
        //Menghitung keliling segitiga
        System.out.println("keliling segitiga: " + t.keliling());
        //Menghitung keliing segiempat
        System.out.println("keliling segi empat: "+ r.keliling());
        //Membaca sebuah titik baru 
        System.out.println("X1 geser");
        int x = input.nextInt();
        System.out.println("Y1 geser");
        int y = input.nextInt();
        Point nx = new Point(x, y);
        //Deklarasi sebuah variabel dengan tipe Shape lalu assign objek segiempat yang sudah dibuat ke variabel ini
        Shape shape2 = r;
        //Melakukan pergeseran segiempat dengan titik baru. 
        r.translate(nx);
        //Cetak informasi variabel shape *perhatikan outputnya 
        shape2.print();
    }
}