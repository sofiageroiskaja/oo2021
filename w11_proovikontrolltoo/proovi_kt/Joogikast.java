public class Joogikast {
    String kasti_tyyp;
    double kasti_hind;
    double kasti_mass;
    int pesade_arv;
    int n;

    public Joogikast(String kasti_tyyp, double kasti_hind, double kasti_mass, int pesade_arv){
        this.kasti_tyyp = kasti_tyyp;
        this.kasti_hind = kasti_hind;
        this.kasti_mass = kasti_mass;
        this.pesade_arv = pesade_arv;
    }

    public double kastiUhineMass(Joogipudel pudel){
        double kasti_mass = (n * pudel.pudeliMass()) + this.kasti_mass;

        return kasti_mass;
    }

    public double kastiOmahind(Joogipudel pudel){
        double kasti_hind = (n * pudel.pudeliOmahind()) + this.kasti_hind;
        
        return kasti_hind;
    }

    public void lisaPudelid(Joogipudel pudel){
        n += 1;
    }

    public void lisaPudelid(Joogivaat vaat, Joogipudel pudel){
        while(vaat.kogus_liitrites >= pudel.maht){
            vaat.kogus_liitrites -= pudel.maht;
            n += 1;
        }

        if(n >= pesade_arv){
            n = pesade_arv;
            System.out.println("Kast on tais!");
        }
    }
}