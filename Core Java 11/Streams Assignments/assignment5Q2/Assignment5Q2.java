package assignment5Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


class News {
	private int newsId;
	private String postedByUser;
	private String commentByUser;
	private String comment;

	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}

	public int getNewsId() {
		return newsId;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public String getComment() {
		return comment;
	}
}

public class Assignment5Q2 {
//	public static int maxComments(List<News> news) {
//		int maxComm = news.stream().map(p->p.getNewsId().co).max(Integer::compare).get();
//		return maxComm;
//	}

	public static int budgetCount(List<News> news) {
		long budget = news.stream().filter(p->p.getComment().contains("budget")).count();
		return (int)budget;
	}

	public static String maxCommentsByUser(List<News> news) {
		String str=news.stream().filter(p->p.getCommentByUser().)
	}

//	public static Map<String, Integer> sortMaxCommentsByUser(List<News> news) {
//		
//	}

	public static void main(String[] args) {
		List<News> news = new ArrayList<News>(Arrays.asList(
				new News(1161, "Nitesh", "Satyam", "This budget will really help"),
				new News(1165, "Nobita", "Shinchan", "Very good budget"),
				new News(1161, "Nitesh", "Shinchan", "Excellent bill"), new News(1168, "Gautam", "Mohit", "Ok Report!")));

		//System.out.println("Find out the newsId which has received maximum comments. " + maxComments(news));
		
		System.out.println("\nFind out how many times the word 'budget' arrived in user comments all news: " + budgetCount(news));
		
		System.out.println("\nFind out which user has posted maximum comments: " + maxCommentsByUser(news));
		
		//System.out.println("\nDisplay commentByUser wise number of comments: " + sortMaxCommentsByUser(news))
		
	}
}