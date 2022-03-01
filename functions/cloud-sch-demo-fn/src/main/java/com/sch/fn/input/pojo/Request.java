
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
//    "action",
//    "headers",
//    "id",
//    "parameters",
//    "path"
//})
@Generated("jsonschema2pojo")
public class Request {

//    @JsonProperty("action")
//    private String action;
//    @JsonProperty("headers")
//    private Headers headers;
//    @JsonProperty("id")
//    private String id;
//    @JsonProperty("parameters")
//    private Parameters parameters;
//    @JsonProperty("path")
//    private String path;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

//    @JsonProperty("action")
//    public String getAction() {
//        return action;
//    }
//
//    @JsonProperty("action")
//    public void setAction(String action) {
//        this.action = action;
//    }
//
//    @JsonProperty("headers")
//    public Headers getHeaders() {
//        return headers;
//    }
//
//    @JsonProperty("headers")
//    public void setHeaders(Headers headers) {
//        this.headers = headers;
//    }
//
//    @JsonProperty("id")
//    public String getId() {
//        return id;
//    }
//
//    @JsonProperty("id")
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    @JsonProperty("parameters")
//    public Parameters getParameters() {
//        return parameters;
//    }
//
//    @JsonProperty("parameters")
//    public void setParameters(Parameters parameters) {
//        this.parameters = parameters;
//    }
//
//    @JsonProperty("path")
//    public String getPath() {
//        return path;
//    }
//
//    @JsonProperty("path")
//    public void setPath(String path) {
//        this.path = path;
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
