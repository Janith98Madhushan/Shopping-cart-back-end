package com.janith.shoppingcart.model;


import javax.persistence.*;



@Entity
@Table(name = "cart_show")
public class CartShow {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "product_name")
    private String pName;



    @Column(name = "units")
    private int units;



    public CartShow() {
    }

    public CartShow(long id, String pName, int units) {
        this.id = id;
        this.pName = pName;
        this.units = units;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getUnits() {
        return units;

    }

    public void setUnits(int units) {
        this.units = units;
    }

    public int countUnits(int units,String pName){

        if(pName.equals("Penguin-ears")){

            units= units%20;
        }else{
            units= units%5;
        }
        return units;
    }



    public int countCartons(int units,String pName){
        int cartons;
        if (pName.equals("Penguin-ears")) {



            cartons = units/20;
        } else {
            cartons = units/5;
        }
        return cartons;
    }

    public double getCost(int units,String pName){

        double price;
        if(pName.equals("Penguin-ears")){
            if(units==1){
               price = 175*1.3/20;
            } else if (units>60) {
                price = (175 * units * 0.9)/20;
            }else{
                price = (float) (175*units)/20;
            }
        }else{
            if(units==1){
                price = 825*1.3/5;
            } else if (units>60) {
                price = (825 * units * 0.9)/5;
            }else{
                price = (float) (825*units)/5;
            }

        }
        return price;


    }
}
