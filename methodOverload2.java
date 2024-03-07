import javax.swing.plaf.synth.SynthStyle;

public class methodOverload2 {
    static int summethod(int x, int y){
        return x + y;
    }
    static double summethod(double x, double y){
        return x + y;
    }
    static float summethod(float x, float y){
        return x + y;
    }
    static String summethod(String x, String y, String z){
        return x + y + z;
    }
    public static void main(String[] args){
        System.out.println("Integer: " + summethod(32, 88));
        System.out.println("Double: " + summethod(12.23442218, 557.67787968453));
        System.out.println("Float: " + summethod(1.1111, 13.111));
        System.out.println("String: " + summethod("John", " ", "Kaki"));
    }
}
