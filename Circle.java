public class Circle extends Poligon{
  int radius;

  public Circle(int radius){
    this.radius = radius;
  }

  @Override
  void afisare() {
    System.out.println("Clasa Circle");
  }

  @Override
  void detalii() {
    System.out.println("Contine metoda perimetru, afisare, detalii.");
    System.out.println("Raza cercului: " + radius);
  }

  @Override
  double perimetru() {
    return 2 * 3.14 * radius;
  }

}
