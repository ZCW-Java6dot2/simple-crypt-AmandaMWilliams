
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CaesarTest {

    @Test
    public void caesarCryptTest1() {
        // Given
        Caesar cipher = new Caesar();
        Integer shiftForwardAmount = 7;

        String Q3 = "Why did the chicken cross the road?";
        String A3 = "Dof kpk aol jopjrlu jyvzz aol yvhk?";

        String Q4 = "Av nla av aol vaoly zpkl!";
        String A4 = "To get to the other side!";

        // When
        String actual = cipher.caesarEncrypt(Q3, shiftForwardAmount);
        System.out.println(Q3);
        System.out.println(A3);
        // Then
        assertTrue(actual.equals(A3));

        // When
        String actual2 = cipher.caesarDecrypt(Q4, shiftForwardAmount);
        System.out.println(Q4);
        System.out.println(A4);
        // Then
        assertTrue(actual2.equals(A4));

    }
}
