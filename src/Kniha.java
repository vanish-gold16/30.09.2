public class Kniha {
    private String nazev;
    private String jmenoAutora;
    private int cena;

    public Kniha(String nazev, String jmenoAutora, int cena){
        this.nazev = nazev;
        this.jmenoAutora = jmenoAutora;
        this.cena = cena;
    }
    public Kniha(String nazev, String jmenoAutora){
        this.nazev = nazev;
        this.jmenoAutora = jmenoAutora;
        cena = 200;
    }
    public void setNazev(String nazev){
        this.nazev = nazev;
    }
    public void setCena(int cena){
        this.cena = cena;
    }
    public void setJmenoAutora(String jmenoAutora){
        this.jmenoAutora = jmenoAutora;
    }
    public String getNazev(){
        return nazev;
    }
    public int getCena(){
        return cena;
    }
    public String getJmenoAutora(){
        return jmenoAutora;
    }

    @Override
    public String toString() {
        return "Kniha ma " +
                " nazev '" + nazev + '\'' +
                ", jmeno autora je '" + jmenoAutora + '\'' +
                ", cena: " + cena +
                "Kc";
    }
}
