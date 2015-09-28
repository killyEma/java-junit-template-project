package helloWorld;


public class Cronometro(){
  private int minutos;
  private int segundos;
  
  public void reiniciar(){
    minutos=0;
    segundos=0;
  }
  
  public void mostrar(){
    
  }

  public void aumentar(){
    segundos++;
    if(segundos ==60){
      minutos++;
      segundos=0;
    }
  }

}
