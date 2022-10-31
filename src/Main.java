public class Main {
    public static void main(String[] args) {

        Direccion direccion = new Direccion("avenida12","martinez'","Bogota",253021);

        Propietario propietario = new Propietario("Deimar","nosequeescpf","tampocorg",direccion);

        Marca marca = new Marca("nrDeModelols",2023,"abc121");

//        inicio basica para crear auto
//        Auto carro1 = new Auto(propietario,marca);

//        inico completo para crear auto
        Auto carro1 = new Auto(2023,"Plomo",2022,marca,2135123,propietario,267,12,true,6,false);
//        Acelerar
        carro1.aceleracion();
        carro1.aceleracion();
        carro1.aceleracion();
//        Subir cambioas
        carro1.subirMarcha();
        carro1.subirMarcha();
        carro1.subirMarcha();

        System.out.println("Velocidad actual " + carro1.getVelAct() + " kg/h");
//        Frenar
        carro1.desaceleracion();
        System.out.println("Velocidad actual despues de frenar " + carro1.getVelAct() + " kg/h");

        System.out.println("Cambio actual " + carro1.getMarchaAct());
//        bajar Cambio
        carro1.bajarMarcha();
        System.out.println("Cambio actual despues de bajar cambio " + carro1.getMarchaAct());

        System.out.println(carro1.getMarca().getName());
    }
}