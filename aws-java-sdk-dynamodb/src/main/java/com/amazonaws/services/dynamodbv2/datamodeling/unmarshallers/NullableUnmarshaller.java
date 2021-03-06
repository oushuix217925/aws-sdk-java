/*
 * Copyright 2014-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers;

import java.lang.reflect.Method;
import java.text.ParseException;

import com.amazonaws.services.dynamodbv2.datamodeling.ArgumentUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

public class NullableUnmarshaller implements ArgumentUnmarshaller {

    private final ArgumentUnmarshaller wrapped;

    public NullableUnmarshaller(ArgumentUnmarshaller wrapped) {
        if (wrapped == null) {
            throw new NullPointerException("wrapped");
        }
        this.wrapped = wrapped;
    }

    @Override
    public void typeCheck(AttributeValue value, Method setter) {
        if (value.isNULL() == null) {
            wrapped.typeCheck(value, setter);
        }
    }

    @Override
    public Object unmarshall(AttributeValue value) throws ParseException {
        if (value.isNULL() != null) {
            return null;
        }
        return wrapped.unmarshall(value);
    }
}
