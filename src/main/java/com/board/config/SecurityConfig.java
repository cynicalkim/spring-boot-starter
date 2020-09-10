package com.board.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
//	@Autowired
//    private ReaderRepository readerRepository;
//	
//	@Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable() //security�� �⺻�ɼ��� csrf ��ū �ʼ��� �Ǿ��־�, ���� ȯ�濡�� ���ʿ��Ͽ� off
//                .authorizeRequests()
//                .antMatchers("/").access("hasRole('READER')") // root path���� READER ������ �ʿ��ϴ�
//                .antMatchers("/**").permitAll() // root�ܿ� �ٸ� path���� ������ �ʿ����
//
//                .and()
//
//                .formLogin()
//                .loginPage("/login") //�⺻���� �������� login �������� url�� /login���� �����Ѵ�
//                .failureUrl("/login?error=true");
//
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        /*
//            �α����� �õ��� ����ڰ� ��ϵ� ��������� �����ϴ� ����
//            JDBC, LDAP, �θ޸𸮵��� ����� �ɼ��� �����ؼ� ����Ѵ�
//            ���⼱ JPA�� �̿��� DB������� ����
//         */
//        auth.userDetailsService(username -> readerRepository.findOne(username));
//    }

}
