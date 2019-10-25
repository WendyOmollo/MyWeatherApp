
package com.wendyomollo.myweatherapp.WeatherResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Main {

    @SerializedName("temp")
    @Expose
    public Double temp;
    @SerializedName("humidity")
    @Expose
    public Integer humidity;
    @SerializedName("pressure")
    @Expose
    public Integer pressure;
    @SerializedName("temp_min")
    @Expose
    public Double temp_min;
    @SerializedName("temp_max")
    @Expose
    public Double temp_max;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Main() {
    }

    /**
     * 
     * @param tempMax
     * @param temp
     * @param humidity
     * @param pressure
     * @param tempMin
     */
    public Main(Double temp, Integer humidity, Integer pressure, Double tempMin, Double tempMax) {
        super();
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.temp_min = tempMin;
        this.temp_max = tempMax;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Double getTempMin() {
        return temp_min;
    }

    public void setTempMin(Double tempMin) {
        this.temp_min = tempMin;
    }

    public Double getTempMax() {
        return temp_max;
    }

    public void setTempMax(Double tempMax) {
        this.temp_max = tempMax;
    }

}
