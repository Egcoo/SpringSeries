//package com.apple.bank;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//
///**
// * @author Egcoo
// * @date 2023/6/22 - 11:25
// */
//
///**
// * 代替spring.xml 组件
// * 组件扫描
// * proxy-target-class="true" 表示强制使用CGLIB动态代理
// * proxy-target-class="false"这是默认值,表示接口使用JDK动态代理,反之使用CGLIB动态代理
// * 开启事务注解
// *
// * @author Egcoo
// */
//@Configuration
//@ComponentScan({"com.apple.bank"})
//@EnableTransactionManagement
//@EnableAspectJAutoProxy(proxyTargetClass = true)
//public class Spring6Config {
//
//    @Bean(name = "dataSource")
//    public DruidDataSource getDataSource() {
//        DruidDataSource druidDataSource = new DruidDataSource();
//        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        druidDataSource.setUrl("jdbc:mysql://localhost:3306/spring6?useUnicode=true&characterEncoding=utf8&useSSL=false");
//        druidDataSource.setUsername("root");
//        druidDataSource.setPassword("123456");
//        return druidDataSource;
//    }
//
//    /**
//     * //Spring在调用这个方法的时候会自动给我们传递过来一个datasource对象
//     * @param dataSource
//     * @return
//     */
//    @Bean(name = "jdbcTemplate")
//    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
//        jdbcTemplate.setDataSource(dataSource);
//        return jdbcTemplate;
//    }
//
//    @Bean(name = "txManager")
//    public DataSourceTransactionManager getTransactionManager(DataSource dataSource) {
//        DataSourceTransactionManager txManager = new DataSourceTransactionManager();
//        txManager.setDataSource(dataSource);
//        return txManager;
//    }
//}
//
