package Fabrica;

public class FabricaDeChocolate {
    public static void main(String[] args) {
        CaldeiraChocolate fazer = CaldeiraChocolate.getInstancia();

        System.out.println(fazer.encher());
        System.out.println(fazer.encher());
        System.out.println(fazer.ferver());
        System.out.println(fazer.drenar());
        System.out.println(fazer.encher());

    }
}
