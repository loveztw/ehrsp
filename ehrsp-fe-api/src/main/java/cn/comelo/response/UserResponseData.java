package cn.comelo.response;

import lombok.Data;

@Data
public class UserResponseData {

    /** User token */
    private String token;

    /** User Name */
    private String userName;
}
