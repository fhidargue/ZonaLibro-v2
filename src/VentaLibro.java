public class VentaLibro implements VentaLibroInterfaz{

    private String categoria;
    private String titulo;
    private String cant;
    private String cant_a1_v;
    private String cant_a2_v;
    private String cant_a3_v;
    private String cant_cf1_v;
    private String cant_cf2_v;
    private String cant_cf3_v;
    private String cant_ch1_v;
    private String cant_ch2_v;
    private String cant_ch3_v;
    private String cant_g1_v;
    private String cant_g2_v;
    private String cant_g3_v;
    private String cant_pl1_v;
    private String cant_pl2_v;
    private String cant_pl3_v;
    private String cant_pa1_v;
    private String cant_pa2_v;
    private String cant_pa3_v;
    private String cant_f1_v;
    private String cant_f2_v;
    private String cant_f3_v;

    
    public VentaLibro(){
        this.categoria="";
        this.titulo="";
        this.cant="";
        this.cant_a1_v = "53";
        this.cant_a2_v = "26";
        this.cant_a3_v = "41";
        this.cant_cf1_v ="46";
        this.cant_cf2_v ="16";
        this.cant_cf3_v ="26";
        this.cant_ch1_v ="34";
        this.cant_ch2_v ="45";
        this.cant_ch3_v ="17";
        this.cant_g1_v = "19";
        this.cant_g2_v = "21";
        this.cant_g3_v = "9";
        this.cant_pl1_v ="76";
        this.cant_pl2_v ="64";
        this.cant_pl3_v ="39";
        this.cant_pa1_v ="48";
        this.cant_pa2_v ="19";
        this.cant_pa3_v ="28";
        this.cant_f1_v = "67";
        this.cant_f2_v = "71";
        this.cant_f3_v = "51";
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getCant() {
        return cant;
    }

    @Override
    public void setCant(String cant) {
        this.cant = cant;
    }

    @Override
    public String getCant_a1_v() {
        return cant_a1_v;
    }

    @Override
    public void setCant_a1_v(String cant_a1_v) {
        this.cant_a1_v = cant_a1_v;
    }

    @Override
    public String getCant_a2_v() {
        return cant_a2_v;
    }

    @Override
    public void setCant_a2_v(String cant_a2_v) {
        this.cant_a2_v = cant_a2_v;
    }

    @Override
    public String getCant_a3_v() {
        return cant_a3_v;
    }

    @Override
    public void setCant_a3_v(String cant_a3_v) {
        this.cant_a3_v = cant_a3_v;
    }

    @Override
    public String getCant_cf1_v() {
        return cant_cf1_v;
    }

    @Override
    public void setCant_cf1_v(String cant_cf1_v) {
        this.cant_cf1_v = cant_cf1_v;
    }

    @Override
    public String getCant_cf2_v() {
        return cant_cf2_v;
    }

    @Override
    public void setCant_cf2_v(String cant_cf2_v) {
        this.cant_cf2_v = cant_cf2_v;
    }

    @Override
    public String getCant_cf3_v() {
        return cant_cf3_v;
    }

    @Override
    public void setCant_cf3_v(String cant_cf3_v) {
        this.cant_cf3_v = cant_cf3_v;
    }

    @Override
    public String getCant_ch1_v() {
        return cant_ch1_v;
    }

    @Override
    public void setCant_ch1_v(String cant_ch1_v) {
        this.cant_ch1_v = cant_ch1_v;
    }

    @Override
    public String getCant_ch2_v() {
        return cant_ch2_v;
    }

    @Override
    public void setCant_ch2_v(String cant_ch2_v) {
        this.cant_ch2_v = cant_ch2_v;
    }

    @Override
    public String getCant_ch3_v() {
        return cant_ch3_v;
    }

    @Override
    public void setCant_ch3_v(String cant_ch3_v) {
        this.cant_ch3_v = cant_ch3_v;
    }

    @Override
    public String getCant_g1_v() {
        return cant_g1_v;
    }

    @Override
    public void setCant_g1_v(String cant_g1_v) {
        this.cant_g1_v = cant_g1_v;
    }

    @Override
    public String getCant_g2_v() {
        return cant_g2_v;
    }

    @Override
    public void setCant_g2_v(String cant_g2_v) {
        this.cant_g2_v = cant_g2_v;
    }

    @Override
    public String getCant_g3_v() {
        return cant_g3_v;
    }

    @Override
    public void setCant_g3_v(String cant_g3_v) {
        this.cant_g3_v = cant_g3_v;
    }

    @Override
    public String getCant_pl1_v() {
        return cant_pl1_v;
    }

    @Override
    public void setCant_pl1_v(String cant_pl1_v) {
        this.cant_pl1_v = cant_pl1_v;
    }

    @Override
    public String getCant_pl2_v() {
        return cant_pl2_v;
    }

    @Override
    public void setCant_pl2_v(String cant_pl2_v) {
        this.cant_pl2_v = cant_pl2_v;
    }

    @Override
    public String getCant_pl3_v() {
        return cant_pl3_v;
    }

    @Override
    public void setCant_pl3_v(String cant_pl3_v) {
        this.cant_pl3_v = cant_pl3_v;
    }

    @Override
    public String getCant_pa1_v() {
        return cant_pa1_v;
    }

    @Override
    public void setCant_pa1_v(String cant_pa1_v) {
        this.cant_pa1_v = cant_pa1_v;
    }

    @Override
    public String getCant_pa2_v() {
        return cant_pa2_v;
    }

    @Override
    public void setCant_pa2_v(String cant_pa2_v) {
        this.cant_pa2_v = cant_pa2_v;
    }

    @Override
    public String getCant_pa3_v() {
        return cant_pa3_v;
    }

    @Override
    public void setCant_pa3_v(String cant_pa3_v) {
        this.cant_pa3_v = cant_pa3_v;
    }

    @Override
    public String getCant_f1_v() {
        return cant_f1_v;
    }

    @Override
    public void setCant_f1_v(String cant_f1_v) {
        this.cant_f1_v = cant_f1_v;
    }

    @Override
    public String getCant_f2_v() {
        return cant_f2_v;
    }

    @Override
    public void setCant_f2_v(String cant_f2_v) {
        this.cant_f2_v = cant_f2_v;
    }

    @Override
    public String getCant_f3_v() {
        return cant_f3_v;
    }

    @Override
    public void setCant_f3_v(String cant_f3_v) {
        this.cant_f3_v = cant_f3_v;
    }

}