package com.cts.accelerator.jpa.customerorder;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import com.cts.accelerator.jpa.customerorder.domain.Customer;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Customer.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerOrderApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

    @Autowired
    private WebApplicationContext webApplicationContext;

	@LocalServerPort
	private int port;

	private String getRootUrl() {
		return "http://localhost:" + port + "/api/v1";
	}

	@Test
	void contextLoads() {
	}

    @Test
    public void testGetAllCustomers() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/customers",
                HttpMethod.GET, entity, String.class);
        Assert.assertNotNull(response.getBody());
    }

    @Test
    public void testCreateCustomer() {
        Customer customer = new Customer();
        customer.setName("Charlie");
        ResponseEntity<Customer> postResponse = restTemplate.postForEntity(getRootUrl() + "/customers", customer, Customer.class);
        Assert.assertNotNull(postResponse);
        Assert.assertNotNull(postResponse.getBody());
    }

}
