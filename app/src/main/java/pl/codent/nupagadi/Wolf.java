package pl.codent.nupagadi;

public class Wolf {
    static WOLF_POS wolf_pos=WOLF_POS.LU;
    float posX;
    float posY;
    boolean visible;

    public Wolf(float posX, float posY, boolean visible) {
        this.posX = posX;
        this.posY = posY;
        this.visible = visible;
    }

    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
