package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpints.UserEndPoints;
import api.payload.User;
import io.restassured.response.Response;

public class UserTest {

	Faker faker;
	User userPayload;

	public Logger logger;



	@BeforeClass
	public void setupData() {
		faker = new Faker();
		userPayload = new User();

		userPayload.setId(faker.idNumber().hashCode());
		userPayload.setUsername(faker.name().username());
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		userPayload.setPassword(faker.internet().password(5,10));
		userPayload.setPhone(faker.phoneNumber().cellPhone());

		//logs
		logger = LogManager.getLogger(this.getClass());
	}
	@Test(priority = 1)
	public void testPostUser(){
		logger.info("**********Creating User***********");
		Response response = UserEndPoints.createUser(userPayload);
		response.then().log().all();

		Assert.assertEquals(response.getStatusCode(), 200);

	}

	@Test(priority = 2)
	public void testGetUserByName(){

		logger.info("**********getting User info***********");

		Response response = UserEndPoints.readUser(this.userPayload.getUsername());

		response.then().log().all();

		Assert.assertEquals(response.getStatusCode(), 200);

	}

	@Test(priority = 3)
	public void tesUpdateUserByName(){
		//Update data using payload
		logger.info("**********updating User***********");
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());


		Response response = UserEndPoints.updateUser(this.userPayload.getUsername(), userPayload);
		response.then().log().all();

		Assert.assertEquals(response.getStatusCode(), 200);

		//checking data after updation 
		Response responseAfterUpdation = UserEndPoints.updateUser(this.userPayload.getUsername(), userPayload);
		Assert.assertEquals(responseAfterUpdation.getStatusCode(), 200);


	}
	@Test(priority =4)
	public void testDeleteUserByName(){ 
		logger.info("**********deleting User***********");
		Response response = UserEndPoints.deleteUser(this.userPayload.getUsername());
		Assert.assertEquals(response.getStatusCode(), 200);
	}

	@Test(priority = 5)
	public void testloginUser(){
		logger.info("**********Loging User***********");
		Response response = UserEndPoints.loginUser(this.userPayload.getUsername(), this.userPayload.getPassword());
		response.then().log().all();

		Assert.assertEquals(response.getStatusCode(), 200);
	}
	@Test(priority = 6)
	public void testlogOutUser(){
		logger.info("**********Logout User***********");
		Response response = UserEndPoints.logOutUser();
		response.then().log().all();

		Assert.assertEquals(response.getStatusCode(), 200);
		String body = response.getBody().asString();
		Assert.assertEquals(body.contains("ok"), true);
	}
}
