1.什么是SpringMVC 它是基于MVC开发模式的框架,用来优化控制器.它是Spring家家族的一员.它也具备IOC和AOP 什么是MVC? 它是一种开发模式,它是模型视图控制器的简称.所有的Jweb应用都是基于MVC开发. M:
模型层,包含实体类,业务逻辑层,数据访问层 V:视图层,html,javascript,vue等都是视图层,用来显现数据 C:控制器,它是用来接收客户端的请求,并返回响应到到客户端的组件,Servlet就是组件

2.SpringMVC框架的优点 1)轻量级,基于MVC的框架 2)易于上手,容易理解,功能强大 3)它具备IOC和AOP 4)完全基于注解开发

3.基于注解的SpringMVC框架开发的步骤 1)新建项目,选择webapp模板. 2)修改目录,添加缺失的test,java,resources(两套),并修改目录属性 3)
修改pom.xml文件,添加SpringMVC的依赖,添加Servlet的依赖颜 4)添加springmvc.xml配置文件,指定包扫描,添加视图解析器. 5)删除web.xml文件,新建web.xml 6)
在web.xml文件中注册springMVC框架(所有的web请求都是基于servlet的)
7)在webapp目录下新建admin目录,在admin目录下新建main.jsp页面,删除index.jsp页面,并新建,发送请求给服务器 8)开发控制器(Servlet),它是一个普通的类. 9)添加tomcat进行测试功能

web请求执行的流程 index.jsp<---------->DispatcherServlet<---------->SpringMVC的处理器是一个普通的方法
