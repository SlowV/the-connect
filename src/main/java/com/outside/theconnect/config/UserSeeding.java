package com.outside.theconnect.config;

import com.outside.theconnect.domain.*;
import com.outside.theconnect.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserSeeding implements ApplicationListener<ApplicationReadyEvent> {
    private final static Logger LOGGER = LoggerFactory.getLogger(UserSeeding.class);
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        seedingUser();
    }

    private void seedingUser() {
//        if (userRepository.findAll().size() <= 0) {
//            LOGGER.info("Start seeding...");
//            userRepository.disableForeignKeyCheck();
//            userRepository.resetIncrement();
//            User user = User.builder().email("admin@gmail.com")
//                    .password(passwordEncoder.encode("admin"))
//                    .status(1).build();
//            UserInfo userInfo = UserInfo.builder()
//                    .age(20)
//                    .dob(new Date(1998, 02, 27))
//                    .avatar(Image.builder()
//                            .url("https://thuthuatnhanh.com/wp-content/uploads/2019/05/gai-xinh-toc-ngan-facebook.jpg")
//                            .build())
//                    .gender(1)
//                    .firstName("Viet")
//                    .lastName("Trinh")
//                    .introduce("Dep trai")
//                    .user(user)
//                    .address(Address.builder()
//                            .location("252 phuc dien")
//                            .district(District.builder()
//                                    .name("Xuan Phuong")
//                                    .province(Province.builder()
//                                            .name("Ha Noi")
//                                            .country(Country.builder()
//                                                    .name("Viet Nam")
//                                                    .build())
//                                            .build())
//                                    .build())
//                            .build())
//                    .build();
//            user.setUserInfo(userInfo);
//            userRepository.save(user);
//            userRepository.enableForeignKeyCheck();
//            LOGGER.info("Seeding success!");
//        }
    }
}
