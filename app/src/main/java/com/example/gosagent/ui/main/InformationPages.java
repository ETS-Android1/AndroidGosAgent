package com.example.gosagent.ui.main;

import android.graphics.drawable.Drawable;

import com.example.gosagent.LotInformationsData;

public class InformationPages {
    private LotInformationsData selectedLot;
    private Drawable imageLot;
    private String nameOfLot;
    private String textLot;
    private String description;
    private String linkOnLot;
    private String priceLot;
    private String addressesLot;

    public Drawable getImage() {
        return imageLot;
    }

    public void setImage(Drawable image) {
        this.imageLot = image;
    }

    public String getNameOfLot() {
        return nameOfLot;
    }

    public void setNameOfLot(String nameOfLot) {
        this.nameOfLot = nameOfLot;
    }

    public String getTextLot() {
        return textLot;
    }

    public void setTextLot(String textLot) {
        this.textLot = textLot;
    }

    public LotInformationsData getSelectedLot() { return selectedLot; }

    public void setSelectedLot(LotInformationsData selectedLot) {
        this.selectedLot = selectedLot;
    }

    public String getAddresses() { return addressesLot; }

    public void setAddresses(String addresses) {
        this.addressesLot = addresses;
    }

    public String getPrice() {
        return priceLot;
    }

    public void setPrice(String price) {
        this.priceLot = price;
    }

    public String getLink() {
        return linkOnLot;
    }

    public void setLink(String link) {
        this.linkOnLot = link;
    }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }
}
