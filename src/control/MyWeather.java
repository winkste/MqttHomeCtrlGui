/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.StringTokenizer;
import javax.swing.Icon;

/**
 *
 * @author stephan_wink
 */
public class MyWeather {
    
    private String actualMsg_str;
    private StringTokenizer tokens_st;
    
    private String dateOfRequest_str = "NA";
    private String day0_str = "Mo"; 
    private String day0MinTemp_str = "-5";
    private String day0MaxTemp_str = "10";
    private String day0ActTemp_str = "15";
    private String day0Hum_str = "42";
    private String day0Weather_str = "cloudy";
    private String day0IconPath_str = "/resources/icon-set/GIF/250x250/moon.gif";
    private final int TOKEN_EXPECTED = 23;
    
    private String day1_str = "Tue";
    private String day1MaxTemp_str = "12";
    private String day1MinTemp_str = "-13";
    private String day1Weather_str = "sunny";
    private String day1IconPath_str = "/resources/icon-set/GIF/50x50/moon.gif";
    
    private String day2_str = "Tue";
    private String day2MaxTemp_str = "12";
    private String day2MinTemp_str = "-13";
    private String day2Weather_str = "sunny";
    private String day2IconPath_str = "/resources/icon-set/GIF/50x50/moon.gif";
    
    private String day3_str = "Tue";
    private String day3MaxTemp_str = "12";
    private String day3MinTemp_str = "-13";
    private String day3Weather_str = "sunny";
    private String day3IconPath_str = "/resources/icon-set/GIF/50x50/moon.gif";
    
    public MyWeather(String msg_str)
    {
        actualMsg_str = msg_str;
        tokens_st = new StringTokenizer(msg_str, ";");
        int i = 0;
        /*while(tokens_st.hasMoreTokens())
        {
            System.out.println("Index #" + i + " :" + tokens_st.nextToken());
            i++;
        }*/
        
        if(TOKEN_EXPECTED == tokens_st.countTokens())
        {
            //Index #0 :Sun, 19 Mar 2017 19:20:00 +0100
            dateOfRequest_str = tokens_st.nextToken();
            //Index #1 :10
            day0ActTemp_str = tokens_st.nextToken();
            //Index #2 :87%
            day0Hum_str = tokens_st.nextToken().replace("%", "");
            //Index #3 :Sun
            day0_str = tokens_st.nextToken();
            //Index #4 :11
            day0MaxTemp_str = tokens_st.nextToken();
            //Index #5 :8
            day0MinTemp_str = tokens_st.nextToken();
            //Index #6 :Chance of Rain
            day0Weather_str = tokens_st.nextToken();
            //Index #7 :http://icons.wxug.com/i/c/k/chancerain.gif
            tokens_st.nextToken();
            day0IconPath_str = convert0Weather(day0Weather_str);
            //Index #8 :Mon
            day1_str = tokens_st.nextToken();
            //Index #9 :11
            day1MaxTemp_str = tokens_st.nextToken();
            //Index #10 :8
            day1MinTemp_str = tokens_st.nextToken();
            //Index #11 :Chance of Rain
            day1Weather_str = tokens_st.nextToken();
            //Index #12 :http://icons.wxug.com/i/c/k/chancerain.gif
            tokens_st.nextToken();
            day1IconPath_str = convertWeather(day1Weather_str);
            //Index #13 :Tue
            day2_str = tokens_st.nextToken();
            //Index #14 :10
            day2MaxTemp_str = tokens_st.nextToken();
            //Index #15 :0
            day2MinTemp_str = tokens_st.nextToken();
            //Index #16 :Chance of Rain
            day2Weather_str = tokens_st.nextToken();
            //Index #17 :http://icons.wxug.com/i/c/k/chancerain.gif
            tokens_st.nextToken();
            day2IconPath_str = convertWeather(day2Weather_str);
            //Index #18 :Wed
            day3_str = tokens_st.nextToken();
            //Index #19 :12
            day3MaxTemp_str = tokens_st.nextToken();
            //Index #20 :2
            day3MinTemp_str = tokens_st.nextToken();
            //Index #21 :Mostly Cloudy
            day3Weather_str = tokens_st.nextToken();
            //Index #22 :http://icons.wxug.com/i/c/k/mostlycloudy.gif
            tokens_st.nextToken();
            day3IconPath_str = convertWeather(day3Weather_str);
        }
    }

    public String getDateOfRequest_str() {
        return dateOfRequest_str;
    }

    public String getDay0Weather_str() {
        return day0Weather_str;
    }

    public String getDay0_str() {
        return day0_str;
    }

    public String getDay0MinTemp_str() {
        return day0MinTemp_str;
    }

    public String getDay0MaxTemp_str() {
        return day0MaxTemp_str;
    }

    public String getDay0ActTemp_str() {
        return day0ActTemp_str;
    }

    public String getDay0Hum_str() {
        return day0Hum_str;
    }

    public String getDay0IconPath_str() {
        return day0IconPath_str;
    }
    
    public String getDay1_str() {
        return day1_str;
    }

    public String getDay1MaxTemp_str() {
        return day1MaxTemp_str;
    }

    public String getDay1MinTemp_str() {
        return day1MinTemp_str;
    }

    public String getDay1Weather_str() {
        return day1Weather_str;
    }

    public String getDay1IconPath_str() {
        return day1IconPath_str;
    }

    public String getDay2_str() {
        return day2_str;
    }

    public String getDay2MaxTemp_str() {
        return day2MaxTemp_str;
    }

    public String getDay2MinTemp_str() {
        return day2MinTemp_str;
    }

