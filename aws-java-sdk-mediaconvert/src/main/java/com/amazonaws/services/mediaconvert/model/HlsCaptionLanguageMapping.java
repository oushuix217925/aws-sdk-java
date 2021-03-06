/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Caption Language Mapping
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/HlsCaptionLanguageMapping"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HlsCaptionLanguageMapping implements Serializable, Cloneable, StructuredPojo {

    /** Caption channel. */
    private Integer captionChannel;

    private String languageCode;
    /** Caption language description. */
    private String languageDescription;

    /**
     * Caption channel.
     * 
     * @param captionChannel
     *        Caption channel.
     */

    public void setCaptionChannel(Integer captionChannel) {
        this.captionChannel = captionChannel;
    }

    /**
     * Caption channel.
     * 
     * @return Caption channel.
     */

    public Integer getCaptionChannel() {
        return this.captionChannel;
    }

    /**
     * Caption channel.
     * 
     * @param captionChannel
     *        Caption channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsCaptionLanguageMapping withCaptionChannel(Integer captionChannel) {
        setCaptionChannel(captionChannel);
        return this;
    }

    /**
     * @param languageCode
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * @return
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * @param languageCode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public HlsCaptionLanguageMapping withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * @param languageCode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public HlsCaptionLanguageMapping withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * Caption language description.
     * 
     * @param languageDescription
     *        Caption language description.
     */

    public void setLanguageDescription(String languageDescription) {
        this.languageDescription = languageDescription;
    }

    /**
     * Caption language description.
     * 
     * @return Caption language description.
     */

    public String getLanguageDescription() {
        return this.languageDescription;
    }

    /**
     * Caption language description.
     * 
     * @param languageDescription
     *        Caption language description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsCaptionLanguageMapping withLanguageDescription(String languageDescription) {
        setLanguageDescription(languageDescription);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCaptionChannel() != null)
            sb.append("CaptionChannel: ").append(getCaptionChannel()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getLanguageDescription() != null)
            sb.append("LanguageDescription: ").append(getLanguageDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsCaptionLanguageMapping == false)
            return false;
        HlsCaptionLanguageMapping other = (HlsCaptionLanguageMapping) obj;
        if (other.getCaptionChannel() == null ^ this.getCaptionChannel() == null)
            return false;
        if (other.getCaptionChannel() != null && other.getCaptionChannel().equals(this.getCaptionChannel()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getLanguageDescription() == null ^ this.getLanguageDescription() == null)
            return false;
        if (other.getLanguageDescription() != null && other.getLanguageDescription().equals(this.getLanguageDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaptionChannel() == null) ? 0 : getCaptionChannel().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getLanguageDescription() == null) ? 0 : getLanguageDescription().hashCode());
        return hashCode;
    }

    @Override
    public HlsCaptionLanguageMapping clone() {
        try {
            return (HlsCaptionLanguageMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.HlsCaptionLanguageMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
