package kalkulator;

public class Kalkulator
{
    String liczba_s="";
    
    public String getLiczbaS()
    {
        return liczba_s;
    }
    
    public void setLiczbaS(String s)
    {
        liczba_s = s;
    }
    
    
    public void dodaj_do_liczby(String s)
    {
        if(liczba_s.length() <= 9) liczba_s+=s;
    }
    
    public float zamien_na_liczbe(String s)
    {
        return Float.parseFloat(s);
    }
    
    public String zamien_na_napis(float i)
    {
        return String.valueOf(i);
    }
    
    public void dodaj(float a)
    {
        float liczba = zamien_na_liczbe(getLiczbaS());
        liczba+=a;
        setLiczbaS(zamien_na_napis(liczba));
    }
    
    public void odejmij(float a)
    {
        float liczba = zamien_na_liczbe(getLiczbaS());
        liczba = a-liczba;
        setLiczbaS(zamien_na_napis(liczba));
    }
    
    public void pomnoz(float a)
    {
        float liczba = zamien_na_liczbe(getLiczbaS());
        liczba*=a;
        setLiczbaS(zamien_na_napis(liczba));
    }
    
    public void podziel(float a)
    {
        float liczba = zamien_na_liczbe(getLiczbaS());
        if(a!=0) liczba = a/liczba;
        setLiczbaS(zamien_na_napis(liczba));
    }
}
