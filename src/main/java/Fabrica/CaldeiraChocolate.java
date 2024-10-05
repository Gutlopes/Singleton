package Fabrica;


public class CaldeiraChocolate {

    private static CaldeiraChocolate instancia;

    private boolean vazia;
    private boolean fervida;

    private CaldeiraChocolate() {
        this.vazia = false;
        this.fervida = true;
    }

    public static CaldeiraChocolate getInstancia() {
        if (instancia == null) {
            instancia = new CaldeiraChocolate();
        }
        return instancia;
    }

    //Se a caldeira estiver vazia, o sistema deve permitir que ela seja preenchida.
    //Caso contrário, o preenchimento não deve ser permitido.
    public String encher() {
        if (this.vazia == true) {
            this.fervida = false;
            return "A caldeira pode ser preenchida";
        } else {
            return "A caldeira está cheia";
        }
    }

    // O sistema só deve permitir que a caldeira ferva quando estiver cheia.
    //Se a caldeira estiver vazia ou se a mistura já estiver fervida, a operação não deve ser permitida.
      public String ferver() {
        if (this.vazia == false) {
            this.fervida = true;
            return "A mistura está fervendo";

        }else {
            return "A caldeira está vazia";
        }
    }

    //A mistura deve ser drenada apenas se tiver passado pelo processo de fervura.
    //Se o conteúdo ainda não estiver fervido ou a caldeira estiver vazia, a drenagem não deve ocorrer.
    public String drenar(){
        if (this.fervida == true){
            this.fervida = false;
            this.vazia = true;
            return "Mistura drenada";

        } else {
            return "A caldeira nao ferveu";
        }
    }
}

