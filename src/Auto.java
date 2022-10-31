public class Auto {
    private int modelo;
    private String Color;
    private int anno;
    private Marca marca;
    private int chasis;
    private Propietario  propietario;
    private int velMax;
    private int velAct = 0;
    private int nPuertos;
    private boolean tieneTecho;
    private int nMarchas;
    private int marchaAct = 0;
    private  boolean transmisiónAuto;

    public Auto(Propietario propietario,Marca marca) {
        this.propietario = propietario;
        this.marca = marca;
    }

    public Auto(int modelo, String color, int anno, Marca marca, int chasis, Propietario propietario, int velMax, int nPuertos, boolean tieneTecho, int nMarchas, boolean transmisiónAuto) {
        this.modelo = modelo;
        Color = color;
        this.anno = anno;
        this.marca = marca;
        this.chasis = chasis;
        this.propietario = propietario;
        this.velMax = velMax;
        this.nPuertos = nPuertos;
        this.tieneTecho = tieneTecho;
        this.nMarchas = nMarchas;
        this.transmisiónAuto = transmisiónAuto;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getChasis() {
        return chasis;
    }

    public void setChasis(int chasis) {
        this.chasis = chasis;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public int getVelAct() {
        return velAct;
    }

    public void setVelAct(int velAct) {
        this.velAct = velAct;
    }

    public int getnPuertos() {
        return nPuertos;
    }

    public void setnPuertos(int nPuertos) {
        this.nPuertos = nPuertos;
    }

    public boolean isTieneTecho() {
        return tieneTecho;
    }

    public void setTieneTecho(boolean tieneTecho) {
        this.tieneTecho = tieneTecho;
    }

    public int getnMarchas() {
        return nMarchas;
    }

    public void setnMarchas(int nMarchas) {
        this.nMarchas = nMarchas;
    }

    public int getMarchaAct() {
        return marchaAct;
    }

    public void setMarchaAct(int marchaAct) {
        this.marchaAct = marchaAct;
    }

    public boolean isTransmisiónAuto() {
        return transmisiónAuto;
    }

    public void setTransmisiónAuto(boolean transmisiónAuto) {
        this.transmisiónAuto = transmisiónAuto;
    }


    public void aceleracion (){
        if(this.velAct<this.velMax){
            this.velAct ++;
        }
    }

    public void desaceleracion (){
        if(this.velAct>0){
            this.velAct --;
        }
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public void subirMarcha (){
        if(!this.transmisiónAuto && this.marchaAct<this.nMarchas){
            this.marchaAct ++;
        }
    }

    public void bajarMarcha (){
        if(!transmisiónAuto && marchaAct<nMarchas){
            if(this.marchaAct>0){
                this.marchaAct --;
            }
        }
    }

}
