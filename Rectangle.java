public class Rectangle extends Poligon{
  int sideA;
  int sideB;

  public Rectangle(int sideA, int sideB){
    this.sideA = sideA;
    this.sideB = sideB;
  } 

  @Override
  void afisare() {
    System.out.println("Clasa Rectangle");
  }

  @Override
  void detalii() {
    System.out.println("Contine metoda perimetru, afisare, detalii.");
    System.out.println("Informatia despre laturile dreptunghiului: \nlatura1 = " + sideA + "\nlatura2 = " + sideB);
  }

  @Override
  double perimetru() {
    return sideA * sideB;
  }
}
