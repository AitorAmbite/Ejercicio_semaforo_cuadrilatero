import javax.sound.midi.Soundbank;
import java.util.Random;

public class Luchador extends Thread{
    Cuadrilatero cuadrilatero;

    public Luchador(Cuadrilatero cuadrilatero) {
        this.cuadrilatero = cuadrilatero;
    }

    @Override
    public void run() {
        Random decidirGanador= new Random();
        Boolean ganador = true;
        cuadrilatero.entrarCuadrilatero(this);
        System.out.println(getName()+" entro en el cuadrilatero");

        try {
            sleep(decidirGanador.nextInt(3000)+1000);
            ganador = decidirGanador.nextBoolean();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName()+" he perdido");
        cuadrilatero.salirCuadrilatero(this);
    }
}
