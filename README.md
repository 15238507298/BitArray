# Bit级别布隆过滤器(JAVA)
操作Bit数组实现Bit级别的布隆过滤器

/**使用说明
BitArray ba = new BitArray();  //创建Bit数组对象\r\n
	ba.init();                   //初始化Bit数组对象，默认为 new Bit[8];\r\n
	ba.set(119);                 //往Bit数组set值，如果值过大，BitArray会自动进行扩充\r\n
	ba.set(120);                 ...\r\n
	ba.set(121);                 ...\r\n
	System.out.println(ba.get(119).ordinal());  //获取值，如果Bit数组存在该值，会返回Bit.One(1)\r\n
  /////  2020-10-21
