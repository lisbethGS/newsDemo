package hackernews.example.domain;

public class _highlightResult {
	 Author AuthorObject;
	 Comment_text Comment_textObject;
	 Story_title Story_titleObject;
	 Story_url Story_urlObject;


	 // Getter Methods 

	 public Author getAuthor() {
	  return AuthorObject;
	 }

	 public Comment_text getComment_text() {
	  return Comment_textObject;
	 }

	 public Story_title getStory_title() {
	  return Story_titleObject;
	 }

	 public Story_url getStory_url() {
	  return Story_urlObject;
	 }

	 // Setter Methods 

	 public void setAuthor(Author authorObject) {
	  this.AuthorObject = authorObject;
	 }

	 public void setComment_text(Comment_text comment_textObject) {
	  this.Comment_textObject = comment_textObject;
	 }

	 public void setStory_title(Story_title story_titleObject) {
	  this.Story_titleObject = story_titleObject;
	 }

	 public void setStory_url(Story_url story_urlObject) {
	  this.Story_urlObject = story_urlObject;
	 }
	}
