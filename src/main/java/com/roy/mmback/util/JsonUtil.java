package com.roy.mmback.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class JsonUtil {
	
	//自动清除循环引用判断
	public static String toJsonString(Object obj) {
		return JSON.toJSONString(obj,SerializerFeature.DisableCircularReferenceDetect);
	}
}
