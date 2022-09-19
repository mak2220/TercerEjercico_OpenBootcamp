public class Main {
    public static void main(String[] args) {
        Persona marcos = new Persona();
        marcos.setEdad(39);
        marcos.setNombre("Marcos");
        marcos.setTelefono(407808);

        System.out.println(marcos.getEdad());
        System.out.println(marcos.getNombre());
        System.out.println(marcos.getTelefono());
    }

}

    class Persona{
        private int edad;
        private String nombre;
        private int telefono;
        public void setEdad(int edad){
            this.edad = edad;
        }
        public int getEdad(){
            return this.edad;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public String getNombre(){
            return this.nombre;
        }
        public void setTelefono(int telefono){
            this.telefono = telefono;
        }
        public int getTelefono(){
            return this.telefono;
        }
}








