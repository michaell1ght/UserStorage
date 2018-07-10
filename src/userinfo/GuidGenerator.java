package userinfo;

import java.util.UUID;

public  class GuidGenerator {
    public static String generateGuid(){
    UUID uuid = UUID.randomUUID();
    return uuid.toString();
    }
    }
