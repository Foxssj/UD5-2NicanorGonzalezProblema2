public class VeredaGT implements Vehicle{

        /*
        * matrícula: Un valor alfanumérico que identifica unívocamente al coche.

        * maxEnergy: Un valor numérico que representa el nivel de carga máximo de la batería.

        * energy: Un valor numérico que representa el nivel de carga actual de la batería.

        * movementCount: Un valor numérico que representa el número de movimientos que ha ejecutado el vehículo.
        *  Debe tener un valor inicial de 0 siempre.

        * energyDelta: Un valor numérico que representa la cantidad de energía que consume el vehículo
        *  por cada movimiento.

        * */

        private String matricula;
        private final int MAX_ENERGY = 255;
        private float energy;
        private int movementCount = 0;
        private float energyDelta;

        public VeredaGT(String matricula, float energyDelta) {
                if (matricula.length() == 7) {
                        this.matricula = matricula;
                } else {
                        this.matricula = "1A2B3C4";
                }
                if (energyDelta < 255 || energyDelta > 1) {
                        this.energyDelta = energyDelta;
                } else {
                        this.energyDelta = 15;
                }
        }

        public String getMatricula() {
                return matricula;
        }

        public void setMatricula(String matricula) {
                this.matricula = matricula;
        }

        public int getMAX_ENERGY() {
                return MAX_ENERGY;
        }

        public float getEnergy() {
                return energy;
        }

        public void setEnergy(float energy) {
                this.energy = energy;
        }

        public void setMovementCount(int movementCount) {
                this.movementCount = movementCount;
        }

        public int getMovementCount() {
                return movementCount;
        }

        public void setEnergyDelta(float energyDelta) {
                this.energyDelta = energyDelta;
        }

        public float getEnergyDelta() {
                return energyDelta;
        }

        /*
         * energyLevel(): Debe devolver un valor flotante que se corresponderá con la cantidad
         * de energía que se encuentra almacenada en las baterías del vehículo.

         * recharge(): Cada vez que se ejecute este método la carga de la batería pasará a ser la máxima posible.

         * move(): Cada vez que se ejecute este método, la carga de la batería tendrá
         * que decrementarse en un valor que dependerá de cada vehículo.
         * Del mismo modo tendrá que registrarse que se ha llevado a cabo un movimiento.

         * status(): Debe devolver una cadena con el siguiente formato:
         * El vehículo <matrícula> tiene un nivel de carga de:
         * <nivel de energía> y se ha movido <número de movimientos> veces.

         * */

        @Override
        public float energyLevel() {
                return getEnergy();
        }

        @Override
        public void recharge() {
                if (energy < MAX_ENERGY) {
                        setEnergy(MAX_ENERGY);
                } else {
                        System.out.println("La energía ya está al máximo");
                }
        }

        @Override
        public void move() {
                if (energy >= 15) {
                        setEnergy(energy - energyDelta);
                        movementCount++;
                } else {
                        System.out.println("El vehiculo no tiene suficiente energía");
                }
        }

        @Override
        public String status() {
                String out = "El vehículo " + matricula + " tiene un nivel de carga de: " +
                        energyLevel() + " y se ha movido " + movementCount + " veces.";
                return out;
        }
}
