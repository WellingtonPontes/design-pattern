/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wellg
 */
public class Fila {

  private String documento;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void imprimirDocumento(){
        System.out.println(getDocumento());
    }
   public void RemoverDocumento( String documento){
        if(documento == getDocumento()){
           setDocumento(null);
        }
    }
   public void EcluirTodos(){
       setDocumento(null);
    }

  private static Fila instancia;

  private Fila(){

}
     public static Fila getInstance(){
       if(instancia==null){
          instancia = new Fila();
        }
      return instancia;
};
    
}
