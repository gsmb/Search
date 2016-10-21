package es.com.indra.connection;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;

import facebook4j.Account;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.ResponseList;
import facebook4j.conf.ConfigurationBuilder;
import facebook4j.internal.org.json.JSONObject;

public class SearchFacebook {
	public static void main(String[] args) throws FacebookException {
		// FacebookData fd = new FacebookData();
		// String accessToken =
		// "EAACEdEose0cBAD2ce3U2d4cMZCCirCCnfRGb3EQwxjQ7TAhFtxZBhV0fQ1pijYHGGoHybTYb7otkRFo4ZCXQ1PUIUPmgSSLvgZABKgv8k5z8KfMuyTDq7lhV25DkZAsC6v2JtZAZC0KBSSmp4Dnvv7mlDE4SCeOe0hMVzlTzTzqfwZDZD";
		//
		// FacebookClient fbCliente = new DefaultFacebookClient(accessToken);
		// User me = fbCliente.fetchObject("me" , User.class);
		//
		// System.out.println(me.getFirstName());
		// System.out.println(me.getRelationshipStatus());
		// fd.setUsername(me.getName());
		//
		// System.out.println(fd.getUsername());
		//

		// ConfigurationBuilder cb = new ConfigurationBuilder();
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true).setOAuthAppId("592576510927540").setOAuthAppSecret("7be89a4212c64e710945220b9f1ea181")
				.setOAuthAccessToken(
						"EAAIa8fhvorQBAM2U3paWSxrdukTmef9zcHdayTxz0L1I4mL5Ockk1vHHdppNkb4msL6mhFOotO4XpmbiyMgv5CVwZA4ZBSHCozqMm2AGRPsi1I5Bz4vI3ba95xEU0ZBjyNIO4m7eZBhcw0s2mxdXhn485rquzVHpngMrGJKZBPwZDZD")
				.setOAuthPermissions("user_birthday");
		FacebookFactory ff = new FacebookFactory(cb.build());
		Facebook facebook = ff.getInstance();
		facebook.postStatusMessage("Hello World from Facebook4J.");

//		ResponseList<JSONObject> results = facebook.search("João");
//
//		for (JSONObject ur : results) {
//			System.out.println(ur);
//		}
	}

}
