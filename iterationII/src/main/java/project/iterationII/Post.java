package project.iterationII;
/*
 * This is the interface for the post windows, which will be inherit and implements
 * by three sub-post windows: RequestPost, SellPost, and BidPost.
 */
public interface Post {
	public void setDescription(String description);
	public String getDescription();
}
