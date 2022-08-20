
package Classes;

public class Pessoa {
    
    //Atributos
    
    private float peso;
    private float altura;
    
    //METODO CONSTRUTOR
    //É opcional, usado para passar valores padrões
    public Pessoa(float peso, float altura){
        this.peso = peso;
        this.altura = altura;
//        System.out.println("Executando metodo construtor");;;
    }
    
    public float calcularIMC(){
    
        float imc = peso / (altura * altura);
        
        return imc;
    }
    
    //Metodo acessores
    public void setPeso(float peso){
       this.peso = peso;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public float getAltura(){
    return altura;
    }
}
