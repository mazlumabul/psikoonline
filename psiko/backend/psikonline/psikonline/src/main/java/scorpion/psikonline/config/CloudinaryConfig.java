package scorpion.psikonline.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;


@Configuration
public class CloudinaryConfig {

	
	@Bean
    public Cloudinary cloudinaryUser(){
        return new Cloudinary(ObjectUtils.asMap(
        		"cloud_name", "dnbha5wpg",
    			"api_key", "831556153327321",
    			"api_secret", "RQP0BwKFu54h6nKgLAZh8g7hobM",
    			"secure", true));
    }
}
