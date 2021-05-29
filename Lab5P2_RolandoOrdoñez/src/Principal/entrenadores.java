package Principal;

public class entrenadores {

    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int edad;
    private int contrato;
    private int c_ganadas = 0;

    public entrenadores() {
    }

    public entrenadores(String nombre, String apellido, String nacionalidad, int edad, int contrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.contrato = contrato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public int getC_ganadas() {
        return c_ganadas;
    }

    public void setC_ganadas(int c_ganadas) {
        this.c_ganadas = c_ganadas;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public String cadena() {
        return "entrenadores{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", edad=" + edad + ", contrato=" + contrato + ", c_ganadas=" + c_ganadas + '}';
    }
}
