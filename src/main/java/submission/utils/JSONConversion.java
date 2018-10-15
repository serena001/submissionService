package submission.utils;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import submission.domain.common.Document;
import submission.domain.common.Documents;

@Service
public class JSONConversion {
	public String getWriteValueAsString(Object value)
	{
		String val="";
			ObjectMapper mapper = new ObjectMapper();
			try {
		    		val=mapper.writeValueAsString(value);
			} catch (JsonProcessingException e) 
		    {
				e.printStackTrace();
		    }
			return val;
	}

	public Object convertJSONToObject(Object object, String jsonString) {
		ObjectMapper mapper = new ObjectMapper();
		 try {
			 object.getClass();
			 Document document = mapper.readValue(jsonString,  Document.class/**object.getClass()**/);	
			 System.out.println("sdf"+ document.toString());
			return object;
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return object;
	}
	
	
	  //Method to extract a string value
    public String retrieveStringValueFromJson(String jsonString,String path)
    {
    	ObjectMapper mapper = new ObjectMapper();    	
    	String value ="";
    	try {
			JsonNode node=mapper.readTree(jsonString).path(path);
			value = node.asText();
			return value;
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return value;
    }
    
  //Method used to extract json arrays from a json array;
    public String retrieveJSONStringValueFromJson(String jsonString,String path)
    {
    	String value ="";
    	ObjectMapper mapper = new ObjectMapper();
    	 try {
    		ObjectNode node = mapper.readValue(jsonString, ObjectNode.class);			
    		 value=mapper.writeValueAsString(node.findPath(path));
    	} catch (JsonParseException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	} catch (JsonMappingException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	} catch (IOException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    	 System.out.println("jsonArray" +value);
    	return value;
    }
}
