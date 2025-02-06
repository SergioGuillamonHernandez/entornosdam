public class Usuario {
    public String nombre;
    public String apellidos;
    public String email;

    // Constructor
    public Usuario(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    // Método para mostrar la información del usuario
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Email: " + email);
        System.out.println("-----------------------------");
    }
}

