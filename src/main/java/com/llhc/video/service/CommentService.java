package com.llhc.video.service;

import java.util.List;
import com.llhc.video.bean.Comment;

public interface CommentService {
	
	public List<Comment> findManagersByVid(Integer vid);
	
	public Integer addComment(Comment comment);
}
