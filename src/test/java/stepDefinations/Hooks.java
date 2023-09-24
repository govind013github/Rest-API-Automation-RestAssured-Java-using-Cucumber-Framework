package stepDefinations;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {

	@Before("@DeletePlace")
	public void beforeScenario() throws IOException
	{   
		//execute this code only when placeid is null.
		//write a code that will give you placeid.
		
		StepDefination m = new StepDefination();
		if(StepDefination.place_id==null) 
		{
		m.add_place_payload_with("govind", "French", "Pune");
        m.user_calls_with_http_request("AddPlaceAPI", "POST");
        m.verify_place_id_created_maps_to_using("govind", "getPlaceAPI");
        
		}
        
	}
}
