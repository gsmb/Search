package es.com.indra.connection;


import java.util.List;

import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class SearchTwitter {
	public static void main(String[] args) throws TwitterException {
		ConfigurationBuilder cf = new ConfigurationBuilder();
		cf.setDebugEnabled(true)
				.setOAuthConsumerKey("O2BqDB7Y9zCNrNNvwfN4jmbli")
				.setOAuthConsumerSecret("yDULOEGFuIuEGypWDchj0H81xOYJTywTrWhaEH7W3qX11Qo9Wt")
				.setOAuthAccessToken("1480850017-BAOL1I2b6BV1JWdkx6xIah98LXEMxFvmSI0ZBwR")
				.setOAuthAccessTokenSecret("KcpsQMZTjqVmnG8osSJDuOLKNA6VSdbMshYnRg30a9LNn");
		TwitterFactory tf = new TwitterFactory(cf.build());
		twitter4j.Twitter twitter = tf.getInstance();
		
		
		
		List<Status> status = twitter.getFavorites();
		for(Status st : status){
			System.out.println(st.getUser().getName() + "-" + "##" + st.getHashtagEntities() + "" +st.getText());
		}
		
	}
}
