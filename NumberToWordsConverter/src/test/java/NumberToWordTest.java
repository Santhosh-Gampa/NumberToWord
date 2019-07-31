import com.santhosh.test.NumberToWords;
import org.junit.Test;
import sun.security.tools.keytool.Main;

public class NumberToWordTest {

    @Test
    public void test(){
        System.out.println("Tetsing main");
        String[] args = new String[]{};
        try {
            NumberToWords.main(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
