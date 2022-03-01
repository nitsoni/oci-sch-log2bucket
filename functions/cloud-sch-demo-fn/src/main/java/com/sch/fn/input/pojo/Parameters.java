
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
    "compartmentId",
    "displayName"
})
@Generated("jsonschema2pojo")
public class Parameters {

    @JsonProperty("compartmentId")
    private List<String> compartmentId = null;
    @JsonProperty("displayName")
    private List<String> displayName = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("compartmentId")
    public List<String> getCompartmentId() {
        return compartmentId;
    }

    @JsonProperty("compartmentId")
    public void setCompartmentId(List<String> compartmentId) {
        this.compartmentId = compartmentId;
    }

    @JsonProperty("displayName")
    public List<String> getDisplayName() {
        return displayName;
    }

    @JsonProperty("displayName")
    public void setDisplayName(List<String> displayName) {
        this.displayName = displayName;
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
