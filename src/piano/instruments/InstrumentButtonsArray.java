package piano.instruments;

import java.util.ArrayList;

public class InstrumentButtonsArray extends ArrayList<InstrumentButton> {

    public InstrumentButtonsArray() {
        for (Instrument instrument : Instrument.values()) {
            add(new InstrumentButton(instrument));
        }
    }
}
