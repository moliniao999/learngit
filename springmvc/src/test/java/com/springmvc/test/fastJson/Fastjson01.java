package com.springmvc.test.fastJson;

import java.util.Date;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Fastjson01 {
	//对象和json字符串互转
	public static void test01(){
		//对象转化json字符串
		JsonVO j = new JsonVO();
		j.setId(1);
		j.setName("wesley");
		String text1 = "";
		text1 = JSON.toJSONString(j);
		System.out.println(text1);
		 
		String text2 = JSON.toJSONString(j, SerializerFeature.UseSingleQuotes);
		System.out.println(text2);
		//json字符串转对象
		JsonVO vo =   JSON.parseObject(text2,JsonVO.class);
		System.out.println(vo.getName());
	}
	//日期格式
	public static void testDateFormat(){
		long  millis = 1324138987429L;
		Date date = new  Date(millis);   
		//日期类型转化字符串
		String d1 = JSON.toJSONString(date, SerializerFeature.WriteDateUseDateFormat);
		String d2 = JSON.toJSONStringWithDateFormat(date,"yyyy-MM-dd hh:mm:ss");
		System.out.println(d1);
		System.out.println(d2);
	}
	//A注入B
	public static void test02(){
		//对象转json
		 A a = new A();
		 B b = new B();
		 a.setB(b);
		 String aJson = JSON.toJSONString(a);
		 System.out.println(aJson);
		 //json转对象
		 A vo = JSON.parseObject(aJson,A.class);
		 System.out.println(vo.getName());
		 System.out.println(vo.getB().getBname());
	}
	public static void main(String[] args) {
//		Fastjson01.test01();
//		Fastjson01.testDateFormat();
		Fastjson01.test02();
	}
	
//	泛型的反序列化
//	如果你需要返回一个带泛型的对象，例如List<User>、Map<String, User>，你可以使用TypeReference来传入类型信息。
//
//	String text = ...; // {"name":{"name":"ljw",age:18}}
//	Map<String, User> userMap = JSON.parseObject(text, new  TypeReference<Map<String, User>>() {});
//
//	组合类型集合的反序列化
//	比如在网络协议中，经常会存在这样的组合:
//
//	[{/*header*/}, {/*body*/}]
//
//	fastjson对这种结构的反序列化有专门支持。
//
//
//
//	String text = ...; // [{/* header */}, {/* body */}]
//
//
//	Type[] types = new  Type[] {Header.class, Body.class};
//
//	List<Object> list = JSON.parseArray(text, types);
//
//
//	Header header = (Header) list.get(0);
//
//
//	Body body = (Body) list.get(1);
//
//	使用@JSONCreator来指定构造函数来创建对象
//	如果你的JavaBean没有缺省构造函数，可以使用@JSONCreator来指定构造函数
//
//	public  static  class  Entity {
//	    private  final  int     id;
//	    private  final  String name;
//
//	    @JSONCreator
//
//
//	    public  Entity(@JSONField(name = "id") int  id, @JSONField(name = "name") String name){
//	        this.id = id;
//	        this.name = name;
//
//	    }
//
//	    public  int  getId() { return  id; }
//
//	    public  String getName() { return  name; }
//	}
//
//	把JSON文本反序列化为一个原型接口
//
//	public  static  interface  Bean {
//
//	    int  getId();
//
//	    void  setId(int  value);
//
//	    String getName();
//
//	    void  setName(String value);
//
//	}
//
//
//	String text = "{\"id\":123, \"name\":\"chris\"}";
//
//	Bean bean = JSON.parseObject(text, Bean.class);
//
//	// 按接口调用
//	Assert.assertEquals(123, bean.getId());
//	Assert.assertEquals("chris", bean.getName());
//
//	bean.setId(234);
//	Assert.assertEquals(234, bean.getId());

}
