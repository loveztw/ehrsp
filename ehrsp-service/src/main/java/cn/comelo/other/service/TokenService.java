package cn.comelo.other.service;

import cn.comelo.pojo.CmlUser;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenService {

    public String getToken(CmlUser user) {
        Date start = new Date();
        long tokenValidTime = System.currentTimeMillis() + 60* 60 * 1000;//一小时有效时间
        Date end = new Date(tokenValidTime);

        String token = JWT.create().withAudience(user.getUserid()).withIssuedAt(start).withExpiresAt(end)
                .sign(Algorithm.HMAC256(user.getUsername()));
        return token;
    }
}