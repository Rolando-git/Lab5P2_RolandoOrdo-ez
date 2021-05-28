package Principal;

public class psicologos {

    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int edad;
    private String titulo;
    private String ID;
    private String especialidad;
    private int informes = 0;
    private int j_atendidos = 0;

    public psicologos() {
    }

    public psicologos(String nombre, String apellido, String nacionalidad, int edad, String titulo, String ID, String especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.titulo = titulo;
        this.ID = ID;
        this.especialidad = especialidad;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getInformes() {
        return informes;
    }

    public void setInformes(int informes) {
        this.informes = informes;
    }

    public int getJ_atendidos() {
        return j_atendidos;
    }

    public void setJ_atendidos(int j_atendidos) {
        this.j_atendidos = j_atendidos;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
