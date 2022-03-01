
package com.sch.fn.input.pojo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//    "headers",
//    "message",
//    "payload",
//    "responseTime",
//    "status"
//})
@Generated("jsonschema2pojo")
public class Response {

//    @JsonProperty("headers")
//    private Headers__1 headers;
//    @JsonProperty("message")
//    private Object message;
//    @JsonProperty("payload")
//    private Payload payload;
//    @JsonProperty("responseTime")
//    private String responseTime;
//    @JsonProperty("status")
//    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

//    @JsonProperty("headers")
//    public Headers__1 getHeaders() {
//        return headers;
//    }
//
//    @JsonProperty("headers")
//    public void setHeaders(Headers__1 headers) {
//        this.headers = headers;
//    }
//
//    @JsonProperty("message")
//    public Object getMessage() {
//        return message;
//    }
//
//    @JsonProperty("message")
//    public void setMessage(Object message) {
//        this.message = message;
//    }
//
//    @JsonProperty("payload")
//    public Payload getPayload() {
//        return payload;
//    }
//
//    @JsonProperty("payload")
//    public void setPayload(Payload payload) {
//        this.payload = payload;
//    }
//
//    @JsonProperty("responseTime")
//    public String getResponseTime() {
//        return responseTime;
//    }
//
//    @JsonProperty("responseTime")
//    public void setResponseTime(String responseTime) {
//        this.responseTime = responseTime;
//    }
//
//    @JsonProperty("status")
//    public String getStatus() {
//        return status;
//    }
//
//    @JsonProperty("status")
//    public void setStatus(String status) {
//        this.status = status;
//    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
