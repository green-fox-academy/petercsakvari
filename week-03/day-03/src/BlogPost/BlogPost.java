package blogpost;

//Create a blogpost class that has
//        an authorName
//        a title
//        a text
//        a publicationDate

public class BlogPost {

  private String authorName;
  private String title;
  private String text;
  private String publicationDate;

  public BlogPost(String authorName, String title, String text, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
  }
}
