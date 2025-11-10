package bridge.enemy;

import bridge.figther.Figther;

public abstract class Enemy {

    protected int health;

    public Figther getFigther() {
        return figther;
    }

    public void setFigther(Figther figther) {
        this.figther = figther;
    }

    protected Figther figther;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
