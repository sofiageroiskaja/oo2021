public class Proov{
    public static void main(String[] arg) {
        Jook fanta = new Jook("Fanta", 1.1, 0.5);

        Joogipudel klaas_pudel = new Joogipudel("Klaaspudel", 0.2, 0.1, fanta);
        
        Joogivaat vaat1 = new Joogivaat(5, 100, fanta);
        
        Joogikast kast1 = new Joogikast("Puu", 13.2, 3.0, 12);

        System.out.println("Joogi nimetus: " + fanta.nimetus);
        System.out.println("Joogipudeli mass: " + klaas_pudel.pudeliMass());
        System.out.println("Joogipudeli omahind: " + klaas_pudel.pudeliOmahind());
        System.out.println("Vaadis sees oleva joogi kogus liitrites: " + vaat1.kogus_liitrites);
        vaat1.taidaPudel(klaas_pudel);
        System.out.println("Vaadis sees oleva joogi uus kogus liitrites: " + vaat1.kogus_liitrites);
        System.out.println("Täidetud pudelite number:" + vaat1.vaaditaieVillimine(klaas_pudel));
        System.out.println("Jääk vaadis: " + vaat1.kogus_liitrites);
        System.out.println("Pesade number kastis: " + kast1.pesade_arv);
        kast1.lisaPudelid(klaas_pudel);
        System.out.println("Täidetud pesade arv: " + kast1.pesade_arv);
        System.out.println("Kasti ühine mass: " + kast1.kastiUhineMass(klaas_pudel));
        System.out.println("Kasti hind: " + kast1.kastiOmahind(klaas_pudel));
    }
}