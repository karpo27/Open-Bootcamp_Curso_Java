public class Main {

    /* En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
    Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
    String[] nombres = {"", "", "", ""} */
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Alberto", "Carlos", "Julian"};
        String resultado = "";
        for (String item:nombres){
            resultado += item + " " ;
        }

        System.out.println(resultado);
    }
}