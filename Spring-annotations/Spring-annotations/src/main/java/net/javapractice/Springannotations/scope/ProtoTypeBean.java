package net.javapractice.Springannotations.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ProtoTypeBean {
    public ProtoTypeBean()
    {
        System.out.println("ProtoTypeBean");
    }
}
