package pl.codent.nupagadi;

import android.util.Log;

public class MainLoop extends Thread {

    protected static boolean playGame=true;
    long gameSpeed = 1100;

    @Override
    public void run() {
        //game loop
        while (true) {
            if(playGame) {
                Eye.move++;
                if (Eye.move > 5) Eye.move = 0;

                Log.d("running loop", "loop running " + Eye.move);
                try {
                    Thread.sleep(gameSpeed);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
