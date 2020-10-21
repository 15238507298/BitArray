# BitArray
操作Bit数组实现Bit数据set&amp;get操作

/**使用说明
BitArray ba = new BitArray();  //创建Bit数组对象
	ba.init();                   //初始化Bit数组对象，默认为 new Bit[8];
	ba.set(119);                 //往Bit数组set值，如果值过大，BitArray会自动进行扩充
	ba.set(120);                 ...
	ba.set(121);                 ...
	System.out.println(ba.get(119).ordinal());  //获取值，如果Bit数组存在该值，会返回Bit.One(1)
  /////  2020-10-21
