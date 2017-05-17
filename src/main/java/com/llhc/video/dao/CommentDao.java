package com.llhc.video.dao;

import java.util.List;

import com.llhc.video.bean.Comment;

public interface CommentDao {

	public List<Comment> getCommentsByUid(Integer uid);
	
	public List<Comment> getCommentsByVid(Integer vid);
	
	public Integer addComment(Comment comment);
	
	public Integer updateAgree(Comment comment);
	
	public Integer updateOppose(Comment comment);
	
	public Integer deleteCommentById(Integer cid);
}
