# Bit级别布隆过滤器(JAVA)
操作Bit数组实现Bit级别的布隆过滤器

/**使用说明
BitArray ba = new BitArray();  //创建Bit数组对象<br>
	ba.init();                   //初始化Bit数组对象，默认为 new Bit[8];<br>
	ba.set(119);                 //往Bit数组set值，如果值过大，BitArray会自动进行扩充<br>
	ba.set(120);                 ...<br>
	ba.set(121);                 ...<br>
	System.out.println(ba.get(119).ordinal());  //获取值，如果Bit数组存在该值，会返回Bit.One(1)<br>
  /////  2020-10-21<br>
  
  <h3><a href="https://blog.csdn.net/qq_39663113" style="text-decoration='none';">欢迎关注本人博客</a></h3>
