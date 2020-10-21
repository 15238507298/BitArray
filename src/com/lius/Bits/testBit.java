package com.lius.Bits;

import java.util.Arrays;
import java.util.List;

public class testBit {

private byte[] bitArrays;
public static void main(String[] args) {
	testBit t = new testBit();
//	t.insertValue(1238);
//	t.insertValue(1239);
//	t.insertValue(1241);
//	t.insertValue(1240);
//	t.insertValue(1140);
//
//	t.getBitStrOne();
//	System.out.println(8>>3&1);
	BitArray ba = new BitArray();
	ba.init();
	ba.set(119);
	ba.set(120);
	ba.set(121);
	System.out.println(ba.get(119).ordinal());
	//	System.out.println(Arrays.toString(t.bitArrays));
//	t.getBitStr();
//	System.out.println(25&7); // 25%8
//	System.out.println(2<<7); //2的8次方
	//12  
	//1100
//	System.out.println(12|);
//	System.out.println(1<<);
}

//插入值
public boolean insertValue(long value) {
	int bLen = (int) (value>>3)+1;
	if(bitArrays==null) {
		bitArrays = new byte[bLen];

	}else if(bitArrays.length<bLen) {
		byte[] bitArraysNew = new byte[bLen];
		for(int i =0;i<bitArrays.length;i++) {
			bitArraysNew[i] = bitArrays[i];
		}
		bitArrays = bitArraysNew;
	}
	value = value&7; //value%8
	int a = 1<<value;
	bitArrays[bLen-1]|= a;
	getBitStr(bitArrays[bLen-1]);
	System.out.println(bLen-1);
	return true;
}

//取值1
public String getBitStrOne() {
	StringBuffer sbf = new StringBuffer();
	for(int i = 0;i<bitArrays.length;i++) {
		byte a = bitArrays[i];
//		System.out.println(i+"lll");
		List<String> listStr = getBitStr(a);
		for(int x =listStr.size()-1;x>=0;x--) {
			if(listStr.get(x).equals("1")) {
				System.out.print(8*i+(7-x)+" ");
			}
		}
		
	}
	return sbf.toString();
}
//取值
public List<String> getBitStr(byte param) {
	byte b = 0;
	StringBuffer ab = new StringBuffer();
	for(int i =7 ;i>=0;i--) {
		b = (byte) (param>>i); 	//   a/(2^i)
		ab.append(b&1);			// 2取模
	};
	List<String> list = Arrays.asList(ab.toString().split(""));
//	System.out.println(String.join(" ", list));
	return list;
}
public void init() {
	byte[] result = new byte[8];
	int bLen = result.length;
	byte a = 2;
	// 0 0 0 0 0 0 1 0
	while(a!=1) {
		result[bLen-(a/=2)-1] = 1;
	}
	System.out.println(Arrays.toString(result));

}

//获取bits数组中的数
public bit getBitByIndex(long index) {
	long size = index>>(2<<3);
	if((index^(index-1))==1) {
		
	}
	return bit.One;
};
}