    public String getDay2Weather_str() {
        return day2Weather_str;
    }

    public String getDay2IconPath_str() {
        return day2IconPath_str;
    }

    public String getDay3_str() {
        return day3_str;
    }

    public String getDay3MaxTemp_str() {
        return day3MaxTemp_str;
    }

    public String getDay3MinTemp_str() {
        return day3MinTemp_str;
    }

    public String getDay3Weather_str() {
        return day3Weather_str;
    }

    public String getDay3IconPath_str() {
        return day3IconPath_str;
    }

    private String convert0Weather(String weather_str) {
        String iconPath_str = "na";
        
        switch(weather_str){
            case "Chance of Flurries":
            case "Flurries":
                iconPath_str = "/resources/icon-set/GIF/250x250/flurries.gif";
                break;
            case "Chance of Rain":
            case "Chance Rain":
                iconPath_str = "/resources/icon-set/GIF/250x250/fair-drizzle.gif";
                break;
            case "Chance of Freezing Rain":
            case "Freezing Rain":
                iconPath_str = "/resources/icon-set/GIF/250x250/freezing-rain.gif";
                break;
            case "Chance of Sleet":
            case "Sleet":
                iconPath_str = "/resources/icon-set/GIF/250x250/sleet.gif";
                break;
            case "Chance of Snow":
                iconPath_str = "/resources/icon-set/GIF/250x250/snow.gif";
                break;
            case "Chance of a Thunderstorm":
            case "Chance of Thunderstorms":
                iconPath_str = "/resources/icon-set/GIF/250x250/thunder-storm.gif";
                break;
            case "Clear":
            case "Sunny":
                iconPath_str = "/resources/icon-set/GIF/250x250/sunny.gif";
                break;
            case "Cloudy":
            case "Overcast":
                iconPath_str = "/resources/icon-set/GIF/250x250/cloudy.gif";
                break;
            case "Fog":
                iconPath_str = "/resources/icon-set/GIF/250x250/fog.gif";
                break;
            case "Haze":
                iconPath_str = "/resources/icon-set/GIF/250x250/hazy.gif";
                break;
            case "Mostly Cloudy":
            case "Mostly Sunny":
            case "Partly Cloudy":
            case "Partly Sunny":
            case "Scattered Clouds":
                iconPath_str = "/resources/icon-set/GIF/250x250/m-cloudy.gif";
                break;
            case "Rain":
                iconPath_str = "/resources/icon-set/GIF/250x250/rainy.gif";
                break;
            case "Snow":
                iconPath_str = "/resources/icon-set/GIF/250x250/snow.gif";
                break;
            case "Thunderstorms":
            case "Thunderstorm":
                iconPath_str = "/resources/icon-set/GIF/250x250/thunder-storm.gif";
                break;
            case "Unknown":
                iconPath_str = "/resources/icon-set/GIF/250x250/na.gif";
                break;
            default:
                iconPath_str = "/resources/icon-set/GIF/250x250/na.gif";
                break;
        }
          
        return(iconPath_str);
        
    }
    
    private String convertWeather(String weather_str) {
           String iconPath_str = "na";
        
        switch(weather_str){
            case "Chance of Flurries":
            case "Flurries":
                iconPath_str = "/resources/icon-set/GIF/50x50/flurries.gif";
                break;
            case "Chance of Rain":
            case "Chance Rain":
                iconPath_str = "/resources/icon-set/GIF/50x50/fair-drizzle.gif";
                break;
            case "Chance of Freezing Rain":
            case "Freezing Rain":
                iconPath_str = "/resources/icon-set/GIF/50x50/freezing-rain.gif";
                break;
            case "Chance of Sleet":
            case "Sleet":
                iconPath_str = "/resources/icon-set/GIF/50x50/sleet.gif";
                break;
            case "Chance of Snow":
                iconPath_str = "/resources/icon-set/GIF/50x50/snow.gif";
                break;
            case "Chance of a Thunderstorm":
            case "Chance of Thunderstorms":
                iconPath_str = "/resources/icon-set/GIF/50x50/thunder-storm.gif";
                break;
            case "Clear":
            case "Sunny":
                iconPath_str = "/resources/icon-set/GIF/50x50/sunny.gif";
                break;
            case "Cloudy":
            case "Overcast":
                iconPath_str = "/resources/icon-set/GIF/50x50/cloudy.gif";
                break;
            case "Fog":
                iconPath_str = "/resources/icon-set/GIF/50x50/fog.gif";
                break;
            case "Haze":
                iconPath_str = "/resources/icon-set/GIF/50x50/hazy.gif";
                break;
            case "Mostly Cloudy":
            case "Mostly Sunny":
            case "Partly Cloudy":
            case "Partly Sunny":
            case "Scattered Clouds":
                iconPath_str = "/resources/icon-set/GIF/50x50/m-cloudy.gif";
                break;
            case "Rain":
                iconPath_str = "/resources/icon-set/GIF/50x50/rainy.gif";
                break;
            case "Snow":
                iconPath_str = "/resources/icon-set/GIF/50x50/snow.gif";
                break;
            case "Thunderstorms":
            case "Thunderstorm":
                iconPath_str = "/resources/icon-set/GIF/50x50/thunder-storm.gif";
                break;
            case "Unknown":
                iconPath_str = "/resources/icon-set/GIF/50x50/na.gif";
                break;
            default:
                iconPath_str = "/resources/icon-set/GIF/50x50/na.gif";
                break;
        }
          
        return(iconPath_str);
        
    }
    
}
