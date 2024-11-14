import java.io.*;
import java.net.*;

public class Website {


 // Put your code here
    private String domain;
    private String topLevelDomain;
    private int numUsers;
    private GeoLocation geoLocation;
    public Website(String wDomain,String wTDomain,int Users,double latitude,double longitude){
        domain = wDomain;
        topLevelDomain = wTDomain;
        numUsers = Users;
        geoLocation = new GeoLocation(latitude, longitude);
    }

//Default constructor
    public Website(String domainName, String topDomain){
        domain = domainName;
        topLevelDomain = topDomain;
    }
    
    public Website(){
        domain = "codehs";
        topLevelDomain = "com";
        numUsers = 0;
    }

    public double findDistanceTo(GeoLocation g){
        return geoLocation.distanceFrom(g);
    }


    // Method to fetch data 
    public void fetchData(String api)
 {
        String urlString=toString()+ "/"+api+"/";

        try {
            // Create the URL from the provided string
         
            URL url = new URL(urlString);
            
            // Open a connection to the API
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            
            // Read the response and print each line
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;

            System.out.println("Response from the API:");

            // Print each line of the response directly
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   // String representation for printing
    // Do not modify this method
    public String toString()
    {
        
        String res =  "https://" + domain + "." + topLevelDomain;
       // res += " has " + numUsers + " users";
        
        return res;
    }

    // Main method to test the API call
    public static void main(String[] args) {
        Website meta = new Website("meta","com",10000,44.2995,120.8346);
        
        Website amazon = new Website("amazon","com",10000,38.9339,77.1773);
        
        Website google = new Website("google","com",10000,41.2219,95.8608);

        Website microsoft = new Website("microsoft","com",10000,36.6646,78.3897);

        System.out.println("Distance between Google and Amazon: " + google.findDistanceTo(amazon.geoLocation) + " miles");
        System.out.println("Distance between Google and Meta: " + google.findDistanceTo(meta.geoLocation) + " miles");
        System.out.println("Distance between Google and Microsoft: " + google.findDistanceTo(microsoft.geoLocation) + " miles");
        System.out.println("Distance between Meta and Amazon: " + meta.findDistanceTo(amazon.geoLocation) + " miles");
        System.out.println("Distance between Meta and Micrsoft: " + meta.findDistanceTo(microsoft.geoLocation) + " miles");
    }
}


