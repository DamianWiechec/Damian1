public class Kula extends PunktMaterialny {

    private int PromienKuli;

    public Kula(int m)
    {
        super(m);
        PromienKuli = 5;
    }
    public Kula(int r, int m)
    {
        super(m);
        if(r > 0)
        {
            PromienKuli = r;
        }
        else
        {
            System.out.println("Promien nie moze byc liczba ujemna! Zostanie przypisana wartosc domyslna 5.");
            PromienKuli = 5;
        }

    }
}
