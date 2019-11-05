/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemploPratico;

/**
 *
 * @author Cakeb
 */
public class Mulher extends Humano {

    boolean gravidez;
    double busto, cintura;

    public Mulher() {
        this.sexo = "Feminino";
    }

    public void setGravidez(boolean gravidez) {
        this.gravidez = gravidez;
    }

    public boolean getGravidez() {
        return gravidez;
    }

    public void setBusto(double busto) {
        this.busto = busto;
    }

    public double getBusto() {
        return busto;
    }

    public void setCintura(double cintura) {
        this.cintura = cintura;
    }

    public double getCintura() {
        return cintura;
    }

    public String amamentar() {
        return "Mulheres usam os seios!";
    }

}
