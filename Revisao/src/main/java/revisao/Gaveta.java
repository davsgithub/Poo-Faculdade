
package revisao;

public class Gaveta {
    private double comprimento;
    private double largura;
    private double altura; 
    private double volume;
    
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
    public void setVolume(double volume) {
        if (volume > 0) {
            this.volume = volume;
        }
    }
    public void setVolume(){
        volume = 0;
    }
    public double getVolume(){
        return volume;
    }
    














}
