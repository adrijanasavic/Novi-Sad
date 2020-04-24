package com.example.mycitynovisad.objects;


public class Attraction {

    private int mAttractionImageId;
    private String mAttractionName;
    private String mAttractionShortDs;
    private String mAttractionDescription;
    private String mAttractionAddress;
    private String mAttractionTransportation;
    private String mAttractionPhone;
    private String mAttractionWeb;
    private String mAttractionHours;
    private String mAttractionFee;


    public Attraction(int attractionImageId, String attractionName, String attractionShortDs,
                      String attractionDescription, String attractionAddress,
                      String attractionTransportation, String attractionPhone,
                      String attractionWeb, String attractionHours, String attractionFee) {
        mAttractionImageId = attractionImageId;
        mAttractionName = attractionName;
        mAttractionShortDs = attractionShortDs;
        mAttractionDescription = attractionDescription;
        mAttractionAddress = attractionAddress;
        mAttractionTransportation = attractionTransportation;
        mAttractionPhone = attractionPhone;
        mAttractionWeb = attractionWeb;
        mAttractionHours = attractionHours;
        mAttractionFee = attractionFee;
    }


    public Attraction(int attractionImageId, String attractionName, String attractionDescription,
                      String attractionAddress, String attractionTransportation, String attractionHours) {
        mAttractionImageId = attractionImageId;
        mAttractionName = attractionName;
        mAttractionDescription = attractionDescription;
        mAttractionAddress = attractionAddress;
        mAttractionTransportation = attractionTransportation;
        mAttractionHours = attractionHours;
    }


    public int getAttractionImageId() {
        return mAttractionImageId;
    }


    public String getAttractionName() {
        return mAttractionName;
    }


    public String getAttractionShortDs() {
        return mAttractionShortDs;
    }


    public String getAttractionDescription() {
        return mAttractionDescription;
    }


    public String getAttractionAddress() {
        return mAttractionAddress;
    }


    public String getAttractionTransportation() {
        return mAttractionTransportation;
    }


    public String getAttractionPhone() {
        return mAttractionPhone;
    }


    public String getAttractionWeb() {
        return mAttractionWeb;
    }


    public String getAttractionHours() {
        return mAttractionHours;
    }


    public String getAttractionFee() {
        return mAttractionFee;
    }

}

