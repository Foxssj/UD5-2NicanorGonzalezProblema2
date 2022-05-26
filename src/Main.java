public class Main {

    public static void main(String[] args) {
        /*
        * Crea un programa que muestre el correcto funcionamiento de la clase.
        *  Presta especial atención para que la clase no permita
        * ningún comportamiento inadecuado, por ejemplo: Un vehículo sin energía no debería poder moverse.

        */

        VeredaGT coche1 = new VeredaGT("1q0w0p3", 12.5f);

        System.out.println(coche1.energyLevel());

        coche1.move();

        coche1.recharge();

        coche1.recharge();

        System.out.println(coche1.energyLevel());

        coche1.move();

        System.out.println(coche1.status());

        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

        for (int i = 0; i < 4; i++) {
            coche1.move();
            System.out.println(coche1.status());
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        }

    }
}
