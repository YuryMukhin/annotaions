import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by ymukhin on 8/2/2017.
 */

@StringedInstrument
@Strummed
public class Guitar implements Instrument {

    public Guitar() {

    }

    @Override public void play() {
        System.out.println("guitar");
    }
}
