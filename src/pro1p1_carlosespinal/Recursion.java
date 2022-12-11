
package pro1p1_carlosespinal;


public class Recursion {
    /*
    En el siguiente metodo recursivo, este mismo toma una String la cual debe de ser una string
    que contenga un numero binario. Si el length de esta no es 0, comienza a hacer el proceso.
    Toma el primer digito de esta string por cada vez que hace el proceso, y multiplica ese
    numero obtenido por 2 elevado a longitud de la subtring creada al sacar el digito siendo
    evaluado. Esto simulando el proceso de conversion de binario a decimal. Este proceso se
    repite hasta que ya haya recorrido toda la string binaria. Y como resultado, el numero
    en decimal.
    */
    public static int binAdec(String bin) {
       int dec = 0;
       int length = bin.length();
       if (length > 0) {
           String ss = bin.substring(1);
           int digito = Character.getNumericValue(bin.charAt(0));
           dec = digito*(int)Math.pow(2,length - 1)+binAdec(ss);
       }
       return dec;
    }
    
    public static int decAbin(int dec) {
        if (dec == 0) {
            return 0;
        }
        else
            return ((dec%2)+10*decAbin(dec/2));
    }
    
}
