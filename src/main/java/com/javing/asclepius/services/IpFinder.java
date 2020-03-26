package com.javing.asclepius.services;

import javax.servlet.http.HttpServletRequest;
import java.util.StringTokenizer;

public final class IpFinder {

    private IpFinder() {}

    public static String getClientIp(HttpServletRequest request) {//TODO continue here see why not getting correct IP
        String xForwardedForHeader = request.getHeader("X-Forwarded-For");
        if (xForwardedForHeader == null) {
            return request.getRemoteAddr();
        } else {
            return new StringTokenizer(xForwardedForHeader, ",").nextToken().trim();
        }
    }
}
