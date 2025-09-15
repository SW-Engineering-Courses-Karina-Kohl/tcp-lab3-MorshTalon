public class Retangulo extends FiguraGeometrica {

    private double largura;
    private double altura;

    public Retangulo(String cor, double largura, double altura){
        super(cor);
        setLargura(largura);
        setAltura(altura);
    }


    public double getLargura(){
        return this.largura;
    }

    public double getAltura(){
        return this.altura;
    }


    public void setLargura(double face){
        this.largura = face;
    }

    public void setAltura(double face){
        this.altura = face;
    }

    public double calcularArea(){
        return this.largura * this.altura;
    }

    public double calcularPerimetro(){
        return this.largura + this.altura + this.largura + this.altura;
    }

    public String getTipoFigura(){
        return "Retangulo";
    }

    public String getDetalhes(){
        return String.format("Lados: %.2f\nArea: %.2f\nPerimetro: %.2f",getLado(),calcularArea(),calcularPerimetro());
    }

    public String getInfo(){
        return String.format("ID: %d, Cor: %s, Tipo: %s, Lados: %.2f, Área: %.2f, Perímetro: %.2f", getId(), getColor(),getTipoFigura(),getLado(),calcularArea(),calcularPerimetro());
    }
}