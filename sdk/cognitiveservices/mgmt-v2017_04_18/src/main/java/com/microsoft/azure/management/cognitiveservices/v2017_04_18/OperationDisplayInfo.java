/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The operation supported by Cognitive Services.
 */
public class OperationDisplayInfo {
    /**
     * The description of the operation.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * The action that users can perform, based on their permission level.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * Service provider: Microsoft Cognitive Services.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * Resource on which the operation is performed.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * Get the description of the operation.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of the operation.
     *
     * @param description the description value to set
     * @return the OperationDisplayInfo object itself.
     */
    public OperationDisplayInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the action that users can perform, based on their permission level.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the action that users can perform, based on their permission level.
     *
     * @param operation the operation value to set
     * @return the OperationDisplayInfo object itself.
     */
    public OperationDisplayInfo withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get service provider: Microsoft Cognitive Services.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set service provider: Microsoft Cognitive Services.
     *
     * @param provider the provider value to set
     * @return the OperationDisplayInfo object itself.
     */
    public OperationDisplayInfo withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get resource on which the operation is performed.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set resource on which the operation is performed.
     *
     * @param resource the resource value to set
     * @return the OperationDisplayInfo object itself.
     */
    public OperationDisplayInfo withResource(String resource) {
        this.resource = resource;
        return this;
    }

}
