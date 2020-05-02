package com.example.demo.thymeleaf.dialect.propertiesPerSiteType;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thymeleaf.context.IExpressionContext;
import org.thymeleaf.dialect.IExpressionObjectDialect;
import org.thymeleaf.expression.IExpressionObjectFactory;

@Component
public class PropertiesPerSiteTypeDialect implements IExpressionObjectDialect {

    @Autowired
    private PropertiesPerSiteType propertiesPerSiteType;

    private static final String EXPRESSION_NAME = "propertiesPerSiteType";

    private static final Set<String> ALL_EXPRESSION_NAMES = new HashSet<String>() {
        {
            add(EXPRESSION_NAME);
        }
    };

    @Override
    public IExpressionObjectFactory getExpressionObjectFactory() {
        return new IExpressionObjectFactory() {
            @Override
            public Set<String> getAllExpressionObjectNames() {
                return ALL_EXPRESSION_NAMES;
            }

            @Override
            public Object buildObject(IExpressionContext context, String expressionObjectName) {
                if(expressionObjectName.equals(EXPRESSION_NAME)){
                    return propertiesPerSiteType;
                }
                return null;
            }

            @Override
            public boolean isCacheable(String expressionObjectName) {
                return false;
            }
        };
    }

    @Override
    public String getName() {
        return "propertiesPerSiteType";
    }
}