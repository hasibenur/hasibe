
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hasib
 */

@ManagedBean(name="inputuser")
@SessionScoped

public class UserBeanKayit {
    String kisim,ksoyisim,kmail,ksifre,ksehir,kulke,kadres,kzip,kkullaniciadi;

    /**
     *
     * @return
     */
    public String getKisim() {
        return kisim;
    }

    /**
     *
     * @param kisim
     */
    public void setKisim(String kisim) {
        this.kisim = kisim;
    }

    /**
     *
     * @return
     */
    public String getKsoyisim() {
        return ksoyisim;
    }

    /**
     *
     * @param ksoyisim
     */
    public void setKsoyisim(String ksoyisim) {
        this.ksoyisim = ksoyisim;
    }

    /**
     *
     * @return
     */
    public String getKmail() {
        return kmail;
    }

    /**
     *
     * @param kmail
     */
    public void setKmail(String kmail) {
        this.kmail = kmail;
    }

    /**
     *
     * @return
     */
    public String getKsifre() {
        return ksifre;
    }

    /**
     *
     * @param ksifre
     */
    public void setKsifre(String ksifre) {
        this.ksifre = ksifre;
    }

    /**
     *
     * @return
     */
    public String getKsehir() {
        return ksehir;
    }

    /**
     *
     * @param ksehir
     */
    public void setKsehir(String ksehir) {
        this.ksehir = ksehir;
    }

    /**
     *
     * @return
     */
    public String getKulke() {
        return kulke;
    }

    /**
     *
     * @param kulke
     */
    public void setKulke(String kulke) {
        this.kulke = kulke;
    }

    /**
     *
     * @return
     */
    public String getKadres() {
        return kadres;
    }

    /**
     *
     * @param kadres
     */
    public void setKadres(String kadres) {
        this.kadres = kadres;
    }

    /**
     *
     * @return
     */
    public String getKzip() {
        return kzip;
    }

    /**
     *
     * @param kzip
     */
    public void setKzip(String kzip) {
        this.kzip = kzip;
    }

    /**
     *
     * @return
     */
    public String getKkullaniciadi() {
        return kkullaniciadi;
    }

    /**
     *
     * @param kkullaniciadi
     */
    public void setKkullaniciadi(String kkullaniciadi) {
        this.kkullaniciadi = kkullaniciadi;
    }
    
    /**
     *
     * @return
     */
    public String kayitOldu(){
        return "islemgerceklesti.xhtml"; 
    }
}
