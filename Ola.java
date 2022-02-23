public class Ola {
    public static int soma (int a, int b) {
        return a + b;
    }
    public static void main(String[] args){
        System.out.println("Olá Mundo!!!");
        System.out.println(soma(17, 5)); 

        //dado boolean= verdadeiro ou falso
        boolean bol = true;// boolean ocupa 1 bit
        char ch = 'a'; //char ocupa 16 bits
        //em sites grandes excesso de bits pode fazer com  que o site caia
        // char utiliza 'aspas simples' 
        byte intB = 2; // aceita entre -128 e 127 caracteres
        short intS = 200;
        int intN = 1000;
        long intL = 2000;
        float fNum = 2.5f;
        double dNum = 2.5;
        


        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        
    
    }
} 
  