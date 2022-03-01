
package com.sch.fn.input.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Accept",
    "Accept-Encoding",
    "Authorization",
    "Content-Type",
    "Date",
    "Opc-Client-Info",
    "Opc-Request-Id",
    "User-Agent"
})
@Generated("jsonschema2pojo")
public class Headers {

    @JsonProperty("Accept")
    private List<String> accept = null;
    @JsonProperty("Accept-Encoding")
    private List<String> acceptEncoding = null;
    @JsonProperty("Authorization")
    private List<String> authorization = null;
    @JsonProperty("Content-Type")
    private List<String> contentType = null;
    @JsonProperty("Date")
    private List<String> date = null;
    @JsonProperty("Opc-Client-Info")
    private List<String> opcClientInfo = null;
    @JsonProperty("Opc-Request-Id")
    private List<String> opcRequestId = null;
    @JsonProperty("User-Agent")
    private List<String> userAgent = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Accept")
    public List<String> getAccept() {
        return accept;
    }

    @JsonProperty("Accept")
    public void setAccept(List<String> accept) {
        this.accept = accept;
    }

    @JsonProperty("Accept-Encoding")
    public List<String> getAcceptEncoding() {
        return acceptEncoding;
    }

    @JsonProperty("Accept-Encoding")
    public void setAcceptEncoding(List<String> acceptEncoding) {
        this.acceptEncoding = acceptEncoding;
    }

    @JsonProperty("Authorization")
    public List<String> getAuthorization() {
        return authorization;
    }

    @JsonProperty("Authorization")
    public void setAuthorization(List<String> authorization) {
        this.authorization = authorization;
    }

    @JsonProperty("Content-Type")
    public List<String> getContentType() {
        return contentType;
    }

    @JsonProperty("Content-Type")
    public void setContentType(List<String> contentType) {
        this.contentType = contentType;
    }

    @JsonProperty("Date")
    public List<String> getDate() {
        return date;
    }

    @JsonProperty("Date")
    public void setDate(List<String> date) {
        this.date = date;
    }

    @JsonProperty("Opc-Client-Info")
    public List<String> getOpcClientInfo() {
        return opcClientInfo;
    }

    @JsonProperty("Opc-Client-Info")
    public void setOpcClientInfo(List<String> opcClientInfo) {
        this.opcClientInfo = opcClientInfo;
    }

    @JsonProperty("Opc-Request-Id")
    public List<String> getOpcRequestId() {
        return opcRequestId;
    }

    @JsonProperty("Opc-Request-Id")
    public void setOpcRequestId(List<String> opcRequestId) {
        this.opcRequestId = opcRequestId;
    }

    @JsonProperty("User-Agent")
    public List<String> getUserAgent() {
        return userAgent;
    }

    @JsonProperty("User-Agent")
    public void setUserAgent(List<String> userAgent) {
        this.userAgent = userAgent;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
