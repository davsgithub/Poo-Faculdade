package revisao;

public class Movel {

    protected double comprimento;
    protected double largura;
    protected double altura;
    protected double preco;
    protected String cor;

    public void setComprimento(double comprimento) {
        if (comprimento > 0) {
            this.comprimento = comprimento;
        }
    }
    public void setComprimento(){
        comprimento = 0;
    }    
    public double getComprimento(){
        return comprimento;
    }

    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        }
    }
    
    public void setLargura(){
        largura = 0;
    }
    
    public double getLargura(){
        return largura;
    }
    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }
    public void setAltura(){
        altura = 0;
    }

    public double getAltura(){
        return altura;
    }
    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }
    public void setPreco(){
        preco = 0;
    }
    public double getPreco(){
        return preco;
    }

    public void setCor(String cor) {
        if (!cor.isEmpty()) {
            this.cor = cor;
        }
    }
    public void setCor(){
        cor = "";
    }
    public String getCor(){
        return cor;
    }
    
            
}
