package nouroz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HaftSinBayad {
    @Test
    void taiin_konad_Kodam_shey_jozi_az_an_ast() {

        asserthatHaftSinAshya("Sib", "Ejbari");
        asserthatHaftSinAshya("Sir", "Ejbari");
        asserthatHaftSinAshya("Samanou", "Ejbari");
        asserthatHaftSinAshya("Serke", "Ejbari");
        asserthatHaftSinAshya("Seke", "Ejbari");
        asserthatHaftSinAshya("Somagh", "Ejbari");
        asserthatHaftSinAshya("Senjed", "Ejbari");
        asserthatHaftSinAshya("mahi", "Ekhtyari");
        asserthatHaftSinAshya("shirini", "Ekhtyari");
        asserthatHaftSinAshya("sham", "Ekhtyari");
        asserthatHaftSinAshya("saat", "Ekhtyari");
        asserthatHaftSinAshya("ayne", "Ekhtyari");
        asserthatHaftSinAshya("har chizi", "jozi az haft sin nist");
    }

    private void asserthatHaftSinAshya(String shey, String natije) {
        HaftSin haftSin = new HaftSin();
        String result = haftSin.ayaJoziazanast(shey);
        Assertions.assertThat(result).isEqualTo(natije);
    }
}
