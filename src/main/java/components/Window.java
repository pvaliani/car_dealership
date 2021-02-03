package components;

public class Window {

    private boolean isTinted;

    public Window(){
        this.isTinted = false;
    }

    public boolean isTinted() {
        return isTinted;
    }

    public void setTinted(){
        this.isTinted = true;
    }
}
