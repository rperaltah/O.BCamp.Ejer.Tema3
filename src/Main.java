public class Main {
    public static void main(String[] args) {
        int resultado = suma(1, 5, 9);
        System.out.println("Primera parte");
        System.out.println(resultado);


        System.out.println("Segunda parte, Puertas");
        Carro miCarro = new Carro();
        miCarro.NumerodePuertas();

        System.out.println(miCarro.Puertas);

    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }


}
class Carro {
    public int Puertas = 5;
    public void NumerodePuertas(){
        this.Puertas++;
            }
}

