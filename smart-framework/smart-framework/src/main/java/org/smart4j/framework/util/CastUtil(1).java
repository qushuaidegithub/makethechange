package org.smart4j.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by lenovo on 2017/5/7.
 */
public final class CastUtil {
    public static String castString(Object obj){
        return CastUtil.castString(obj,"");
    }
    public static String castString(Object obj,String defaultVaule){
        return obj!=null?String.valueOf(obj):defaultVaule;
    }

    public static double castDouble(Object obj){
        return CastUtil.castDouble(obj,0);
    }
    public static double castDouble(Object obj,double defaultVaule){
        double doubleValue = defaultVaule;
        if(obj!=null){
            String strValue = castString(obj);
            if(StringUtils.isNotEmpty(strValue)){
                try{
                    doubleValue=Double.parseDouble(strValue);
                }catch(NumberFormatException e){
                    doubleValue=defaultVaule;
                }
            }
        }
        return doubleValue;
    }

    public static long castLong(Object obj){
        return CastUtil.castLong(obj,0);
    }
    public static long castLong(Object obj,long defaultVaule){
        long longValue = defaultVaule;
        if(obj!=null){
            String strValue = castString(obj);
            if(StringUtils.isNotEmpty(strValue)){
                try{
                    longValue=Long.parseLong(strValue);
                }catch(NumberFormatException e){
                    longValue=defaultVaule;
                }
            }
        }
        return longValue;
    }

    public static int castInt(Object obj){
        return CastUtil.castInt(obj,0);
    }
    public static int castInt(Object obj,int defaultVaule){
        int intValue = defaultVaule;
        if(obj!=null){
            String strValue = castString(obj);
            if(StringUtils.isNotEmpty(strValue)){
                try{
                    intValue=Integer.parseInt(strValue);
                }catch(NumberFormatException e){
                    intValue=defaultVaule;
                }
            }
        }
        return intValue;
    }

    public static boolean castBoolean(Object obj){
        return CastUtil.castBoolean(obj,false);
    }
    public static boolean castBoolean(Object obj,boolean defaultVaule){
        boolean booleanValue = defaultVaule;
        if(obj!=null){
            booleanValue=Boolean.parseBoolean(castString(obj));
        }
        return booleanValue;
    }
}
