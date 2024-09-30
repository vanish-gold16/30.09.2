public class Zvire {
    String druh;
    int hmotnostPotravy;

    public Zvire(String druh){
        this.druh = druh;
        hmotnostPotravy = 100;
    }
    public Zvire(String druh, int hmotnostPotravy){
        this.druh = druh;
        this.hmotnostPotravy = hmotnostPotravy;
    }
    public void setDruh(String druh){
        this.druh = druh;
    }
    public void setHmotnostPotravy(int hmotnostPotravy){
        this.hmotnostPotravy = hmotnostPotravy;
    }
    public String getDruh(){
        return druh;
    }
    public int getHmotnostPotravy(){
        return hmotnostPotravy;
    }

    @Override
    public String toString() {
        return "Zvire ma " +
                "druh '" + druh + '\'' +
                ", hmotnostPotravy je " + hmotnostPotravy +
                " kg";
    }
}
