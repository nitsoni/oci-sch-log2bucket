package com.sch.fn;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fnproject.fn.api.OutputEvent;
import com.fnproject.fn.api.OutputEvent.Status;
import com.sch.fn.input.pojo.LogInput;

public class TaskFunction {

	ObjectMapper mapper = new ObjectMapper();

	public OutputEvent handleRequest(List<LogInput> input) {

		 XmlMapper xmlMapper = new XmlMapper();
		 
			String xml;
			try {
				xml = xmlMapper.writeValueAsString(input);
			} catch (JsonProcessingException e) {
				throw new RuntimeException("Unable to convert to xml", e);
			}
		
		return OutputEvent.fromBytes(
                xml.getBytes(),
                Status.Success,
                "application/octet-stream");
	}

}