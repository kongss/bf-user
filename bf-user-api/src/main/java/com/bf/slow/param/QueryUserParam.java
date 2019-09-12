package com.bf.slow.param;

import java.io.Serializable;

/**
 * xx
 *
 * @author kongshuaishuai
 * Created on 2019/5/20 12:48
 * Email is kongshuaishuai@mrfresh.com
 * Copyright is 北京滴哩网络科技有限公司
 */
public class QueryUserParam implements Serializable {
/*
MAP和实体类作为参数的优缺点比较

1、map的优点：
    1、灵活性强于javabean，易扩展，耦合度低。
    2、写起来简单，代码量少。
    3、mybatis 查询的返回结果本身就是MAP，可能会比返回javabean快

2、map的缺点
    1、javabean在数据输入编译期就会对一些数据类型进行校验，如果出错会直接提示。而map的数据类型则需要到sql层，才会进行处理判断。
    2、map的参数名称如果写错，也是需要到sql层，才能判断出是不是字段写错，不利于调试等。相对而言javabean会在编译期间发现错误
    3、map的参数值如果多传、乱传，也是需要到sql层，才能判断出是不是字段写错，不利于调试等。相对而言javabean会在编译期间发现错误
    4、仅仅看方法签名，你不清楚Map中所拥有的参数个数、类型、每个参数代表的含义。 后期人员去维护，例如需要加一个参数等，如果项目
    层次较多，就需要把每一层的代码都了解清楚才能知道传递了哪些参数

3、Javabean的优点：
    1、面向对象的良好诠释、
    2、数据结构清晰，便于团队开发 & 后期维护。
    3、代码足够健壮，可以排除掉编译期错误

4、javabean的缺点：
    1、代码量增多，大量时间去封装用到的表对象。
    2、可能会影响开发效率。
*/
}
