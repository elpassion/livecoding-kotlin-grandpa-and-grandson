package com.elpassion;

public class Grandson {

    private boolean cocky;

    public boolean isCocky() {
        return cocky;
    }

    public void setCocky(boolean cocky) {
        this.cocky = cocky;
    }

    public Grandson(boolean cocky) {
        this.cocky = cocky;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grandson grandson = (Grandson) o;

        return cocky == grandson.cocky;

    }

    @Override
    public int hashCode() {
        return (cocky ? 1 : 0);
    }

    @Override
    public String toString() {
        return "Grandson{" +
                "cocky=" + cocky +
                '}';
    }
}
