
package modelos;


public class Empleado {
    


   
    protected long id; 
    private String nombre; 
    private String apellido;
    private String correo;
    private String celular;
    private  Boolean esProveedor;
    private  String salario;
    private String cargo;

    
    
    //MÉTODOS
    
    public Empleado(){};
    
    public Empleado(String nombre, String correo, String celular, String salario) {
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
        this.salario = salario;
    }

    public Empleado(String nombre, String apellido, String correo, String celular, Boolean esProveedor, String salario, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.celular = celular;
        this.esProveedor = esProveedor;
        this.salario = salario;
        this.cargo = cargo;
    }

    public Empleado(long id, String nombre, String apellido, String correo, String celular, Boolean esProveedor, String salario, String cargo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.celular = celular;
        this.esProveedor = esProveedor;
        this.salario = salario;
        this.cargo = cargo;
    }

    
    
    
    //Getters and Setters
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Boolean getEsProveedor() {
        return esProveedor;
    }

    public void setEsProveedor(Boolean esProveedor) {
        this.esProveedor = esProveedor;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
    
}
