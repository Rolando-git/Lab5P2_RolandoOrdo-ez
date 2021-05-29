package Principal;

public class preparadores {

    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int edad;
    private String ID;
    private int c_ganadas = 0;
    private String especialidad;
    private String n_titulo;

    public preparadores() {
    }

    public preparadores(String nombre, String apellido, String nacionalidad, int edad, String ID, String especialidad, String n_titulo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.ID = ID;
        this.especialidad = especialidad;
        this.n_titulo = n_titulo;
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

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getC_ganadas() {
        return c_ganadas;
    }

    public void setC_ganadas(int c_ganadas) {
        this.c_ganadas = c_ganadas;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getN_titulo() {
        return n_titulo;
    }

    public void setN_titulo(String n_titulo) {
        this.n_titulo = n_titulo;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public String cadena() {
        return "preparadores{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", edad=" + edad + ", ID=" + ID + ", c_ganadas=" + c_ganadas + ", especialidad=" + especialidad + ", n_titulo=" + n_titulo + '}';
    }
}
