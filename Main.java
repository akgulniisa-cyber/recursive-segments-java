public class Main {
    public static void main(String[] args) {
        SegmentVide vide = new SegmentVide();
        SegmentPlein plein = new SegmentPlein();
        SegmentDiscontinu s = new SegmentDiscontinu(plein,
            new SegmentDiscontinu(new SegmentDiscontinu(plein, vide), plein));
        System.out.println(s.remplissage());
        Segment s2 = s.simplification();

        System.out.println(s);
        System.out.println(s2);    

        Segment t = new SegmentDiscontinu(plein, new SegmentDiscontinu(plein, plein));
        System.out.println(t.remplissage());  
        System.out.println(t + " -> " + t.simplification());
    }
}