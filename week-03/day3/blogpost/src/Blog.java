public class Blog {
    public static void main(String[] args) {
        BlogPost blogPost = new BlogPost();
        blogPost.author = "John Doe";
        blogPost.title = "Lorem Ipsum";
        blogPost.text = "Lorem ipsum dolor sit amet.";
        blogPost.date = "2000.05.04.";

        BlogPost blogPost1 = new BlogPost();
        blogPost1.author = "Tim Urban";
        blogPost1.title = "Wait but why";
        blogPost1.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        blogPost1.date = "2010.10.10.";

        BlogPost blogPost2 = new BlogPost();
        blogPost2.author = "William Turton";
        blogPost2.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        blogPost2.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " +
                "When I asked to take his picture outside one of IBM’s New York City offices, " +
                "he told me that he wasn’t really into the whole organizer profile thing.";
        blogPost2.date = "2017.03.28";

        System.out.println(blogPost.toString() + blogPost1.toString() + blogPost2.toString());
    }
}
