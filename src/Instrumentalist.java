import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by ymukhin on 5/11/2017.
 */
public class Instrumentalist implements Performer {
    public Instrumentalist() {
    }

    @Override public void perform() {
        instrument.play();
        System.out.println(this.song);
        System.out.println(" INstrument");
    }

    private String song;

    public void setSong(String song) {
        this.song = song;
    }

    public String screamSong(){
        return song;
    }


    @Autowired
    @StringedInstrument
    @Strummed
    private Instrument instrument;
/*
    @Autowired
    public void setInstrument(Instrument instrument) {
        System.out.println("Hello");
        this.instrument = instrument;
    }*/
}
