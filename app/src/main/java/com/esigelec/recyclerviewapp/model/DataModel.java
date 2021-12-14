package com.esigelec.recyclerviewapp.model;

import java.util.ArrayList;

public class DataModel {
    private static DataModel instance = new DataModel();
    private DataModel(){
        products = new ArrayList<>();
        products.add(new ProductDetail(
                "Apple",1f
        ));
        products.add(new ProductDetail(
                "Cake",20f
        ));
        products.add(new ProductDetail(
                "Apple1",1f
        ));
        products.add(new ProductDetail(
                "Cake1",20f
        ));
        products.add(new ProductDetail(
                "Apple2",1f
        ));
        products.add(new ProductDetail(
                "Cake2",20f
        ));
        products.add(new ProductDetail(
                "Apple3",1f
        ));
        products.add(new ProductDetail(
                "Cake3",20f
        ));
        products.add(new ProductDetail(
                "Apple4",1f
        ));
        products.add(new ProductDetail(
                "Cake4",20f
        ));
        products.add(new ProductDetail(
                "Apple5",1f
        ));
        products.add(new ProductDetail(
                "Cake5",20f
        ));products.add(new ProductDetail(
                "Apple6",1f
        ));
        products.add(new ProductDetail(
                "Cake6",20f
        ));products.add(new ProductDetail(
                "Apple7",1f
        ));
        products.add(new ProductDetail(
                "Cake7",20f
        ));
    }
    public static DataModel getInstance(){
        return instance;
    }
    public ArrayList<ProductDetail> products;
}
