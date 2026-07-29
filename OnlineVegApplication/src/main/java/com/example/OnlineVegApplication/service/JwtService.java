package com.example.OnlineVegApplication.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class JwtService {

    private final String SECRET_KEY =
            "mysecretkeymysecretkeymysecretkeymysecretkey";

    public String generateToken(String userName) {

        return Jwts.builder()

                .setSubject(userName)

                .setIssuedAt(new Date())

                .setExpiration(
                        new Date(System.currentTimeMillis() + 1000 * 60 * 60)
                )

                .signWith(
                        SignatureAlgorithm.HS256,
                        SECRET_KEY
                )

                .compact();

    }

    public String extractUserName(String token) {

        Claims claims = Jwts.parser()

                .setSigningKey(SECRET_KEY)

                .parseClaimsJws(token)

                .getBody();

        return claims.getSubject();

    }

    public boolean validateToken(String token, String userName) {

        String extractedUser = extractUserName(token);

        return extractedUser.equals(userName);

    }

}