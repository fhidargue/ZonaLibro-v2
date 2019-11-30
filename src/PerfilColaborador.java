public class PerfilColaborador implements PerfilColaboradorInterfaz{
    
    private String u = "";
    private String c = "";
    private String u_felipe = "fhidargue";
    private String c_felipe = "f123";
    private String u_frank = "franklin";
    private String c_frank = "f123";
    private String u_melissa = "meliguz";
    private String c_melissa = "m123";
    
    public PerfilColaborador(){
        this.u="";
        this.c="";
        this.u_felipe = "fhidargue";
        this.c_felipe = "f123";
        this.u_frank = "franklin";
        this.c_frank = "f123";
        this.u_melissa = "meliguz";
        this.c_melissa = "m123";
    }

    @Override
    public String getU() {
        return u;
    }

    @Override
    public void setU(String u) {
        this.u = u;
    }

    @Override
    public String getC() {
        return c;
    }

    @Override
    public void setC(String c) {
        this.c = c;
    }

    @Override
    public String getU_felipe() {
        return u_felipe;
    }

    @Override
    public void setU_felipe(String u_felipe) {
        this.u_felipe = u_felipe;
    }

    @Override
    public String getC_felipe() {
        return c_felipe;
    }

    @Override
    public void setC_felipe(String c_felipe) {
        this.c_felipe = c_felipe;
    }

    @Override
    public String getU_frank() {
        return u_frank;
    }

    @Override
    public void setU_frank(String u_frank) {
        this.u_frank = u_frank;
    }

    @Override
    public String getC_frank() {
        return c_frank;
    }

    @Override
    public void setC_frank(String c_frank) {
        this.c_frank = c_frank;
    }

    @Override
    public String getU_melissa() {
        return u_melissa;
    }

    @Override
    public void setU_melissa(String u_melissa) {
        this.u_melissa = u_melissa;
    }

    @Override
    public String getC_melissa() {
        return c_melissa;
    }

    @Override
    public void setC_melissa(String c_melissa) {
        this.c_melissa = c_melissa;
    }
    
    
}
