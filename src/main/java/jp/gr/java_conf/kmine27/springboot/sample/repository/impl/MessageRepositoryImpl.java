package jp.gr.java_conf.kmine27.springboot.sample.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.gr.java_conf.kmine27.springboot.sample.domain.Message;
import jp.gr.java_conf.kmine27.springboot.sample.mapper.MessageMapper;
import jp.gr.java_conf.kmine27.springboot.sample.repository.MessageRepository;

@Repository
public class MessageRepositoryImpl implements MessageRepository {

	@Autowired
	private MessageMapper mapper;

	@Override
	public void create(String message) {
		mapper.create(message);
	}

	@Override
	public List<Message> findAll() {
		return mapper.findAll();
	}

}
