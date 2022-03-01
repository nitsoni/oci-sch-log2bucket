
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
@JsonPropertyOrder({
    "authType",
    "callerId",
    "callerName",
    "consoleSessionId",
    "credentials",
    "ipAddress",
    "principalId",
    "principalName",
    "tenantId",
    "userAgent"
})
@Generated("jsonschema2pojo")
public class Identity {

    @JsonProperty("authType")
    private String authType;
    @JsonProperty("callerId")
    private Object callerId;
    @JsonProperty("callerName")
    private Object callerName;
    @JsonProperty("consoleSessionId")
    private Object consoleSessionId;
    @JsonProperty("credentials")
    private String credentials;
    @JsonProperty("ipAddress")
    private String ipAddress;
    @JsonProperty("principalId")
    private String principalId;
    @JsonProperty("principalName")
    private String principalName;
    @JsonProperty("tenantId")
    private String tenantId;
    @JsonProperty("userAgent")
    private String userAgent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("authType")
    public String getAuthType() {
        return authType;
    }

    @JsonProperty("authType")
    public void setAuthType(String authType) {
        this.authType = authType;
    }

    @JsonProperty("callerId")
    public Object getCallerId() {
        return callerId;
    }

    @JsonProperty("callerId")
    public void setCallerId(Object callerId) {
        this.callerId = callerId;
    }

    @JsonProperty("callerName")
    public Object getCallerName() {
        return callerName;
    }

    @JsonProperty("callerName")
    public void setCallerName(Object callerName) {
        this.callerName = callerName;
    }

    @JsonProperty("consoleSessionId")
    public Object getConsoleSessionId() {
        return consoleSessionId;
    }

    @JsonProperty("consoleSessionId")
    public void setConsoleSessionId(Object consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
    }

    @JsonProperty("credentials")
    public String getCredentials() {
        return credentials;
    }

    @JsonProperty("credentials")
    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    @JsonProperty("ipAddress")
    public String getIpAddress() {
        return ipAddress;
    }

    @JsonProperty("ipAddress")
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @JsonProperty("principalId")
    public String getPrincipalId() {
        return principalId;
    }

    @JsonProperty("principalId")
    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    @JsonProperty("principalName")
    public String getPrincipalName() {
        return principalName;
    }

    @JsonProperty("principalName")
    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    @JsonProperty("tenantId")
    public String getTenantId() {
        return tenantId;
    }

    @JsonProperty("tenantId")
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @JsonProperty("userAgent")
    public String getUserAgent() {
        return userAgent;
    }

    @JsonProperty("userAgent")
    public void setUserAgent(String userAgent) {
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
