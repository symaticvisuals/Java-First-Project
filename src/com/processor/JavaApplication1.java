package com.processor;
 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.main.User;
import com.main.Friends;

public class JavaApplication1 {
    @SuppressWarnings("unchecked")
    public  void readfriends() 
    {

        JSONParser parser = new JSONParser();

        try {     
            Object obj = parser.parse(new FileReader("D:\\Project\\data\\friends.json"));

            JSONObject jsonObject =  (JSONObject) obj;

            String firstName = (String) jsonObject.get("firstName");
            System.out.println(firstName);

            String lastName = (String) jsonObject.get("lastName");
            System.out.println(lastName);

            String contactNumber = (String) jsonObject.get("contactNumber");
            System.out.println(contactNumber);

            String address = (String) jsonObject.get("address");
            System.out.println(address);

            String dob = (String) jsonObject.get("dob");
            System.out.println(dob);

            // loop array
            JSONArray friends = (JSONArray) jsonObject.get("friends");
            Iterator<String> iterator = friends.iterator();
            while (iterator.hasNext()) {
             System.out.println(iterator.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}