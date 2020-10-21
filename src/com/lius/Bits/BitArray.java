package com.lius.Bits;

public class BitArray implements BitCommon {
	
	private byte[] bitArrays;
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		bitArrays = (bitArrays==null?new byte[1]:bitArrays);
	}

	@Override
	public boolean set(long value) {
		// TODO Auto-generated method stub
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
		return true;
	}

	@Override
	public bit get(long index) {
		// TODO Auto-generated method stub
		int position = (int) (index>>3);
		if(bitArrays==null || bitArrays.length<position){
			return null;
		}
		byte b = bitArrays[position];
		int bIndex = (int) (index&7);
		return (b>>(bIndex)&1)==1?bit.One:bit.Zero;
	}

}
