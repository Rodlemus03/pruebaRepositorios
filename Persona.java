public class Persona {
    private int edad;
    private String nombre;
    private String apellidos;
    private String profesion;
    public Persona(int edad, String nombre, String apellidos, String profesion){
        this.edad=edad;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.profesion=profesion;
    }


    @Override
    public String toString() {
        return "{" +
            " edad='" + getEdad() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", apellidos='" + getApellidos() + "'" +
            ", profesion='" + getProfesion() + "'" +
            "}";
    }


    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getProfesion() {
        return this.profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

}
