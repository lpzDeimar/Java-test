public class Auto {
    private int modelo;
    private String Color;
    private int anno;
    private Marca marca;
    private int chasis;
    private Propietario  propietario;
    private int velMax;
    private int velAct;
    private int nPuertos;
    private boolean tieneTecho;
    private int nMarchas;
    private int marchaAct;
    private  boolean transmisiónAuto;

    public Auto(Propietario propietario,Marca marca) {
        this.propietario = propietario;
        this.marca = marca;
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
        if(velAct<velMax){
            velAct ++;
        }
    }

    public void desaceleracion (){
        if(velAct<0){
            velAct --;
        }
    }

    public void subirMarcha (){
        if(!transmisiónAuto && marchaAct<nMarchas){
            marchaAct ++;
        }
    }

    public void bajarMarcha (){
        if(!transmisiónAuto && marchaAct<nMarchas){
            marchaAct ++;
        }
    }

}
