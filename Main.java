public class Main{
  public static void main(String[] args) {
    System.out.println("\n===========================================");
    Square sq = new Square(5);
    sq.afisare();
    sq.detalii();
    sq.perimetru();
    System.out.println("===========================================");

    System.out.println("\n===========================================");
    Rectangle rec = new Rectangle(5, 8);
    rec.afisare();
    rec.detalii();
    rec.perimetru();
    System.out.println("===========================================");

    System.out.println("\n===========================================");
    Circle c = new Circle(5);
    c.afisare();
    c.detalii();
    c.perimetru();
    System.out.println("===========================================");
    

  }
} 