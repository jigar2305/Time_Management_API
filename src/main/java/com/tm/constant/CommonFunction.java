package com.tm.constant;

import java.sql.Timestamp;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Service
public class CommonFunction {

	public Timestamp getcurrentTimestamp() {
		return new Timestamp(System.currentTimeMillis());
	}

	public static boolean isJsonValid(ObjectNode json, String[] keys) {
		// Check if the JSON object contains all the specified keys and their values are
		// not null
		for (String key : keys) {
			JsonNode node = json.get(key);
			if (node == null || node.isNull()) {
				return false;
			}
		}
		return true;
	}

	
	public static ObjectMapper getObjectMapper() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//		mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
		
		return mapper;
		
	}
}
