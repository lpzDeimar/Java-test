public class Marca {
    private String name;
    private int anno;
    private String codigoIdentificador;

    public Marca(String name, int anno, String codigoIdentificador) {
        this.name =name;
        this.anno = anno;
        this.codigoIdentificador = codigoIdentificador;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }
}
