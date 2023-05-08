package com.example.CheckoutService.api.model;

import jakarta.persistence.*;

@Table
@Entity // This tells Hibernate to make a table out of this class
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String buyerID;
    private String sellerID;
    private String listingTitle;
    private int listingID;
    private float listingPrice;

    public History( String buyerID, String sellerID, String listingTitle, int listingID, float listingPrice){
        this.buyerID = buyerID;
        this.sellerID = sellerID;
        this.listingID = listingID;
        this.listingTitle = listingTitle;
        this.listingPrice = listingPrice;
    }

    public History(){
        this.buyerID = null;
        this.sellerID = null;
        this.listingID = -1;
        this.listingTitle = null;
        this.listingPrice = 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBuyerID() {
        return buyerID;
    }

    public String getSellerID() {
        return sellerID;
    }

    public void setSellerID(String sellerID) {
        this.sellerID = sellerID;
    }

    public String getListingTitle() {
        return listingTitle;
    }

    public void setListingTitle(String listingTitle) {
        this.listingTitle = listingTitle;
    }

    public int getListingID() {
        return listingID;
    }

    public void setListingID(int listingID) {
        this.listingID = listingID;
    }

    public float getListingPrice() {
        return listingPrice;
    }

    public void setListingPrice(float listingPrice) {
        this.listingPrice = listingPrice;
    }

    public void setBuyerID(String buyerID) {
        this.buyerID = buyerID;
    }
}
