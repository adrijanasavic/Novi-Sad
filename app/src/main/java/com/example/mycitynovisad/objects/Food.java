package com.example.mycitynovisad.objects;


public class Food {

    private int mFoodImageId;
    private String mFoodName;
    private String mFoodDescription;
    private String mFoodAddress;
    private String mFoodTransportation;
    private String mFoodPhone;
    private String mFoodWeb;
    private String mFoodHours;
    private String mFoodFee;


    public Food(int foodImageId, String foodName, String foodDescription,
                String foodAddress, String foodTransportation, String foodPhone,
                String foodWeb, String foodHours, String foodFee) {
        mFoodImageId = foodImageId;
        mFoodName = foodName;
        mFoodDescription = foodDescription;
        mFoodAddress = foodAddress;
        mFoodTransportation = foodTransportation;
        mFoodPhone = foodPhone;
        mFoodWeb = foodWeb;
        mFoodHours = foodHours;
        mFoodFee = foodFee;
    }


    public Food(int foodImageId, String foodName, String foodDescription,
                String foodAddress, String foodTransportation, String foodPhone,
                String foodHours, String foodFee) {
        mFoodImageId = foodImageId;
        mFoodName = foodName;
        mFoodDescription = foodDescription;
        mFoodAddress = foodAddress;
        mFoodTransportation = foodTransportation;
        mFoodPhone = foodPhone;
        mFoodHours = foodHours;
        mFoodFee = foodFee;
    }


    public Food(String foodName, int foodImageId, String foodDescription,
                String foodAddress, String foodTransportation, String foodWeb,
                String foodHours, String foodFee) {
        mFoodImageId = foodImageId;
        mFoodName = foodName;
        mFoodDescription = foodDescription;
        mFoodAddress = foodAddress;
        mFoodTransportation = foodTransportation;
        mFoodWeb = foodWeb;
        mFoodHours = foodHours;
        mFoodFee = foodFee;
    }

    public int getFoodImageId() {
        return mFoodImageId;
    }


    public String getFoodName() {
        return mFoodName;
    }


    public String getFoodDescription() {
        return mFoodDescription;
    }


    public String getFoodAddress() {
        return mFoodAddress;
    }


    public String getFoodTransportation() {
        return mFoodTransportation;
    }


    public String getFoodPhone() {
        return mFoodPhone;
    }


    public String getFoodWeb() {
        return mFoodWeb;
    }


    public String getFoodHours() {
        return mFoodHours;
    }


    public String getFoodFee() {
        return mFoodFee;
    }

}
