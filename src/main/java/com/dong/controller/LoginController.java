package com.dong.controller;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dong.controller.common.Utils;
import com.dong.entity.User;
import com.dong.form.InputMoney;
import com.dong.form.Session;
import com.dong.service.UserService;
import com.dong.serviceImpl.UserserviceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/user")
public class LoginController {
	@Autowired
	UserService userService;

	@RequestMapping("/allUser")
	public String searchUser() throws IOException {
//		String postUrl = "https://blog.csdn.net/woxueliuyun/article/details/43267365";
//		URL url = new URL(postUrl);
//		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//		// POSTに指定
//		connection.setRequestMethod("GET");
//		// アウトプット可能
//		connection.setDoOutput(true);
//		// 入力可能
//		connection.setDoInput(true);
//		// cache無し
//		connection.setUseCaches(false);
//		// データタイプをjsonに指定する
//		connection.setRequestProperty("Content-Type", "application/json;charset=utf-8");
//		// コネクション、通信開始
//		connection.connect();
//		// jsonデータを出力ストリームへ書き出す
////		String body = "userName=hyman1993&password=123456";
////		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream(), "UTF-8"));
////		writer.write(body);
////		writer.close();

		
		ObjectMapper oo = new ObjectMapper();

		Map<String,String> json=new HashMap<String,String>();
		
		json.put("name", "zhang san");
		
		String jsonString=oo.writeValueAsString(json);
		
		
		Map<String, Object> va=	jsonStringToMap(jsonString);
		
	 String name=	(String) va.get("name");
		
		System.out.println(name);
		
		

		return null;
//
//		List<User> userList = userService.getAllUser();
//
//		for (User user : userList) {
//
//			System.out.println(user.getUserAddress());
//		}
//		return "pages/success";
//	
	}
	/**
	 * JSON文字列をMapに
	 * @param json json文字列
	 * @return json文字列を読み込んだMapオブジェクト。失敗した場合はnull
	 */
	public Map<String, Object> jsonStringToMap(String json) {
		Map<String, Object> map = null;

		// com.fasterxml.jackson.databind.ObjectMapperを使います
		ObjectMapper mapper = new ObjectMapper();

		try {
			// キーがString、値がObjectのマップに読み込みます。
			map = mapper.readValue(json, new TypeReference<Map<String, Object>>(){});
		} catch (Exception e) {
			// エラー！
			e.printStackTrace();
		}

		return map;
	}
}
