package beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component // will add this clas in the context, but spring doesn't searches by default for components
public class MyBean {

    private String text;

    @PostConstruct
    private void init(){
        this.text = "Hello";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
