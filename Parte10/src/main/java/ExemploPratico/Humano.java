
package ExemploPratico;

public abstract class Humano {
    String nome;
    String sexo;
    int idade;
    double peso,altura;
    
    public void setNome(String nome){
        if(!nome.isEmpty()){
            this.nome = nome;
        }    
    }
    public String getNome(){
        return nome;
    }
    
    public void setSexo(String sexo){
        if(!sexo.isEmpty()){
            this.sexo = sexo;
        }
    }
    public String getSexo(){
        return sexo;
    }
    
    public void setIdade(int idade){
        if(idade>0){
            this.idade =idade;
        }
    }    
    public int getIdade(){
        return idade;
    }
    
    public void setPeso(double peso){
        if(peso>0){
            this.peso = peso;
        }
    }
    public double getPeso(){
        return peso;
    }
    

    public void setAltura(double altura){
        if(altura>0){
            this.altura = altura;
        }
    }
    public double getAltura(){
        return altura;
    }
    
    public abstract String amamentar();
    
    






}
