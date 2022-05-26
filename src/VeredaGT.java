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

        public String matricula;
        public final int MAX_ENERGY = 255;
        public float energy;
        public int movementCount = 0;
        public int energyDelta;

        public VeredaGT(String matricula, int energyDelta) {
                this.matricula = matricula;
                this.energyDelta = energyDelta;
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

        public void setEnergyDelta(int energyDelta) {
                this.energyDelta = energyDelta;
        }

        public int getEnergyDelta() {
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
                return energy;
        }

        @Override
        public void recharge() {
                setEnergy(MAX_ENERGY);

        }

        @Override
        public void move() {
                setEnergy(energy - energyDelta);
                movementCount++;
        }

        @Override
        public String status() {
                String out = "El vehículo" + matricula + "tiene un nivel de carga de:" +
                        energyLevel() + "y se ha movido" + movementCount + "veces.";
                return null;
        }
}
