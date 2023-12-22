public class Main {

   public static void main(String... args) {
    Carro carro = new Carro(4);
    carro.setCor(Carro.VERMELHO);
    carro.setArCondicionado(1);
    carro.setVidrosEletricos(4);
    carro.setDirecaoEletrica(1);

    carro.imprimeValores();


   }
}
