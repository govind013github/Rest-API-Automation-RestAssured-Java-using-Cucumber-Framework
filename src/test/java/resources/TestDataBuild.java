package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {
	
	
	public AddPlace addPlacePayLoad(String name,String language, String address)
	{
		AddPlace p = new AddPlace();
		p.setAccuracy(50);
		p.setAddress(address);                                    // we set data from feature file for above method.
		p.setLanguage(language);                                  // we set data from feature file for above method
		p.setPhone_number("(+91) 983 893 3937");
		p.setWebsite("http://google.com");
		p.setName(name);                                         //we set data from feature file for above method.
		List<String> myList = new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");
		p.setTypes(myList);
		
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		p.setLocation(l);
		return p;
	}
	
	public String deletePlacePayload(String placeId)          
	{
		return "{\r\n    \"place_id\":\""+placeId+"\"\r\n}";      // here (place_id) returned is converted from Json to string using online free tool.
	}

}


