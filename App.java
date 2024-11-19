class EspacioParqueadero{
    int numeroDeEspacio;
    String tipoPermido;
    boolean estado;
    EspacioParqueadero(int numeroDeEspacio, String tipoPermido, boolean estado){
        this.numeroDeEspacio = numeroDeEspacio;
        this.tipoPermido = tipoPermido;
        this.estado = estado;
    }
    public void asignarVehiculo(Vehiculo vehiculo){
        this.estado = true;
        System.out.println("Espacio Ocupado para " + vehiculo.placa);
    }
    public void liberarEspacio(){
        this.estado = false;
        System.out.println("Espacio Disponible");
    }
}
class Vehiculo{
    public String placa;
    public String tipo;
    public String propietario;
    Vehiculo(String placa, String tipo, String propietario){
        this.placa = placa;
        this.tipo = tipo;
        this.propietario = propietario;
    }
}
class GestionParqueadero{
    
    public void registrarVehiculo(Vehiculo vehiculo, String placa, String tipo, String propietario, EspacioParqueadero espacioParqueadero){
        if(tipo == espacioParqueadero.tipoPermido){
            if(espacioParqueadero.estado==false){
                vehiculo.placa = placa;
                vehiculo.tipo = tipo;
                vehiculo.propietario = propietario;
                espacioParqueadero.estado = true;
            }else{
                System.out.println("El espacio ya está en uso, debe ingresarlo en otro espacio");
            }
        }else{
            System.out.println("No se permitió el espacio");
        }
    }
}
public class App{

    public static void main(String args[]) {
        // Object[] parqueadero1 = new Object(1, "Moto", 0);
        // parqueadero(1, "Moto", 0);
        EspacioParqueadero espacioParqueadero1 = new EspacioParqueadero(1, "Moto", false);
        EspacioParqueadero espacioParqueadero2 = new EspacioParqueadero(2, "Moto", false);
        EspacioParqueadero espacioParqueadero3 = new EspacioParqueadero(3, "Moto", false);
        EspacioParqueadero espacioParqueadero4 = new EspacioParqueadero(4, "Moto", false);
        EspacioParqueadero espacioParqueadero5 = new EspacioParqueadero(5, "Moto", false);
        EspacioParqueadero espacioParqueadero6 = new EspacioParqueadero(6, "Carro", false);
        EspacioParqueadero espacioParqueadero7 = new EspacioParqueadero(7, "Carro", false);
        EspacioParqueadero espacioParqueadero8 = new EspacioParqueadero(8, "Carro", false);
        EspacioParqueadero espacioParqueadero9 = new EspacioParqueadero(9, "Carro", false);
        EspacioParqueadero espacioParqueadero10 = new EspacioParqueadero(10, "Carro", false);

        Vehiculo vehiculo1 = new Vehiculo("", "Moto", "");
        Vehiculo vehiculo2 = new Vehiculo("", "Moto", "");
        Vehiculo vehiculo3 = new Vehiculo("", "Moto", "");
        Vehiculo vehiculo4 = new Vehiculo("", "Moto", "");
        Vehiculo vehiculo5 = new Vehiculo("", "Moto", "");
        Vehiculo vehiculo6 = new Vehiculo("", "Carro", "");
        Vehiculo vehiculo7 = new Vehiculo("", "Carro", "");
        Vehiculo vehiculo8 = new Vehiculo("", "Carro", "");
        Vehiculo vehiculo9 = new Vehiculo("", "Carro", "");
        Vehiculo vehiculo10 = new Vehiculo("", "Carro", "");

        GestionParqueadero gestionParqueadero = new GestionParqueadero();
        gestionParqueadero.registrarVehiculo(vehiculo1, "652HG1", "Moto", "Jose", espacioParqueadero1);
        gestionParqueadero.registrarVehiculo(vehiculo2, "672HG1", "Moto", "Julian", espacioParqueadero2);
        espacioParqueadero1.asignarVehiculo(vehiculo1);
        espacioParqueadero2.asignarVehiculo(vehiculo2);
        gestionParqueadero.registrarVehiculo(vehiculo6, "672HG1", "Carro", "Julian", espacioParqueadero2);
        espacioParqueadero3.asignarVehiculo(vehiculo6);

  }
}