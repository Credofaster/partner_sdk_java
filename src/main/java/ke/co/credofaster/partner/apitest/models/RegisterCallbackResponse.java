/*
 * CredofasterPartnerApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ke.co.credofaster.partner.apitest.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class RegisterCallbackResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 767086614653595431L;
    private int errorCode;
    private String errorDescription;
    private String registeredCallbackUrl;
    private UUID requestId;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ErrorCode")
    public int getErrorCode ( ) { 
        return this.errorCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ErrorCode")
    public void setErrorCode (int value) { 
        this.errorCode = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ErrorDescription")
    public String getErrorDescription ( ) { 
        return this.errorDescription;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ErrorDescription")
    public void setErrorDescription (String value) { 
        this.errorDescription = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("RegisteredCallbackUrl")
    public String getRegisteredCallbackUrl ( ) { 
        return this.registeredCallbackUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("RegisteredCallbackUrl")
    public void setRegisteredCallbackUrl (String value) { 
        this.registeredCallbackUrl = value;
    }
 
    /** GETTER
     * Tracking RequestId
     */
    @JsonGetter("RequestId")
    public UUID getRequestId ( ) { 
        return this.requestId;
    }
    
    /** SETTER
     * Tracking RequestId
     */
    @JsonSetter("RequestId")
    public void setRequestId (UUID value) { 
        this.requestId = value;
    }
 
}
