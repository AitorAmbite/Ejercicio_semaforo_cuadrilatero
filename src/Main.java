public class Main {
    public static void main(String[] args) {
        Cuadrilatero cuadrilatero = new Cuadrilatero();
        for(int i = 0;i<10;i++){
            Luchador luchador = new Luchador(cuadrilatero);
            luchador.setName("Luchador "+i);
            luchador.start();
        }
    }
}
