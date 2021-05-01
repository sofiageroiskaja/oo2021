public class Joogipudel{
    double maht;
    double taara_maksumus;
    String pudeli_tyyp;
    Jook jook;

    public Joogipudel(String pudeli_tyyp, double maht, double taara_maksumus, Jook jook){
        this.pudeli_tyyp = pudeli_tyyp;
        this.maht = maht;
        this.taara_maksumus = taara_maksumus;

        if(jook != null){
            this.jook = jook;
        }else{
            this.jook = new Jook("Fanta", 1.1, 0.5);
        }
    }

    public void lisaJook(Jook seesJook) {
        jook = seesJook;
    }

    public double pudeliMass(){
        double mass = this.jook.erikaal * maht;
        String joogi_nimetus = this.jook.nimetus;

        return mass;
    }

    public double pudeliOmahind(){
        double omahind = (maht / 1000 * this.jook.liitri_omahind) + taara_maksumus;

        return omahind;
    }
}
