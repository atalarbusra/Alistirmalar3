
public class Idman {
    
    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;
    
    
    public Idman(int burpee_sayisi,int pushup_sayisi,int situp_sayisi,int squat_sayisi)
    {
        this.burpee_sayisi=burpee_sayisi;
        this.pushup_sayisi=pushup_sayisi;
        this.situp_sayisi=situp_sayisi;
        this.squat_sayisi=squat_sayisi;
        
    }
    
    public void setBurpee(int burpee_sayisi)
    {
        this.burpee_sayisi=burpee_sayisi;
    }
    public int getBurpee()
    {
        return burpee_sayisi;
    }
    public void setPushup(int pushup_sayisi)
    {
        this.pushup_sayisi=pushup_sayisi;
    }
    public int getPushup()
    {
                return pushup_sayisi;
                
     }
    public void setSitup(int situp_sayisi)
    {
        this.situp_sayisi=situp_sayisi;
    }
    public int getSitup()
    {
        return situp_sayisi;
    }
    public void setSquat(int squat_sayisi)
    {
        this.squat_sayisi=squat_sayisi;
    }
    public int getSquat()
    {
        return squat_sayisi;
    }
    
    
    public void hareketYap(String tur,int sayi)
    {
        if(tur.equals("burpee"))
            burpeeYap(sayi);
        
        else if(tur.equals("pushup"))
            pushupYap(sayi);
        
        else if(tur.equals("situp"))
            situpYap(sayi);
        
        else if(tur.equals("squat"))
            squatYap(sayi);
        
        else
            System.out.println("Geçersiz işlem girdiniz......");
    }
    
    public void pushupYap(int sayi)
    {
        if(pushup_sayisi==0)
        {
            System.out.println("Yapacak pushup kalmadı...");
        }
        if(pushup_sayisi<sayi)
        {
            System.out.println("Hedeflediğin pushup geçtin.Tebrikler!");
            pushup_sayisi=0;
            System.out.println("Kalan Pushup:" + pushup_sayisi);
        }
        else
            pushup_sayisi-=sayi;
            System.out.println("Kalan Burpee :"+pushup_sayisi);
    }
    public void situpYap(int sayi)
    {
        if(situp_sayisi==0)
        {
            System.out.println("Yapacak situp kalmadı...");
        }
        if(situp_sayisi<sayi)
        {
            System.out.println("Hedeflediğin situp geçtin.Tebrikler!");
            situp_sayisi=0;
            System.out.println("Kalan Situp:" + situp_sayisi);
        }
        else
        {
             situp_sayisi-=sayi;
            System.out.println("Kalan Situp :"+situp_sayisi);
        }
    }
    public void burpeeYap(int sayi)
    {
        if(burpee_sayisi==0)
        {
            System.out.println("Yapacak burpee kalmadı...");
        }
        if(burpee_sayisi<sayi)
        {
            System.out.println("Hedeflediğin burpee geçtin.Tebrikler!");
            burpee_sayisi=0;
            System.out.println("Kalan Burpee:" + burpee_sayisi);
        }
        else
            burpee_sayisi-=sayi;
            System.out.println("Kalan Burpee :"+burpee_sayisi);
    }
    public void squatYap(int sayi)
    {
        if(squat_sayisi==0)
        {
            System.out.println("Yapacak squat kalmadı...");
        }
        if(squat_sayisi<sayi)
        {
            System.out.println("Hedeflediğin squat geçtin.Tebrikler!");
            squat_sayisi=0;
            System.out.println("Kalan squat:" + squat_sayisi);
        }
        else
            squat_sayisi-=sayi;
            System.out.println("Kalan Squat :"+squat_sayisi);
    }
    
    public boolean IdmanBittiMİ()
    {
        return ((burpee_sayisi==0)&&(pushup_sayisi==0)&&(situp_sayisi==0)&&(squat_sayisi==0));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
