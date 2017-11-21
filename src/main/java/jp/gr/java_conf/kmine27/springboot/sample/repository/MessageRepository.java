package jp.gr.java_conf.kmine27.springboot.sample.repository;

import java.util.List;

import jp.gr.java_conf.kmine27.springboot.sample.domain.Message;

public interface MessageRepository {

	void create(String message);

	List<Message> findAll();
}
