package cn.comelo.datasource;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = PrimaryDatasourceConfig.PACKAGE,sqlSessionFactoryRef = "primarySqlSessionFactory")
public class PrimaryDatasourceConfig {

    static final String PACKAGE = "cn.comelo.ehrsp.mapper";

    @Bean(name = "primaryDataSource")
    @Primary
    @ConfigurationProperties(prefix = "hikari.primary")
    public HikariDataSource dataSource() {
        return new HikariDataSource();
    }

    @Bean(name = "primaryTransactionManager")
    @Primary
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(this.dataSource());
    }

    @Bean(name = "primarySqlSessionFactory")
    @Primary
    public SqlSessionFactory sqlSessionFactory(@Qualifier("primaryDataSource") DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        //sessionFactory.setMapperLocations(
        //        new PathMatchingResourcePatternResolver().getResources("classpath*:ehrsp/mapper/*.xml"));
        return sessionFactory.getObject();
    }
}
