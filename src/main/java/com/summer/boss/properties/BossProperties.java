package com.summer.boss.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author john
 */
@ConfigurationProperties(prefix = "boss")
@Getter
@Setter
@Component
public class BossProperties {

    /**
     * 静态资源配置路径
     */
    private String[] resourceBasePaths;

    private AuthConfig auth;

    @Getter
    @Setter
    public static class AuthConfig {
        /**
         * 不需要认证的资源
         */
        private String[] ignoreSources;
        /**
         * 接口密码
         */
        private String apiTokenHeader;
        /**
         * 过期时间
         */
        private Integer expire;
    }
}
