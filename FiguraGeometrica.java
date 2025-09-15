private abstract class FiguraGeometrica implements CalculosGeometricos {
    private string cor;
    private int id;
    private static int totalFiguras = 0;

    public FiguraGeometrica(String cor) {
        this.totalFiguras++;
        this.id = totalFiguras;
        this.cor = cor;
    }

    public String getColor(){
        return this.cor;
    }

    public int getId(){
        return this.id;
    }

    public void setColor(String color){
        this.cor = color;
    }

    private static getTotalFiguras(){
        return totalFiguras;
    }

    public String getInfo(){
        return String.format("ID: %d, Cor: %s", getId(), getColor());
    }
}