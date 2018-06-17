**Overview**

* Reviews site that categorizes reviews. 

* Spring Boot + MVC app that displays a list of reviews based on city, allowing us to click on an individual review to see its details.

**The project is made up of:**

*Review Class*
Its instance variables include:
* ID of type Long
* Title
* Image url	
* Review category	
* Content
* Rating
* The Review class Contains accessor methos that return the Review attributes. 
	
*ReviewRepository Class*
		
* This class is annotated to enbale it to be injected into the ReviewsController
* It contains a constructor that creates the Review instances and populates a Map that stores the reviews, using each review’s id as the map key.
* It has a method to find all reviews
* It has a method to find one review by id
	
*Review Conroller Class*

* It contains a method mapped to a url that puts all of your reviews into the model, forwarding to a “reviews” template.
* It contains a method mapped to a URL including an id parameter that puts one of the reviews into the model, forwarding to a review template. 
