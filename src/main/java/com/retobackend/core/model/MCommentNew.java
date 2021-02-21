package com.retobackend.core.model;


	public class MCommentNew {
		private Integer postId;
		private Integer id;
		private String email;
		
		public MCommentNew(MComment mComment){
			this.postId=mComment.getPostId();
			this.id=mComment.getId();
			this.email=mComment.getEmail();
		}
		
		public Integer getPostId() {
			return postId;
		}
		public void setPostId(Integer postId) {
			this.postId = postId;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}

		
		
	}

