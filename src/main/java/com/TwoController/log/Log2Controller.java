package com.TwoController.log;

	import java.util.Map;

	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/log/")
	public class Log2Controller {
		
		
	    @RequestMapping(value ="logtwo",method=RequestMethod.GET)
	    
	    public ResponseEntity<?> run(@RequestParam Map<String,String> requestParams) 
	    { 
	    	try {
	    	Logger logger = LogManager.getLogger("Log2");

	    	logger.debug("testAPI started: " + requestParams);
	    	logger.info("testAPI started: " + requestParams);
	    	logger.error("log2: " + requestParams);
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}                                                                                


			return new ResponseEntity<>(requestParams,HttpStatus.OK);
	    	
	    }
	}




