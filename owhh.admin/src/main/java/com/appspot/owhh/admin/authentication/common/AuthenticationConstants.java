package com.appspot.owhh.admin.authentication.common;

import lombok.experimental.UtilityClass;

@UtilityClass
public class AuthenticationConstants {

    public static final String AUTHENTICATION_PREFIX = "users";
    public static final String AUTHENTICATION_VERSION = "V1";
    public static final String AUTHENTICATION_BASE_URL = AUTHENTICATION_PREFIX + "/" + AUTHENTICATION_VERSION;
}
