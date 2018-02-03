package rt.aplikacja.model;

import org.springframework.stereotype.Component;

@Component ("customerTransformer")
public class CustomerRequestToCanonicalTransformer {
	public CustomerCanonical transform ( CustomerRequest customerRequest){
		CustomerCanonical cc = new CustomerCanonical();
		cc.setId(customerRequest.getId());
		cc.setName(customerRequest.getName().toUpperCase());
		cc.setAdress("jaki adres");
		cc.setYearOfBirth(1977);
		return cc;
		
	}
}
