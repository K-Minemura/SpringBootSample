package jp.gr.java_conf.kmine27.springboot.sample.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class MessageForm {

    @NotEmpty
    @Size(max = 100)
    private String msg;
}
