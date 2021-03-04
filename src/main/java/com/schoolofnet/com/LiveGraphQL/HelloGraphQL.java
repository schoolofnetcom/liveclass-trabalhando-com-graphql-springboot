package com.schoolofnet.com.LiveGraphQL;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class HelloGraphQL implements GraphQLQueryResolver {
    public String sayHello() {
        return "Hello from GraphQL";
    }
}
