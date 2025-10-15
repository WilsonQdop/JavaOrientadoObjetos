package labs.tasks.class02B;

public class Caneta {

    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampa;

    public void escrever() {

    }

    public void status () {
        System.out.println(this.cor);
        System.out.println(this.tampa);
        System.out.println(this.modelo);
        System.out.println(this.carga);
        System.out.println(this.ponta);
    }

    public void rabiscar() {
        if(tampa) {
            System.out.println("Caneta fechada");
        } else if(carga <= 0) {
            System.out.println("Caneta sem tinta");
        } else {
            System.out.println("Rabiscando");
        }

    }

    public boolean tampar() {
        this.tampa = true;
        return tampa;
    }

    public boolean destampar() {
        this.tampa = false;
        return tampa;
    }
}
