
public class Computer_UE_C
{
    private String hersteller;
    private String modell;
    private boolean laptop;
    private int preis;
    private int mhz;

    public Computer_UE_C(String hersteller, String modell, boolean laptop, int preis, int mhz)
    {
        setHersteller(hersteller);
        setModell(modell);
        setLaptop(laptop);
        setPreis(preis);
        setMhz(mhz);
    }
    
    public Computer_UE_C(String hersteller, String modell, int preis, int mhz)
    {
        setHersteller(hersteller);
        setModell(modell);
        setLaptop(true);
        setPreis(preis);
        setMhz(mhz);
    }
    
    public Computer_UE_C(String hersteller, boolean laptop, int preis)
    {
        setHersteller(hersteller);
        setModell("L-14");
        setLaptop(laptop);
        setPreis(preis);
        setMhz(mhz);
    }
    
    public Computer_UE_C(String hersteller, boolean laptop)
    {
        setHersteller(hersteller);
        setModell("L-14");
        setLaptop(laptop);
        setPreis(899);
        setMhz(2000);
    }
    
    public Computer_UE_C(String hersteller, int preis)
    {
        setHersteller(hersteller);
        setModell("L-14");
        setLaptop(true);
        setPreis(preis);
        setMhz(2000);
    }
    
    public Computer_UE_C()
    {
        setHersteller("Lenovo");
        setModell("L-14");
        setLaptop(true);
        setPreis(899);
        setMhz(2000);
    }

    public void setHersteller(String hersteller)
    {
        this.hersteller = hersteller;
    }
    
    public void setModell(String modell)
    {
        this.modell = modell;
    }

    public void setLaptop(boolean laptop)

    {
        this.laptop = laptop;
    }

    public void setPreis(int preis)
    {
        this.preis = preis;
    }

    public void setMhz(int mhz)
    {
        this.mhz = mhz;
    }
    
    public String getHersteller()
    {
        return hersteller;
    }
    
     public String getModell()
    {
        return modell;
    }
    
    public boolean getLeptop()
    {
        return laptop;
    }
    
    public int getPreis()
    {
        return preis;
    }
    
    public int getMhz()
    {
        return mhz;
    }
    
    public String getKategorie()
    {
       String kategorie;
       
       kategorie = modell.substring(0,1);
       
       return kategorie;
    }
    
    public String getDisplay()
    {
        String display;
        int pos;
        
        
        pos = modell.indexOf("-")+1;
        display = modell.substring(pos);
        
        return display;
    
    }
    
    public void printComputer_UE_C()
    {
        System.out.println("Hersteller: " + hersteller + "," + " Modell: " + modell+ "," +" Laptop: " + laptop  + "," + preis + " Euro " + ","+ + mhz + " mhz");
    }
}
