package jp.gr.java_conf.kmine27.springboot.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.gr.java_conf.kmine27.springboot.sample.domain.Message;

@Mapper
public interface MessageMapper {

	@Insert("insert into message_table ( message ) values ( #{message} )")
	void create(String message);

	@Select("select id, message from message_table order by id")
	List<Message> findAll();
}
