package com.springmvc.test.fastJson;

import java.util.Date;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Fastjson01 {
	//�����json�ַ�����ת
	public static void test01(){
		//����ת��json�ַ���
		JsonVO j = new JsonVO();
		j.setId(1);
		j.setName("wesley");
		String text1 = "";
		text1 = JSON.toJSONString(j);
		System.out.println(text1);
		 
		String text2 = JSON.toJSONString(j, SerializerFeature.UseSingleQuotes);
		System.out.println(text2);
		//json�ַ���ת����
		JsonVO vo =   JSON.parseObject(text2,JsonVO.class);
		System.out.println(vo.getName());
	}
	//���ڸ�ʽ
	public static void testDateFormat(){
		long  millis = 1324138987429L;
		Date date = new  Date(millis);   
		//��������ת���ַ���
		String d1 = JSON.toJSONString(date, SerializerFeature.WriteDateUseDateFormat);
		String d2 = JSON.toJSONStringWithDateFormat(date,"yyyy-MM-dd hh:mm:ss");
		System.out.println(d1);
		System.out.println(d2);
	}
	//Aע��B
	public static void test02(){
		//����תjson
		 A a = new A();
		 B b = new B();
		 a.setB(b);
		 String aJson = JSON.toJSONString(a);
		 System.out.println(aJson);
		 //jsonת����
		 A vo = JSON.parseObject(aJson,A.class);
		 System.out.println(vo.getName());
		 System.out.println(vo.getB().getBname());
	}
	public static void main(String[] args) {
//		Fastjson01.test01();
//		Fastjson01.testDateFormat();
		Fastjson01.test02();
	}
	
//	���͵ķ����л�
//	�������Ҫ����һ�������͵Ķ�������List<User>��Map<String, User>�������ʹ��TypeReference������������Ϣ��
//
//	String text = ...; // {"name":{"name":"ljw",age:18}}
//	Map<String, User> userMap = JSON.parseObject(text, new  TypeReference<Map<String, User>>() {});
//
//	������ͼ��ϵķ����л�
//	����������Э���У�������������������:
//
//	[{/*header*/}, {/*body*/}]
//
//	fastjson�����ֽṹ�ķ����л���ר��֧�֡�
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
//	ʹ��@JSONCreator��ָ�����캯������������
//	������JavaBeanû��ȱʡ���캯��������ʹ��@JSONCreator��ָ�����캯��
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
//	��JSON�ı������л�Ϊһ��ԭ�ͽӿ�
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
//	// ���ӿڵ���
//	Assert.assertEquals(123, bean.getId());
//	Assert.assertEquals("chris", bean.getName());
//
//	bean.setId(234);
//	Assert.assertEquals(234, bean.getId());

}
