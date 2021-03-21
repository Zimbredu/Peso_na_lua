/*
Chame este programa de CalcPesoNaLua
*/

class  CalcPesoNaLua{
 public static void main(String args[]){
 
 double weight = 0;  // peso em inglês.
 double bodyMass = 61.0;  // mass corpórea em inglês
 final  double  gravityOnTheMoon = 1.6; // tradução: gravidade na lua.
 
  weight = bodyMass * gravityOnTheMoon;
  System.out.println(weight + " Is the my weight on the moon!");
 
 }
 
}
