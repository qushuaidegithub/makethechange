package org.smart4j.framework.helper;

import org.smart4j.framework.ConfigConstant;
import org.smart4j.framework.util.PropsUtil;

import java.util.Properties;

/**
 * Created by lenovo on 2017/5/17.
 */
public class ConfigHelper {
    private  static final Properties CONFIG_PROPS = PropsUtil.loadProps(ConfigConstant.CONFIG_FILE);

    public static String getJdbcDriver(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.JDBC_DRIVER);
    }

    public static String getJdbcUrl(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.JDBC_URL);
    }

    public static String getJdbcUsername(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.JDBC_USERNAME);
    }

    public static String getJdbcPassword(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.JDBC_PASSWORD);
    }

    public static String getAppBasePackage(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.APP_BASE_PACKAGE);
    }

    public static String getAppBaseJspPath(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.APP_BASE_JSP_PATH,"/WEB_INF/view/");
    }

    public static String getAppBaseAssetPath(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.APP_BASE_ASSET_PATH,"/WEB_INF/asset/");
    }

}
