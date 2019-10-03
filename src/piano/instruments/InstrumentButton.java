package piano.instruments;

import javax.swing.*;

public class InstrumentButton extends JButton {

    private Instrument instrument;

    public InstrumentButton(Instrument instrument) {
        this.instrument = instrument;
        setText(instrument.getInstrumentName());
    }

    public Instrument getInstrument() {
        return instrument;
    }
}
