package com.llhc.video.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llhc.video.bean.Comment;
import com.llhc.video.dao.CommentDao;
import com.llhc.video.service.CommentService;

@Service
public class CommentSeriuceImpl implements CommentService {

	@Autowired
	private CommentDao commentDao;
	public List<Comment> findManagersByVid(Integer vid) {
		
		return commentDao.getCommentsByVid(vid);
	}

}
