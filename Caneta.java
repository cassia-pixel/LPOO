public class Caneta{
    String modelo;
    String cor; 
    float ponta;
    int carga;
    boolean tampada; 
    
    void rabiscar(){

    }

    void tampar() {

    }
    
    void destampar() {

    }

    void status() {
       System.out.print("Uma caneta " + this.cor);
       System.out.println(" esta tampada ? " + this.tampada);
    }
}