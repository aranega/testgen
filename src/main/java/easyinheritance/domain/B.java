package easyinheritance.domain;

import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "B_SEQ")
public class B {

    @NotNull
    private String attribute2;

    @NotNull
    private String Myattribute;

    @OneToOne
    private D d;
}
