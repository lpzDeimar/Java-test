public class Direccion {

    private String calle;
    private String vecindario;
    private String ciudad;
    private int codigoPostal;

    public Direccion(String calle, String vecindario, String ciudad, int codigoPostal) {
        this.calle = calle;
        this.vecindario = vecindario;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getVecindario() {
        return vecindario;
    }

    public void setVecindario(String vecindario) {
        this.vecindario = vecindario;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
