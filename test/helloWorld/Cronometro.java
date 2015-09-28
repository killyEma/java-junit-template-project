package helloWorld;


public class Cronometro(){
  private int minutos;
  private int segundos;
  
  public void reiniciar(){
    minutos=0;
    segundos=0;
  }
  
  public int getSegundos(){
    return segundos;
  }
  
  public int getMinutos(){
    return minutos;
  }

  public void aumentar(){
    segundos++;
    if(segundos ==60){
      minutos++;
      segundos=0;
    }
  }

}
