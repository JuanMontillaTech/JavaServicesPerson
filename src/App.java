public class App {
    public static void main(String[] args) throws Exception {
        Coche coche1 = new Coche();
        coche1.marca = "Ford";
        int pepito = coche1.getVelocidad();
        CocheDeportivo coche2 = new CocheDeportivo();
        coche2.ActiveTurbo();
        coche2.acelerar();
        System.out.println(coche2.velocidad);

    }
}
