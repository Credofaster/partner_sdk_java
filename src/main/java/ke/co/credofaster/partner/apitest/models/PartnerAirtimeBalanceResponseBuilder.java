/*
 * CredofasterPartnerApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ke.co.credofaster.partner.apitest.models;

import java.util.*;

public class PartnerAirtimeBalanceResponseBuilder {
    //the instance to build
    private PartnerAirtimeBalanceResponse partnerAirtimeBalanceResponse;

    /**
     * Default constructor to initialize the instance
     */
    public PartnerAirtimeBalanceResponseBuilder() {
        partnerAirtimeBalanceResponse = new PartnerAirtimeBalanceResponse();
    }

    /**
     * Code for the Request API Generated. 0: Success, Any other Error Code, refer to ErrorCodes Page
     */
    public PartnerAirtimeBalanceResponseBuilder errorCode(int errorCode) {
        partnerAirtimeBalanceResponse.setErrorCode(errorCode);
        return this;
    }

    /**
     * Text Description
     */
    public PartnerAirtimeBalanceResponseBuilder errorDescription(String errorDescription) {
        partnerAirtimeBalanceResponse.setErrorDescription(errorDescription);
        return this;
    }

    /**
     * Remaining Tentative Balance
     */
    public PartnerAirtimeBalanceResponseBuilder unitBalance(long unitBalance) {
        partnerAirtimeBalanceResponse.setUnitBalance(unitBalance);
        return this;
    }

    /**
     * Limit of Units to Use.
     */
    public PartnerAirtimeBalanceResponseBuilder limit(long limit) {
        partnerAirtimeBalanceResponse.setLimit(limit);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PartnerAirtimeBalanceResponse build() {
        return partnerAirtimeBalanceResponse;
    }
}