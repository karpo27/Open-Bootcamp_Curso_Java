public class Main {

    /* Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
    */
    public static void main(String[] args) {
        double precioIVA = getPrecioIVA(326.22);
        System.out.println(precioIVA);
    }


    static double getPrecioIVA(double precio){
        double IVA = 1.21;
        return precio * IVA;
    }
}