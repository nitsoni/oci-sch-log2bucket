
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
    "Content-Encoding",
    "Content-Length",
    "Content-Type",
    "Date",
    "Vary",
    "X-Content-Type-Options",
    "opc-request-id"
})
@Generated("jsonschema2pojo")
public class Headers__1 {

    @JsonProperty("Content-Encoding")
    private List<String> contentEncoding = null;
    @JsonProperty("Content-Length")
    private List<String> contentLength = null;
    @JsonProperty("Content-Type")
    private List<String> contentType = null;
    @JsonProperty("Date")
    private List<String> date = null;
    @JsonProperty("Vary")
    private List<String> vary = null;
    @JsonProperty("X-Content-Type-Options")
    private List<String> xContentTypeOptions = null;
    @JsonProperty("opc-request-id")
    private List<String> opcRequestId = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Content-Encoding")
    public List<String> getContentEncoding() {
        return contentEncoding;
    }

    @JsonProperty("Content-Encoding")
    public void setContentEncoding(List<String> contentEncoding) {
        this.contentEncoding = contentEncoding;
    }

    @JsonProperty("Content-Length")
    public List<String> getContentLength() {
        return contentLength;
    }

    @JsonProperty("Content-Length")
    public void setContentLength(List<String> contentLength) {
        this.contentLength = contentLength;
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

    @JsonProperty("Vary")
    public List<String> getVary() {
        return vary;
    }

    @JsonProperty("Vary")
    public void setVary(List<String> vary) {
        this.vary = vary;
    }

    @JsonProperty("X-Content-Type-Options")
    public List<String> getXContentTypeOptions() {
        return xContentTypeOptions;
    }

    @JsonProperty("X-Content-Type-Options")
    public void setXContentTypeOptions(List<String> xContentTypeOptions) {
        this.xContentTypeOptions = xContentTypeOptions;
    }

    @JsonProperty("opc-request-id")
    public List<String> getOpcRequestId() {
        return opcRequestId;
    }

    @JsonProperty("opc-request-id")
    public void setOpcRequestId(List<String> opcRequestId) {
        this.opcRequestId = opcRequestId;
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
