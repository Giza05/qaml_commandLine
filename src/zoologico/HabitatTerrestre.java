package zoologico;

abstract class HabitatTerrestre {

    //private String type;
    private String nombreanimal;
    private String tipoanimal;
    private double altura;
    private double peso;
    private String habitat = "Habitat Terrestre";

    public String getNombreanimal() {
        return nombreanimal;
    }

    public void setNombreanimal(String nombreanimal) {
        this.nombreanimal = nombreanimal;
    }

    public String getTipoanimal() {
        return tipoanimal;
    }

    public void setTipoanimal(String tipoanimal) {
        this.tipoanimal = tipoanimal;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHabitat() {
        return habitat;
    }

    public void infoHabitatTerrestre() {
    System.out.println("Este habitat esta reservado para animales mamiferos terrestres");
    }
    public void TipoDeDesplazamiento(){
        this.nombreanimal = getNombreanimal();
        System.out.println("El " +nombreanimal+" camina o corre con sus patas para desplazarse");
    }

    public void TipoDeDieta() {
        this.nombreanimal = getNombreanimal();
        System.out.println("El "+nombreanimal+" es un animal carnivoro");
    }

}
