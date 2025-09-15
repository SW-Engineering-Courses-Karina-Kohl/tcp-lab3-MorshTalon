public class TrianguloEquilatero extends FiguraGeometrica {

    private double lado;

    public TrianguloEquilatero(String cor, double lado){
        super(cor);
        setLado(lado);
    }

    public double getLado(){
        return this.lado;
    }

    public void setLado(double face){
        this.lado = face;
    }

    public double calcularArea(){
        area = Math.sqrt(3);
        area = area/4;
        face = this.lado * this.lado;
        area = area * face;
        return area;
    }

    public double calcularPerimetro(){
        return this.lado * 3;
    }

    public String getTipoFigura(){
        return "Triangulo Equilatero";
    }

    public String getDetalhes(){
        return String.format("Lados: %.2f\nArea: %.2f\nPerimetro: %.2f",getLado(),calcularArea(),calcularPerimetro());
    }

    public String getInfo(){
        return String.format("ID: %d, Cor: %s, Tipo: %s, Lados: %.2f, Área: %.2f, Perímetro: %.2f", getId(), getColor(),getTipoFigura(),getLado(),calcularArea(),calcularPerimetro());
    }
}