package com.thoughtworks.ketsu.infrastructure.records;

import com.google.inject.AbstractModule;
import com.thoughtworks.ketsu.domain.product.ProductRepository;
import com.thoughtworks.ketsu.infrastructure.ParameterCheck;
import com.thoughtworks.ketsu.infrastructure.repository.ProductRepositoryImpl;
import com.thoughtworks.ketsu.infrastructure.repository.UserRepository;

public class Models extends AbstractModule {

    @Override
    protected void configure() {
        ParameterCheck parameterCheck = new ParameterCheck();
        bind(ProductRepository.class).to(ProductRepositoryImpl.class);
        bind(ParameterCheck.class).toInstance(parameterCheck);
        UserRepository userRepository = new UserRepository();
        bind(UserRepository.class).toInstance(userRepository);
    }

}
