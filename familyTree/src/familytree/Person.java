/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package familytree;

import java.util.List;
import java.util.Vector;
import org.w3c.dom.Node;

/**
 *
 * @author 90507
 */
public class Person {
    
    public Person father;
     public Person mother;
     public List <Person> children;
    
    private int id;
     private String  isim;
     private String soyisim ;
     private String dogum_tarihi ;
     private String esi ;
     private String anne_adi;
     private String baba_adi;      
     private String kan_grubu;
     private String meslek ;
     private String medeni_hali;      
     private String kizlik_soy_ismi;
     private String cinsiyet ;
     
     public Person(){
         
     }

     public Person(String isim){
         this.isim=isim;
         mother=father=null;
         children = new Vector <Person> ();
     }

     
     
     public Person(int id,String  isim,String soyisim ,String dogum_tarihi ,
        String esi ,
        String anne_adi,
        String baba_adi,      
        String kan_grubu,
        String meslek ,
        String medeni_hali,      
        String kizlik_soy_ismi,
        String cinsiyet)      
     {
         super();
         this.id=id;
         this.isim=isim;
         this.soyisim=soyisim;
         this.dogum_tarihi=dogum_tarihi;
         this.esi=esi;
         this.anne_adi=anne_adi;
         this.baba_adi=baba_adi;
         this.kan_grubu=kan_grubu;
         this.meslek=meslek;
         this.medeni_hali=medeni_hali;
         this.kizlik_soy_ismi=kizlik_soy_ismi;
         this.cinsiyet=cinsiyet;
         
     }
     


    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @return the soyisim
     */
    public String getSoyisim() {
        return soyisim;
    }

    /**
     * @return the dogum_tarihi
     */
    public String getDogum_tarihi() {
        return dogum_tarihi;
    }

    /**
     * @return the esi
     */
    public String getEsi() {
        return esi;
    }

    /**
     * @return the anne_adi
     */
    public String getAnne_adi() {
        return anne_adi;
    }

    /**
     * @return the baba_adi
     */
    public String getBaba_adi() {
        return baba_adi;
    }

    /**
     * @return the kan_grubu
     */
    public String getKan_grubu() {
        return kan_grubu;
    }

    /**
     * @return the meslek
     */
    public String getMeslek() {
        return meslek;
    }

    /**
     * @return the medeni_hali
     */
    public String getMedeni_hali() {
        return medeni_hali;
    }

    /**
     * @return the kizlik_soy_ismi
     */
    public String getKizlik_soy_ismi() {
        return kizlik_soy_ismi;
    }

    /**
     * @return the cinsiyet
     */
    public String getCinsiyet() {
        return cinsiyet;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
        
    }

    /**
     * @param soyisim the soyisim to set
     */
    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    /**
     * @param dogum_tarihi the dogum_tarihi to set
     */
    public void setDogum_tarihi(String dogum_tarihi) {
        this.dogum_tarihi = dogum_tarihi;
    }

    /**
     * @param esi the esi to set
     */
    public void setEsi(String esi) {
        this.esi = esi;
    }

    /**
     * @param anne_adi the anne_adi to set
     */
    public void setAnne_adi(String anne_adi) {
        this.anne_adi = anne_adi;
    }

    /**
     * @param baba_adi the baba_adi to set
     */
    public void setBaba_adi(String baba_adi) {
        this.baba_adi = baba_adi;
    }

    /**
     * @param kan_grubu the kan_grubu to set
     */
    public void setKan_grubu(String kan_grubu) {
        this.kan_grubu = kan_grubu;
    }

    /**
     * @param meslek the meslek to set
     */
    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    /**
     * @param medeni_hali the medeni_hali to set
     */
    public void setMedeni_hali(String medeni_hali) {
        this.medeni_hali = medeni_hali;
    }

    /**
     * @param kizlik_soy_ismi the kizlik_soy_ismi to set
     */
    public void setKizlik_soy_ismi(String kizlik_soy_ismi) {
        this.kizlik_soy_ismi = kizlik_soy_ismi;
    }

    /**
     * @param cinsiyet the cinsiyet to set
     */
    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
    
    public List <Person> getChildren() {
        return children;
    }

    /**
     * @return the father
     */
    public Person getFather() {
        return father;
    }

    /**
     * @return the mother
     */
    public Person getMother() {
        return mother;
    }

    /**
     * @param children the children to set
     */
    public void setChildren(List <Person> children) {
        this.children = children;
    }

    /**
     * @param father the father to set
     */
    public void setFather(Person father) {
        this.father = father;
    }

    /**
     * @param mother the mother to set
     */
    public void setMother(Person mother) {
        this.mother = mother;
    }
    
}
