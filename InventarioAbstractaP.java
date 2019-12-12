public abstract class InventarioAbstractaP {
    
    protected String id;
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String telefono;
    protected String correo;
    
    public abstract String getId();
    public abstract void setId(String id);
    public abstract String getNombre();
    public abstract void setNombre(String nombre);
    public abstract String getApellido();
    public abstract void setApellido(String apellido);
    public abstract String getCedula();
    public abstract void setCedula(String cedula);
    public abstract String getTelefono();
    public abstract void setTelefono(String telefono);
    public abstract String getCorreo();
    public abstract void setCorreo(String correo);
}
