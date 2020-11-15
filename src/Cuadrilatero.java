import java.util.concurrent.Semaphore;

public class Cuadrilatero {
    private final int MAX_LUCHADORES=2;
    Semaphore luchadoresIn = new Semaphore(MAX_LUCHADORES,true);

    public void entrarCuadrilatero(Luchador luchador){
        try {
            luchadoresIn.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void salirCuadrilatero(Luchador luchador){
        luchadoresIn.release();
    }

}
