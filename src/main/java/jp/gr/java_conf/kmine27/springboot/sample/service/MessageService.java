package jp.gr.java_conf.kmine27.springboot.sample.service;

import java.util.List;

import jp.gr.java_conf.kmine27.springboot.sample.domain.Message;

public interface MessageService {

	void create(String message);

	List<Message> findAll();
}
