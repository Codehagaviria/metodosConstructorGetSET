public class GastosDiarios {
  //Crear variables: atributos; segun modificación de acceso : public, private, protected
    private String id;
    private String nombre;
    private String email;
    private String password;

  //Crear el metodo Constructor, this accede al atributO.
    public GastosDiarios(String id,String nombre,String email,String password) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }
  //Crear los metodos GET y SET..EN ORDEN COMO SE DEFINIERON LOS ATRIBUTOS
    //METODO GET
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    //METODO SET
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
  //Crear metodo ppal para mostrar la información MAIN
    public static void main(String[] args) {
        GastosDiarios gastosDiarios = new GastosDiarios("1001","Alejandro","hagavm@gmail.com","G123456");
        System.out.println("El ID es " + gastosDiarios.getId());
        System.out.println("El nombre es :" + gastosDiarios.getNombre());
        System.out.println("El correo es: " + gastosDiarios.getEmail());
    }
}
