package entity;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author hasib
 */
@ManagedBean(name="user")
@SessionScoped

public class UserBean {
    String isim;
    String soyisim;
    String yorum;
    String mail;

    /**
     *
     * @return
     */
    public String getIsim() {
        return isim;
    }

    /**
     *
     * @param isim
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     *
     * @return
     */
    public String getSoyisim() {
        return soyisim;
    }

    /**
     *
     * @param soyisim
     */
    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    /**
     *
     * @return
     */
    public String getYorum() {
        return yorum;
    }

    /**
     *
     * @param yorum
     */
    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

    /**
     *
     * @return
     */
    public String getMail() {
        return mail;
    }

    /**
     *
     * @param mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }
    
    /**
     *
     * @return
     */
    public String islemGerceklesti(){
        return "islemgerceklesti.xhtml";
    } 
    
}
