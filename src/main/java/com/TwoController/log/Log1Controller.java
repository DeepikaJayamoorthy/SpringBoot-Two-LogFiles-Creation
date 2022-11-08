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
	@RequestMapping("/api/")
	public class Log1Controller {
		
		
	    @RequestMapping(value ="run",method=RequestMethod.GET)
	    
	    public ResponseEntity<?> logFile(@RequestParam Map<String,String> requestParams) 
	    { 
	    	try {
	    	Logger log = LogManager.getLogger("Log1");

			log.debug("testAPI started: " + requestParams);
			log.info("testAPI started: " + requestParams);
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}                                                                                


			return new ResponseEntity<>(requestParams,HttpStatus.OK);
	    	
	    }
	}



