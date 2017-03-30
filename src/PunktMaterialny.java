public class PunktMaterialny { //Tworzymy publiczną klasę o nazwiePunktMaterialny//

    private int masa;                       //Deklaracja prywatnej zmniennej przechowywującej masę punktu//
    private int MomentWzgledemOsi;

    public PunktMaterialny()    //Konstruktor bez parametru przypisujący obiektowi daną masę//
    {
        masa=40;
    }
    public PunktMaterialny(int m)   //Konstruktor z parametrem//
    {
        if(m>0) {
            masa = m;
        }
        else{
            System.out.println("Masa musi mieć wartość dodatnią! Program przypiszę masie wartość domyślną równą 10 automatycznie");
            masa = 10;
        }
    }
    public void setMasa(int m)  // MUTATOR Metoda nadająca wartość zmniennej "masa"//
    {
        masa = m;
    }
    public int getMasa()        // AKCESOR Metoda zwracająca wartość zmiennej "masa"//
    {
        return masa;
    }

    public int PromienPunktuMaterialnego=0;
    public int getMomentBezwladnosci()                  //AKCESOR Metoda nadająca wartość zmiennej "MomentBezwladnnosci"//
    {
        return masa*PromienPunktuMaterialnego;
    }
    public int getMomentWzgledemOsi(int odleglosc)         //AKCESOR Metoda obliczająca wartość momentu bezwładności wzdlędem osi(musimy podać odległość jako argument)//
    {
        return MomentWzgledemOsi = (masa*PromienPunktuMaterialnego)+(masa*(odleglosc*odleglosc));
        //Moment bezwładności względem osi z Tw. Steinera//
    }
}
