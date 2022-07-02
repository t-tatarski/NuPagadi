package pl.codent.nupagadi;

public class MainLoop extends Thread {

    long gameSpeed = 800;

    @Override
    public void run()
    {
        //game loop
        try {
            Thread.sleep(gameSpeed);
        } catch (InterruptedException e) {
        }
    }
}
