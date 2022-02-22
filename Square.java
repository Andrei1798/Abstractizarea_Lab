public class Square extends Poligon{
  int side;

  public Square(int side){
    this.side = side;
  }

  @Override
  void afisare() {
    System.out.println("Clasa Square (patrat)");
  }
  @Override
  void detalii() {
    System.out.println("Clasa patrat, contine latura: " + side);
    System.out.println("Constructorul, poate afla perimetrul ");
  }
  @Override
  double perimetru() {
    return side*4;
  }
}
