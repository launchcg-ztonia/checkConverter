@JsonRootName(value="subscription")
@Entity
public class Check {
    @JsonProperty(value="_id")
    @_id
    Integer id;
    
    @JsonProperty(value="target")
    @target
    String target;
    
    @JsonProperty(value="position")
    @position
    Integer position;
    @JsonProperty(value="type")
    @type
    String type;
    
    @JsonProperty(value="su")
    @su
    Boolean su;
    
    @JsonProperty(value="mo")
    @mo
    Boolean mo;
    
    @JsonProperty(value="tu")
    @tu
    Boolean tu;
    
    @JsonProperty(value="we")
    @we
    Boolean we;
    
    @JsonProperty(value="th")
    @th
    Boolean th;
    
    @JsonProperty(value="fr")
    @fr
    Boolean fr;
    
    @JsonProperty(value="sa")
    @sa
    Boolean sa;
    
    @JsonProperty(value="fromTime")
    @fromTime
    String fromTime;
    
    @JsonProperty(value="toTime")
    @toTime
    String toTime;
    
    @JsonProperty(value="enabled")
    @enabled
    Boolean enabled;
        
    
}