package piano.instruments;

/**
 * instrument program numbers found at https://www.midi.org/specifications-old/item/gm-level-1-sound-set
 */
public enum Instrument {

    Piano("Piano", 0),
    Xylophone("Xylophone", 14),
    Guitar("Guitar", 25),
    Trumpet("Trumpet", 57),
    Flute("Flute", 74),
    Drum("Drum", 115);

    private final int instrumentChannel;
    private final String instrumentName;

    Instrument(String instrumentName, int instrumentChannel) {
        this.instrumentName = instrumentName;
        this.instrumentChannel = instrumentChannel;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public int getInstrumentChannel() {
        return instrumentChannel;
    }
}
