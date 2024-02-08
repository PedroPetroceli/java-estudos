public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) {
       for (int i = 0; i <= 10; i++){
           int resultado = i * numero;
           System.out.println(numero + "x" + i + "=" + resultado);

       }
    }
}
