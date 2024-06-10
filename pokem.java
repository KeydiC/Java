//Keydi Giselle Ceron De Angel
//En este codigo piden datos del pokemon y se pueden mandar ataques, alimentarlo y evolucionarlo, cambiando los datos del pokemon y mostrando todos los datos capturados
class Main {
  public static void main(String[] args) {
    Pokemon Poke = new Pokemon();
    int opc;
    do{
      System.out.println("\nElige una opcion para tu pokemon\n1-Atacar\n2-Alimentar\n3-Evolucionar\n4-Ficha\n5-Salir");
      opc=Integer.parseInt(System.console().readLine("Opcion: "));
      if(opc==1){
        Poke.Atacar();
      }else if(opc==2){
        Poke.Alimentar();
      }else if(opc==3){
        Poke.Evolucionar();
      }else if(opc==4){
        Poke.Pokedex();
      }else{
        break;
      }
    }while(opc!=5);
    
  }
}
public class Pokemon{
  String nombre, genero, color;
  int nivel, numero;
  float peso, tamano;
  String[] tipo = new String[2];
  String[] ataques = new String[4];
  
  public Pokemon(){
    this.nombre=System.console().readLine("Ingrese el nombre del pokemon: ");
    this.tipo[0]=System.console().readLine("Cual es el tipo del pokemon: ");
    int opc;
    opc=Integer.parseInt(System.console().readLine("El pokemon tiene un segundo tipo? Si(coloque 1), No(coloque 2): "));
if(opc==1){
  this.tipo[1]=System.console().readLine("Cual es el segundo tipo del pokemon?: ");
}
    this.color=System.console().readLine("Cual es el color del pokemon?: ");
    this.genero=System.console().readLine("Cual es el genero del pokemon?: ");
    this.nivel=Integer.parseInt(System.console().readLine("Cual es el nivel del pokemon?: "));
    this.numero=Integer.parseInt(System.console().readLine("Cual es el numero del pokemon?: "));
    this.peso=Float.parseFloat(System.console().readLine("Cual es el peso del pokemon?: "));
    this.tamano=Float.parseFloat(System.console().readLine("Cual es el tamaño del pokemon?: "));
    for(int i=0;i<4;i++) {
      this.ataques[i]=System.console().readLine("Ingrese el ataque "+(i+1)+": ");
  }
}
  
   public void Atacar(){
        System.out.println("\nAtaques\n");
          for(int i=0;i<4;i++){
            System.out.println((i + 1) + "-" +this.ataques[i]);
        }
        int opc;
        do{
            opc=Integer.parseInt(System.console().readLine("Elige un ataque: \n"));
        }while(opc<1||opc>4);
      switch(opc){
        case 1:{
          System.out.println("\nSe ha lanzado el ataque "+this.ataques[0]);
          break;}
        case 2:{
           System.out.println("\nSe ha lanzado el ataque "+this.ataques[1]);
          break;}
        case 3:{
          System.out.println("\nSe ha lanzado el ataque "+this.ataques[2]);
          break;}
        case 4:{
          System.out.println("\nSe ha lanzado el ataque "+this.ataques[3]);
          break;}
        default:{
            break;
          }
      }
  }
  
public void Alimentar(){
  System.out.println("\nElige una de las bayas para alimentar a tu pokemon\n\n1-Baya Zidra\n2-Baya Ziuela\n3-Baya Lichi");
  int opc;
  do{
  opc=Integer.parseInt(System.console().readLine("\nElige una baya: \n"));
  }while(opc<1||opc>3);
  switch(opc){
    case 1:{
      System.out.println("Se alimento a tu pokemon con la baya Zidra");
      break;
    }
     case 2:{
        System.out.println("Se alimento a tu pokemon con la baya Ziuela");
        break;
      }
    case 3:{
        System.out.println("Se alimento a tu pokemon con la baya Lichi");
        break;
      }
    default:{
      break;
    }
  }
}
  
public void Pokedex(){
  System.out.println("\n\nPOKEMON: "+this.nombre+"\n\nNombre: "+this.nombre+"\nNivel: "+this.nivel+"\nColor: "+this.color+"\nPeso: "+this.peso+"\nTamano: "+this.tamano+"\nGenero: "+this.genero+"\nAtaques:");  
  for(int i=0;i<4;i++){
      System.out.print(" "+this.ataques[i]);
  }
  System.out.println("\nTipo: ");
  for(int i=0;i<2;i++){
    System.out.print(" " +this.tipo[i]);
  }
  System.out.println("\n");
  }
public void Evolucionar(){
 String opc;
  opc=System.console().readLine("\nTu pokemon tiene evolucion? s/n: ");
  if(opc.equals("n")||opc.equals("N")){
    this.nombre=System.console().readLine("Nombre del pokemon evolucionado: ");
    this.peso=Float.parseFloat(System.console().readLine("Peso del pokemon evolucionado: "));
    this.tamano=Float.parseFloat(System.console().readLine("Tamano del pokemon evolucionado: "));
    for(int i=0;i<4;i++){
      this.ataques[i]=System.console().readLine("Ingresa el ataque "+(i+1)+": ");
  }
  }else{
    System.out.println("Tu pokemon ya ha sido evolucionado");
  }
  
  }
                     
}
  
