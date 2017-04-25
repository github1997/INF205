package entity;
// Generated Oct 20, 2016 9:55:15 PM by Hibernate Tools 4.3.1


import java.io.Serializable;

/**
 * Products generated by hbm2java
 */
public class Products  implements java.io.Serializable {


     private Serializable code;
     private Serializable name;
     private Double price;
     private String images;
     private Serializable detail;

    public Products() {
    }

	
    public Products(Serializable code) {
        this.code = code;
    }
    public Products(Serializable code, Serializable name, Double price, String images, Serializable detail) {
       this.code = code;
       this.name = name;
       this.price = price;
       this.images = images;
       this.detail = detail;
    }
   
    public Serializable getCode() {
        return this.code;
    }
    
    public void setCode(Serializable code) {
        this.code = code;
    }
    public Serializable getName() {
        return this.name;
    }
    
    public void setName(Serializable name) {
        this.name = name;
    }
    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getImages() {
        return this.images;
    }
    
    public void setImages(String images) {
        this.images = images;
    }
    public Serializable getDetail() {
        return this.detail;
    }
    
    public void setDetail(Serializable detail) {
        this.detail = detail;
    }




}


