package com.vishesh.beeppeep;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting {

    @JsonProperty("accountID")
    private String accountID;
    @JsonProperty("deviceID")
    private String deviceID;
    @JsonProperty("timestamp")
    private int timestamp;
    @JsonProperty("statusCode")
    private int statusCode ;
    @JsonProperty("gpsAge")
    private int gpsAge ;
    @JsonProperty("latitude")
    private double latitude;
    @JsonProperty("longitude")
    private double longitude;
    @JsonProperty("speedKPH")
    private double speedKPH;
    @JsonProperty("heading")
    private double heading;
    @JsonProperty("altitude")
    private double altitude;
    @JsonProperty("transportID")
    private String transportID ;
    @JsonProperty("inputMask")
    private int inputMask ;
    @JsonProperty("outputMask")
    private int outputMask ;
    @JsonProperty("searbeltMask")
    private int searbeltMask ;
    @JsonProperty("address")
    private String address ;
    @JsonProperty("dataSource")
    private String dataSource ;
    @JsonProperty("rawData")
    private String rawData ;
    @JsonProperty("distanceKM")
    private double distanceKM ;
    @JsonProperty("odometerKM")
    private double odometerKM ;
    @JsonProperty("odometerOffsetKM")
    private double odometerOffsetKM ;
    @JsonProperty("geozoneIndex")
    private int geozoneIndex ;
    @JsonProperty("geozoneID")
    private String geozoneID ;
    @JsonProperty("creationTime")
    private int creationTime ;

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getGpsAge() {
        return gpsAge;
    }

    public void setGpsAge(int gpsAge) {
        this.gpsAge = gpsAge;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getSpeedKPH() {
        return speedKPH;
    }

    public void setSpeedKPH(double speedKPH) {
        this.speedKPH = speedKPH;
    }

    public double getHeading() {
        return heading;
    }

    public void setHeading(double heading) {
        this.heading = heading;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public String getTransportID() {
        return transportID;
    }

    public void setTransportID(String transportID) {
        this.transportID = transportID;
    }

    public int getInputMask() {
        return inputMask;
    }

    public void setInputMask(int inputMask) {
        this.inputMask = inputMask;
    }

    public int getOutputMask() {
        return outputMask;
    }

    public void setOutputMask(int outputMask) {
        this.outputMask = outputMask;
    }

    public int getSearbeltMask() {
        return searbeltMask;
    }

    public void setSearbeltMask(int searbeltMask) {
        this.searbeltMask = searbeltMask;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getRawData() {
        return rawData;
    }

    public void setRawData(String rawData) {
        this.rawData = rawData;
    }

    public double getDistanceKM() {
        return distanceKM;
    }

    public void setDistanceKM(double distanceKM) {
        this.distanceKM = distanceKM;
    }

    public double getOdometerKM() {
        return odometerKM;
    }

    public void setOdometerKM(double odometerKM) {
        this.odometerKM = odometerKM;
    }

    public double getOdometerOffsetKM() {
        return odometerOffsetKM;
    }

    public void setOdometerOffsetKM(double odometerOffsetKM) {
        this.odometerOffsetKM = odometerOffsetKM;
    }

    public int getGeozoneIndex() {
        return geozoneIndex;
    }

    public void setGeozoneIndex(int geozoneIndex) {
        this.geozoneIndex = geozoneIndex;
    }

    public String getGeozoneID() {
        return geozoneID;
    }

    public void setGeozoneID(String geozoneID) {
        this.geozoneID = geozoneID;
    }

    public int getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(int creationTime) {
        this.creationTime = creationTime;
    }
}
