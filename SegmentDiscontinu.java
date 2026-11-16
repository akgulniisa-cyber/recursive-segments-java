public class SegmentDiscontinu implements Segment {
    private final Segment gauche;
    private final Segment droite;

    public SegmentDiscontinu(Segment gauche, Segment droite) {
        this.gauche = gauche;
        this.droite = droite;
    }

    @Override
    public float remplissage() {
        return (gauche.remplissage() + droite.remplissage()) / 2;
    }

    @Override
    public Segment simplification() {
        Segment s1 = gauche.simplification();
        Segment s2 = droite.simplification();
        if (s1 instanceof SegmentContinu && s1.getClass() == s2.getClass()) {
            return s1;
        }
        return new SegmentDiscontinu(s1, s2);
    }   
    public String toString() {
        return "[" + gauche + ", " + droite + "]";
    }
}
