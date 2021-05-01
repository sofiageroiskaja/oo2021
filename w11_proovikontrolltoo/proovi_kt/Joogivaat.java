public class Joogivaat{
    double ruumala; 
    double kogus_liitrites;
    Jook jook;
    Joogipudel pudel;

    public Joogivaat(double ruumala, double kogus_liitrites, Jook jook){
        this.ruumala = ruumala;
        this.kogus_liitrites = kogus_liitrites;
        this.jook = jook;
    }

    public void taidaPudel(Joogipudel pudel) {
        if(kogus_liitrites > pudel.maht){
            kogus_liitrites = kogus_liitrites - pudel.maht;
        }else{
            System.out.println("Vabandust, jooki pole piisavalt");
        }
    }

    public int vaaditaieVillimine(Joogipudel pudel) {
        int n = 0;
        while(kogus_liitrites >= pudel.maht){
            n += 1;
            kogus_liitrites -= pudel.maht;
        }
        return n;
    }

}