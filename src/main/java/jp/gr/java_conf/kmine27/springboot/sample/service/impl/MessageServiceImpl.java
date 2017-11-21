package jp.gr.java_conf.kmine27.springboot.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.gr.java_conf.kmine27.springboot.sample.domain.Message;
import jp.gr.java_conf.kmine27.springboot.sample.repository.MessageRepository;
import jp.gr.java_conf.kmine27.springboot.sample.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageRepository repository;

	@Transactional
	@Override
	public void create(String message) {
		repository.create(message);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Message> findAll() {
		return repository.findAll();
	}

}
