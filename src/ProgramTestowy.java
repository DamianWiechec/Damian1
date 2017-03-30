public class ProgramTestowy {
    public static void main(String[] args){

        PunktMaterialny punkt1 = new PunktMaterialny();

        UniwersalnyTekst("1:");
        System.out.println("masa punktu 1 wynosi " +punkt1.getMasa());
        System.out.println("moment bezwladnosci punktu 1 wynosi " +punkt1.getMomentBezwladnosci());
        System.out.println("moment bezwladnosci punktu 1 względem oddalonej osi " +punkt1.getMomentWzgledemOsi(3)+"\n");

        PunktMaterialny punkt2 = new PunktMaterialny(-3);
        UniwersalnyTekst("2:");
        System.out.println("masa punktu 2 wynosi " +punkt2.getMasa());
        System.out.println("moment bezwladnosci punktu 2 wynosi " +punkt2.getMomentBezwladnosci());
        System.out.println("moment bezwladnosci punktu 2 względem oddalonej osi " +punkt2.getMomentWzgledemOsi(3)+"\n");

        punkt1.setMasa(30);
        UniwersalnyTekst("po zmianie masy:");
        System.out.println("masa punktu 1 wynosi " +punkt1.getMasa());
        System.out.println("moment bezwladnosci punktu 1 wynosi " +punkt1.getMomentBezwladnosci());
        System.out.println("moment bezwladnosci punktu 1 względem oddalonej osi " +punkt1.getMomentWzgledemOsi(3)+"\n");

        int[] Tablica = new int[10];
        for (int i = 0 ; i < 10 ; i++){
            PunktMaterialny PunktTablicowy = new PunktMaterialny((i+1)*10);
            Tablica[i] = PunktTablicowy.getMasa();
            System.out.println("Moment bezwladnosci punktu dla masy " +Tablica[i]+ " wynosi: " +PunktTablicowy.getMomentBezwladnosci());
            System.out.println("A jego moement bezwladnosci wzgledem oddalonej osi wynosi: " +PunktTablicowy.getMomentWzgledemOsi(3)+"\n");
        }
    }
    public static void UniwersalnyTekst(String x) {
        System.out.println("Punkt materialny "+x);
    }
}
