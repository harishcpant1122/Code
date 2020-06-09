package USBAssignment.USBAssignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class APIResponseValidation {

	public static void main(String[] args) {
		HttpURLConnection conection;
		String readLine = null;
		try {
			URL urlForGetRequest = new URL("http://dummy.restapiexample.com/api/v1/employees");
			System.out.println(urlForGetRequest.getHost()+"--"+urlForGetRequest.toURI());
			conection = (HttpURLConnection) urlForGetRequest.openConnection();
			conection.setRequestMethod("GET");
			int responseCode = conection.getResponseCode();
			System.out.println("responseCode-->"+responseCode);
		    if (responseCode == HttpURLConnection.HTTP_OK) {
		        BufferedReader in = new BufferedReader(
		            new InputStreamReader(conection.getInputStream()));
		        StringBuffer response = new StringBuffer();
		        while ((readLine = in .readLine()) != null) {
		            response.append(readLine);
		        } in .close();
		        System.out.println("JSON String Result ->" + response.toString());
		        JSONObject jsonObj = new JSONObject(response.toString()); 
		        String actualResponse=(String) jsonObj.get("status");
		        String expectedResponse="success";
		        
		        if (actualResponse.contentEquals(expectedResponse))
		        {
		        	System.out.println("Response recieved as expected...");
		        }
		        else {
		        	System.out.println("Response recieved is incorrect...");
		        }
		        
		    }
		} catch (Exception e) {}
	}

}
