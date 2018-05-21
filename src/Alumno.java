public class Alumno {
    private int id;
    private String dni;
    private String nombre;
    private String apellido;
    private double promedio;

    public Alumno(){

    }

    public Alumno(String dni, String nombre, String apellido, double promedio){
        super();
        this.dni= dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.promedio=promedio;
        id= Integer.parseInt(dni);

    }

    public String toString() {
        return "ID: "+this.id+"\nDNI: "+this.dni+"\nApellido: "+
                this.apellido+"\nNombre: "+this.nombre+"\nPromedio :"+this.promedio ;
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
