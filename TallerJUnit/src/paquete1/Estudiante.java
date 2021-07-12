package paquete1;

public class Estudiante {

    // 1.  Declarar
    // se declaran datos o atributos con visibilidad protegido
    // # nombresEstudiante: Cadena
    protected String nombresEstudiante;
    // # apellidosEstudiante: Cadena
    protected String apellidosEstudiante;
    // # identificacionEstudiante: Cadena
    protected String identificacionEstudiante;
    // # edadEstudiante: Entero
    protected int edadEstudiante;

    public void establecerNombresEstudiante(String n) {
        nombresEstudiante = n;
    }

    public void establecerApellidoEstudiante(String n) {
        apellidosEstudiante = n;
    }

    public void establecerIdentificacionEstudiante(String n) {
        identificacionEstudiante = n;
    }

    public void establecerEdadEstudiante(int n) {
        edadEstudiante = n;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre Estudiante: %s %s\nCédula: %s",
                nombresEstudiante, apellidosEstudiante, identificacionEstudiante);

        return cadena;
    }

}
