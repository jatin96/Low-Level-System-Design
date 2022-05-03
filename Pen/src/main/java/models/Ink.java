package models;

public class Ink {
    private Color color;
    private boolean isErasable;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isErasable() {
        return isErasable;
    }

    public void setErasable(boolean erasable) {
        isErasable = erasable;
    }
}
