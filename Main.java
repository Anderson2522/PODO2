public class Main {
    public static void main(String[] args) {
        //Usuario 
        Usuario usuario1 = new Usuario("Anderson", "Escalante1", 16,2008);
        Usuario usuario2 = new Usuario("Victor", "Jimenez", 16, 2008);

        //Metodos del objeto
        usuario1.mostrarDatos();
        usuario2.mostrarDatos();
        
        System.out.println(usuario1.getEdad());
        System.out.println(usuario1.getNombre());
        System.out.println(usuario1.getApellidos());
        System.out.println(usuario1.getfechaNacimiento());
        
    }
}