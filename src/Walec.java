public class Walec extends PunktMaterialny
{

    private int PromienWalca;

    public Walec(int m)
    {
        super(masa);
        PromienWalca = 5;
    }
    public Walec(int PW, int m)
    {
        super(masa);
        if (PW > 0)
        {
            PromienWalca = PW;
        }
        else
        {
            System.out.println("Promien oraz wysokosc walca musza byc wieksze od zera! Program przypisze wartosc domyslna 5 obu zmiennym.");
            PromienWalca = 5;
        }
        public int MomentBezwladnosciWalca()
        {
            return (1/2)*PromienWalca*PromienWalca;
        }
    }

}
