package hello;

import java.util.List;

import javax.inject.Inject;

import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.twitter.api.CursoredList;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.TwitterProfile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

    private Twitter twitter;

    private ConnectionRepository connectionRepository;

    @Inject
    public HelloController(Twitter twitter, ConnectionRepository connectionRepository) {
        this.twitter = twitter;
        this.connectionRepository = connectionRepository;
    }

    @RequestMapping(method=RequestMethod.GET)
    public String helloTwitter(Model model) throws InterruptedException {
    	
        if (connectionRepository.findPrimaryConnection(Twitter.class) == null) {
            return "redirect:/connect/twitter";
        }
        
        // Create model and declare list of friends 
        model.addAttribute(twitter.userOperations().getUserProfile());   
        model.addAttribute(twitter.userOperations().getUserProfile());
        
        CursoredList<TwitterProfile> followers = twitter.friendOperations().getFollowers();
        
        while(followers.hasNext()) {
        	
        	Thread.sleep(61000);
        	
        	for (TwitterProfile follower : followers) {
        		System.out.println(follower.getScreenName() + " | " + follower.getCreatedDate() + " | " + follower.getFollowersCount());
        	}
        	/*
        	System.out.println("Has next cursor: " + followers.hasNext());
            System.out.println("Has pervious cursor: " + followers.hasPrevious());
            */
            Long nextCursor = followers.getNextCursor();
           // System.out.println("Code of the next one: " + nextCursor);
            
            followers = twitter.friendOperations().getFollowersInCursor(nextCursor);
        	
        }
        
        model.addAttribute("followers", followers);
        
        return "hello";
    }

}