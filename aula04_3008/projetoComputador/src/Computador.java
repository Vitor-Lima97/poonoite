public class Computador {
    private String marca;
    private String cor;
    private String modelo;
    private long numeroSerie;
    private double preco;

    //gets/sets

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(long numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Dados do Computador \n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Cor: " + cor + "\n" +
                "Num. Serie: " + numeroSerie + "\n" +
                "Preco: " + preco + "\n" +
                "----------------------\n";
    }

    public void calcularValor(){
        if(marca.equalsIgnoreCase("HP")){
            preco *= 1.30;
            return;
        }
        if(marca.equalsIgnoreCase("IBM")){
            preco *= 1.50;
        }
    }
    public int alterarValor(double valor) {
        if(valor > 0){
            preco = valor;
            return  1;
        }
        return 0;
    }
}
