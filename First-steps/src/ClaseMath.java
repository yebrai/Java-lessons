public class ClaseMath {
    public static void main(String[] args) {

        double raiz = Math.sqrt(9);

        System.out.println(raiz);

        float num1=5.85F;

        long resultado=Math.round(num1);

        System.out.println(resultado);

        //Refundiciones
        
        int raizTest =(int)Math.round(num1);

        //Pow

        double base=5;
        double exponente = 3;

        int resultado2=(int)Math.pow(base, exponente);
        
        System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado2);
        
    }
}
