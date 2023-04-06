package Validaciones;
public class Validar {
    private static int i=0,fuera=0;
    
    public static boolean ValidarInt(String x){
        i=0;fuera=0;
        do{
            if(!Character.isDigit(x.charAt(i))){
                fuera=1;
            }
            i++;
        }while(i<x.length()&&fuera==0);
        return fuera==1;
    }
    public static boolean ValidarTel(String x){
        i=0;fuera=0;
        do{
            if(!(Character.isDigit(x.charAt(i)) || x.charAt(i)==32 || x.charAt(i)=='+')){
                fuera=1;
            }
            i++;
        }while(i<x.length()&&fuera==0);
        return fuera==1;
    }
    public static boolean ValidarFloat(String x){
        i=0;fuera=0;
        do{
            if(!(Character.isDigit(x.charAt(i))|| x.charAt(i)=='.')){
                fuera=1;
            }
            i++;
        }while(i<x.length()&&fuera==0);
        return fuera==1;
    }
    public static boolean ValidarEscala(String x){
        i=0;fuera=0;
        do{
            if(!(Character.isDigit(x.charAt(i)) || x.charAt(i)==':')){
                fuera=1;
            }
            i++;
        }while(i<x.length()&&fuera==0);
        return fuera==1;
    }
    public static boolean ValidarCodigos(String x){
        i=0;fuera=0;
        do{
            if(!((Character.isDigit(x.charAt(i))||Character.isAlphabetic(x.charAt(i))||x.charAt(i)=='_'||x.charAt(i)==32))){
                fuera=1;
            }
            i++;
        }while(i<x.length()&&fuera==0);
        return fuera==1;
    }
    public static boolean ValidarEmail(String x){
        i=0;fuera=0;
        do{
            if(!((Character.isDigit(x.charAt(i))||Character.isAlphabetic(x.charAt(i))||x.charAt(i)=='.'||x.charAt(i)=='@'))){
                fuera=1;
            }
            i++;
        }while(i<x.length()&&fuera==0);
        return fuera==1;
    }
    public static boolean ValidarLine(String x){
        i=0;fuera=0;
        do{
            if(!(Character.isAlphabetic(x.charAt(i))||x.charAt(i)==32)){
                fuera=1;
            }
            i++;
        }while(i<x.length()&&fuera==0);
        return fuera==1;
    }
}