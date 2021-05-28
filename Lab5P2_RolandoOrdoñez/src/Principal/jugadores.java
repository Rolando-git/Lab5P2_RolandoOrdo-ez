package Principal;

public class jugadores {

    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int edad;
    private int numero;
    private int p_jugados = 0;
    private int c_ganadas = 0;
    private int amarillas = 0;
    private int rojas = 0;
    private int contrato;

    public jugadores() {
    }

    public jugadores(String nombre, String apellido, String nacionalidad, int edad, int numero, int contrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.numero = numero;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getP_jugados() {
        return p_jugados;
    }

    public void setP_jugados(int p_jugados) {
        this.p_jugados = p_jugados;
    }

    public int getC_ganadas() {
        return c_ganadas;
    }

    public void setC_ganadas(int c_ganadas) {
        this.c_ganadas = c_ganadas;
    }

    public int getAmarillas() {
        return amarillas;
    }

    public void setAmarillas(int amarillas) {
        this.amarillas = amarillas;
    }

    public int getRojas() {
        return rojas;
    }

    public void setRojas(int rojas) {
        this.rojas = rojas;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
