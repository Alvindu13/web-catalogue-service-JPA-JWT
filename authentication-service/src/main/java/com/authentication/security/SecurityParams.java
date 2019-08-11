package com.authentication.security;

public interface SecurityParams {
    public static final String JWT_HEADER_NAME = "Authorization";
    public static final String SECRET = "jeremie";
    public static final long EXPIRATION = 864000000;
    public static final String HEADER_PREFIX = "Bearer ";
}
