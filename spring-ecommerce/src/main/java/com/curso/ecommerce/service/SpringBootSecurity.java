package com.curso.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringBootSecurity {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        // Solo estas dos rutas requieren ser ADMIN
                        .requestMatchers("/administrador/**").hasAuthority("ADMIN")
                        .requestMatchers("/productos/**").hasAuthority("ADMIN")

                        // TODO lo demás (Home, Carrito, Usuario, CSS, etc.) se permite a cualquiera
                        .anyRequest().permitAll()
                )
                .formLogin(form -> form
                        .loginPage("/usuario/login")
                        .defaultSuccessUrl("/usuario/acceder")
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/usuario/logout")
                        .logoutSuccessUrl("/")
                        .permitAll()
                );

        return http.build();
    }

    @Bean
    public BCryptPasswordEncoder getEncoder() {
        return new BCryptPasswordEncoder();
    }

}
