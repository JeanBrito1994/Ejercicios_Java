public class Ejercicio4 {
    /*
     * Crea una única función (importante que sólo sea una) que sea capaz
     * de calcular y retornar el área de un polígono.
     * - La función recibirá por parámetro sólo UN polígono a la vez.
     * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
     * - Imprime el cálculo del área de un polígono de cada tipo.
     */
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5);
        Triangulo triangulo = new Triangulo(4, 6);
        Rectangulo rectangulo = new Rectangulo(7, 3);

        double areaCuadrado = calcularArea(cuadrado);
        double areaTriangulo = calcularArea(triangulo);
        double areaRectangulo = calcularArea(rectangulo);

        System.out.println("Area cuadrado " + areaCuadrado);
        System.out.println("Area Triangulo " + areaTriangulo);
        System.out.println("Area Rectangulo " + areaRectangulo);
    }

   public interface Figura{
        double calcularArea();
   }

   public static class Cuadrado implements Figura{
        private double lado;

        public Cuadrado(double lado){
            this.lado = lado;
        }

       @Override
       public double calcularArea() {
           return lado * lado;
       }
   }

   public static class Triangulo implements Figura{
        private double base;
        private double altura;

        public Triangulo(double base, double altura){
            this.altura = altura;
            this.base = base;
        }
       @Override
       public double calcularArea() {
           return (base * altura) / 2;
       }
   }


   public static class Rectangulo implements Figura{
        private double largo;
        private double ancho;

        public Rectangulo(double largo, double ancho){
            this.largo = largo;
            this.ancho = ancho;
        }

       @Override
       public double calcularArea() {
           return largo * ancho;
       }
   }


   public static double calcularArea(Figura figura){
        return figura.calcularArea();
   }
}
