public class Main {
    public static void main(String[] args) {

        Direccion direccion = new Direccion("avenida12","martinez'","Bogota",253021);

        Propietario propietario = new Propietario("Deimar","nosequeescpf","tampocorg",direccion);

        Marca marca = new Marca("nrDeModelols",2023,"abc121");

        Auto caro1 = new Auto(propietario,marca);
        caro1.setVelMax(123);
        caro1.aceleracion();
        caro1.aceleracion();
        caro1.aceleracion();
        System.out.println(caro1.getVelAct());
    }
}