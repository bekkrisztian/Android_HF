package com.example.hf7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Card implements Serializable {
    private String currency;
    private String info;
    private int image;
    private String buy;
    private String sell;
    private String buyPrice;
    private String sellPrice;

    public Card (String currency, String info, int image, String buy, String sell, String buyPrice, String sellPrice) {
        this.currency = currency;
        this.info = info;
        this.image = image;
        this.buy = buy;
        this.sell = sell;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public String getDescription() {
        return info;
    }

    public int getImage() {
        return image;
    }

    public String getBuyPrice() {
        return buyPrice;
    }

    public String getSellPrice() {
        return sellPrice;
    }

    public static List<Card> getCard() {
        List<Card> cardList = new ArrayList<>();
        cardList.add(new Card("EUR", "EURO",R.drawable.euro,"Cumpar","Vinde","4,4100","4,5500"));
        cardList.add(new Card("USD", "Dollar",R.drawable.usa,"Cumpar","Vinde","3,9750","3,9750"));
        cardList.add(new Card("GBP", "Lira sterlina",R.drawable.uk,"Cumpar","Vinde","6,1550","6,3550"));
        cardList.add(new Card("AUD", "Dolar australian",R.drawable.australia,"Cumpar","Vinde","2,9600","3,0600"));
        cardList.add(new Card("CAD", "Dolar canadian",R.drawable.canada,"Cumpar","Vinde","3,0950","3,2650"));
        cardList.add(new Card("CHF", "France elvetian",R.drawable.switzerland,"Cumpar","Vinde","4,2300","4,3300"));
        cardList.add(new Card("DKK", "Coroana daneza",R.drawable.denmark,"Cumpar","Vinde","0,5850","0,6150"));
        cardList.add(new Card("HUF", "Forint maghiar",R.drawable.hungary,"Cumpar","Vinde","0,0136","0,0146"));

        return cardList;
    }
}