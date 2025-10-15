package labs.tasks.class02B;

public class Task02Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "azul";
        c1.tampa = true;
        c1.carga = 80;
        c1.status();

        c1.rabiscar();

        System.out.println("------------");
        Caneta c2 = new Caneta();

        c2.modelo = "Fabric";
        c2.cor = "Preta";
        c2.destampar();

        c2.status();

        c2.rabiscar();

    }

}
