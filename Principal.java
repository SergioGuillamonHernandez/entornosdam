import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de usuarios: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        
        Usuario[] usuarios = crearUsuarios(cantidad, scanner);

        System.out.println("\nLista de usuarios ingresados:");
        for (Usuario usuario : usuarios) {
            usuario.mostrarInformacion();
        }

        scanner.close();
    }

    public static Usuario[] crearUsuarios(int cantidad, Scanner scanner) {
        Usuario[] usuarios = new Usuario[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nIngrese la información del usuario " + (i + 1) + ":");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellidos: ");
            String apellidos = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            usuarios[i] = new Usuario(nombre, apellidos, email);
        }

        return usuarios;
    }
}

