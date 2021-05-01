import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test{
    Jook sprite = new Jook("Sprite", 1.2, 1.5);
    Joogipudel pudel1 = new Joogipudel("plastmass", 0.2, 0.1, sprite);
    Joogivaat vaat1 = new Joogivaat(10, 100, sprite);
    Joogikast kast1 = new Joogikast("Puu", 22.0, 3.0, 12);
    Joogikast kast2 = new Joogikast("Eco", 42.0, 5.0, 24);

    @Test
    public void pudeliTest() {
        pudel1.lisaJook(sprite);
        assertEquals(0.3, pudel1.pudeliMass());
    }

    @Test
    public void vaadiTest() {
        assertEquals(100, vaat1.kogus_liitrites);
        vaat1.taidaPudel(pudel1);
        assertEquals(98.5, vaat1.kogus_liitrites);
        vaat1.vaaditaieVillimine(pudel1);
        assertEquals(0, vaat1.kogus_liitrites);
    }

    @Test
    public void kastTest() {
        kast1.lisaPudelid(pudel1);
        kast1.lisaPudelid(pudel1);
        assertEquals(10, kast1.pesade_arv);
        kast1.lisaPudelid(pudel1);
        assertEquals(9, kast1.n);
    }

    @Test
    public void kastiHind() {
        pudel1.lisaJook(sprite);
        assertEquals(10, kast2.n);
        kast2.lisaPudelid(pudel1);
        assertEquals(18.2, kast2.kastiOmahind(pudel1));
        kast2.lisaPudelid(pudel1);
        kast2.lisaPudelid(pudel1);
        kast2.lisaPudelid(pudel1);
        assertEquals(10, kast2.kastiOmahind(pudel1));
    }

    @Test
    public void kastiMass() {
        pudel1.lisaJook(sprite);
        kast2.lisaPudelid(pudel1);
        assertEquals(5.2, kast2.kastiUhineMass(pudel1));
        kast2.lisaPudelid(pudel1);
        kast2.lisaPudelid(pudel1);
        kast2.lisaPudelid(pudel1);
        assertEquals(10.1, kast2.kastiUhineMass(pudel1));
    }
}