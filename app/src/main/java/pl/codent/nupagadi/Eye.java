package pl.codent.nupagadi;

public class Eye {
    static int move=0;
    int eyeNr;
    int step;
    boolean visible;

    public Eye(int eyeNr, int step, boolean visible) {
        this.eyeNr = eyeNr;
        this.step = step;
        this.visible = visible;
    }

    public int getEyeNr() {
        return eyeNr;
    }

    public void setEyeNr(int eyeNr) {
        this.eyeNr = eyeNr;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
